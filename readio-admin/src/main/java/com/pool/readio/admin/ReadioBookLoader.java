package com.pool.readio.admin;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pool.readio.admin.dao.BmsAuthorDao;
import com.pool.readio.admin.service.BmsBookService;
import com.pool.readio.admin.service.BmsAuthorService;
import com.pool.readio.admin.service.BmsPublisherService;
import com.pool.readio.mbg.mapper.BmsBookAuthorRelationMapper;
import com.pool.readio.mbg.mapper.BmsBookMapper;
import com.pool.readio.mbg.mapper.BmsPublisherMapper;
import com.pool.readio.mbg.model.BmsAuthor;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookAuthorRelation;
import com.pool.readio.mbg.model.BmsBookAuthorRelationExample;
import com.pool.readio.mbg.model.BmsBookExample;
import com.pool.readio.mbg.model.BmsPublisher;
import com.pool.readio.mbg.model.BmsPublisherExample;
import com.pool.readio.mbg.mongo.BookContent;
import com.pool.readio.mbg.mongo.BookContentRepository;
import com.pool.readio.mbg.mongo.ChapterItem;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 从指定目录加载 JSON 格式的书籍到数据库。
 * 书籍元信息写入 PostgreSQL，完整内容（JSON）写入 MongoDB。
 * 启动时若传入 <code>--book-dir=/path/to/json/dir</code> 则执行加载。
 */
@Component
@Order(100)
public class ReadioBookLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ReadioBookLoader.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final BmsBookMapper bmsBookMapper;
    private final BmsAuthorDao bmsAuthorDao;
    private final BmsPublisherMapper bmsPublisherMapper;
    private final BmsBookAuthorRelationMapper bmsBookAuthorRelationMapper;
    private final BmsBookService bmsBookService;
    private final BmsAuthorService bmsAuthorService;
    private final BmsPublisherService bmsPublisherService;
    private final BookContentRepository bookContentRepository;
    private final GridFsTemplate bookContentGridFsTemplate;

    public ReadioBookLoader(
            BmsBookMapper bmsBookMapper,
            BmsAuthorDao bmsAuthorDao,
            BmsPublisherMapper bmsPublisherMapper,
            BmsBookAuthorRelationMapper bmsBookAuthorRelationMapper,
            BmsBookService bmsBookService,
            BmsAuthorService bmsAuthorService,
            BmsPublisherService bmsPublisherService,
            BookContentRepository bookContentRepository,
            @Qualifier("bookContentGridFsTemplate") GridFsTemplate bookContentGridFsTemplate) {
        this.bmsBookMapper = bmsBookMapper;
        this.bmsAuthorDao = bmsAuthorDao;
        this.bmsPublisherMapper = bmsPublisherMapper;
        this.bmsBookAuthorRelationMapper = bmsBookAuthorRelationMapper;
        this.bmsBookService = bmsBookService;
        this.bmsAuthorService = bmsAuthorService;
        this.bmsPublisherService = bmsPublisherService;
        this.bookContentRepository = bookContentRepository;
        this.bookContentGridFsTemplate = bookContentGridFsTemplate;
    }

    @Override
    public void run(String... args) {
        String bookDir = parseBookDir(args);
        if (bookDir == null || bookDir.isEmpty()) {
            return;
        }
        Path dir = Paths.get(bookDir);
        if (!Files.isDirectory(dir)) {
            log.warn("Book dir is not a directory or does not exist: {}", bookDir);
            return;
        }
        loadBooksFromDirectory(dir);
    }

    private String parseBookDir(String[] args) {
        if (args == null) {
            return null;
        }
        for (String arg : args) {
            if (arg != null && arg.startsWith("--book-dir=")) {
                return arg.substring("--book-dir=".length()).trim();
            }
            if ("--book-dir".equals(arg)) {
                break;
            }
        }
        return null;
    }

    private void loadBooksFromDirectory(Path dir) {
        List<Path> jsonFiles;
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.json")) {
            jsonFiles = new ArrayList<>();
            for (Path file : stream) {
                if (Files.isRegularFile(file)) {
                    jsonFiles.add(file);
                }
            }
        } catch (IOException e) {
            log.error("Error listing book directory: {}", dir, e);
            return;
        }
        int total = jsonFiles.size();
        if (total == 0) {
            log.info("[书籍加载] 目录下未发现 JSON 文件: {}", dir);
            return;
        }
        final int defaultCategoryId = 0;
        log.info("[书籍加载] ======== 共发现 {} 个 JSON 文件，开始处理（默认书籍分类 id={}）======== ", total, defaultCategoryId);
        int loadedCount = 0;
        for (int i = 0; i < total; i++) {
            Path file = jsonFiles.get(i);
            int current = i + 1;
            int remaining = total - current;
            try {
                if (loadOneBook(file, current, total, defaultCategoryId)) {
                    loadedCount++;
                }
            } catch (Exception e) {
                log.error("[书籍加载] [{}/{}] 处理失败 (剩余 {} 本): {} - {}", current, total, remaining, file.getFileName(), e.getMessage(), e);
            }
        }
        log.info("[书籍加载] ======== 完成。共处理 {} 本，新入库 {} 本，跳过 {} 本 ========", total, loadedCount, total - loadedCount);
    }

    /**
     * 加载单本书。返回 true 表示本次新入库，false 表示跳过（已存在或无效）。
     */
    private boolean loadOneBook(Path jsonPath, int current, int total, Integer defaultCategoryId) throws IOException {
        JsonNode root = OBJECT_MAPPER.readTree(jsonPath.toFile());
        String bookName = getText(root, "book_name");
        int remaining = total - current;
        log.info("[书籍加载] [{}/{}] 正在处理: 《{}》 (文件: {})，剩余 {} 本", current, total,
                StringUtils.hasText(bookName) ? bookName.trim() : "未知", jsonPath.getFileName(), remaining);
        if (!StringUtils.hasText(bookName)) {
            log.info("[书籍加载]   -> 结果: 无效(无书名)，跳过");
            return false;
        }
        bookName = bookName.trim();

        // （1）按书名查找，已存在则跳过
        BmsBookExample bookEx = new BmsBookExample();
        bookEx.createCriteria().andNameEqualTo(bookName);
        List<BmsBook> existing = bmsBookMapper.selectByExample(bookEx);
        if (existing != null && !existing.isEmpty()) {
            log.info("[书籍加载]   -> 结果: 已存在，跳过");
            return false;
        }

        // （2）作者：不存在则创建
        List<Integer> authorIds = new ArrayList<>();
        JsonNode authorsNode = root.get("authors");
        if (authorsNode != null && authorsNode.isArray()) {
            for (JsonNode a : authorsNode) {
                String name = a.isTextual() ? a.asText().trim() : a.toString().trim();
                if (!StringUtils.hasText(name)) {
                    continue;
                }
                BmsAuthor author = bmsAuthorDao.getByName(name);
                if (author == null) {
                    BmsAuthor newAuthor = new BmsAuthor();
                    newAuthor.setName(name);
                    newAuthor.setDescription(null);
                    newAuthor.setCreateTime(new Date());
                    bmsAuthorService.create(newAuthor);
                    authorIds.add(newAuthor.getId());
                } else {
                    authorIds.add(author.getId());
                }
            }
        }

        // （3）出版社：不存在则创建
        String publisherName = getText(root, "publisher");
        Integer publisherId = null;
        if (StringUtils.hasText(publisherName)) {
            publisherName = publisherName.trim();
            BmsPublisherExample pubEx = new BmsPublisherExample();
            pubEx.createCriteria().andNameEqualTo(publisherName);
            List<BmsPublisher> pubs = bmsPublisherMapper.selectByExample(pubEx);
            if (pubs != null && !pubs.isEmpty()) {
                publisherId = pubs.get(0).getId();
            } else {
                BmsPublisher newPub = new BmsPublisher();
                newPub.setName(publisherName);
                newPub.setDescription(null);
                newPub.setCreateTime(new Date());
                bmsPublisherService.create(newPub);
                publisherId = newPub.getId();
            }
        }

        // （4）创建书籍元信息（PostgreSQL）
        BmsBook book = new BmsBook();
        book.setName(bookName);
        book.setPublisherId(publisherId);
        book.setBookCategoryId(defaultCategoryId);
        book.setCreateTime(new Date());
        book.setPublishTime(parsePublishDate(root.get("publish_date")));
        book.setDescription(null);
        book.setLanguage(null);
        book.setIsbn(null);
        book.setIcon(null);
        book.setWordCount(0);
        bmsBookService.create(book);
        int bookId = book.getId();
        if (bookId <= 0) {
            log.info("[书籍加载]   -> 结果: 入库失败(书籍表插入异常)");
            return false;
        }

        for (Integer authorId : authorIds) {
            BmsBookAuthorRelation rel = new BmsBookAuthorRelation();
            rel.setBookId(bookId);
            rel.setAuthorId(authorId);
            bmsBookAuthorRelationMapper.insert(rel);
        }

        // （5）将完整内容写入 MongoDB（带重试；超 16MB 或最终失败则回滚并跳过）
        BookContent doc = buildBookContentFromJson(root, bookId);
        if (!saveBookContentWithRetry(doc, bookId)) {
            rollbackBook(bookId);
            log.info("[书籍加载]   -> 结果: 跳过（Mongo 写入失败或文档超过 16MB）");
            return false;
        }
        log.info("[书籍加载]   -> 结果: 已入库 (bookId={}, MongoDB id={})", bookId, doc.getId());
        return true;
    }

    private static final int MONGO_SAVE_MAX_RETRIES = 3;
    private static final long MONGO_SAVE_RETRY_DELAY_MS = 500;

    /**
     * 保存书籍内容：完整内容写入 GridFS，元数据（含 content_file_id）写入 book_content 集合，避免单文档 16MB 限制。
     * 遇连接类异常会重试；若 GridFS 仍报 16MB（单 chunk 等）则跳过。
     */
    private boolean saveBookContentWithRetry(BookContent doc, int bookId) {
        for (int attempt = 1; attempt <= MONGO_SAVE_MAX_RETRIES; attempt++) {
            try {
                byte[] json = OBJECT_MAPPER.writeValueAsBytes(doc);
                try (InputStream in = new ByteArrayInputStream(json)) {
                    ObjectId fileId = bookContentGridFsTemplate.store(in, "book_content_" + bookId, "application/json", null);
                    doc.setContentFileId(fileId.toHexString());
                    doc.setChapters(new ArrayList<>());
                }
                bookContentRepository.save(doc);
                log.debug("[书籍加载] 已写入 book_content 集合: bookId={}, mongoId={}", bookId, doc.getId());
                return true;
            } catch (Exception e) {
                if (isMongoDocumentSizeExceeded(e)) {
                    log.warn("[书籍加载] 内容超过 MongoDB/GridFS 限制，跳过: bookId={}", bookId);
                    return false;
                }
                if (attempt < MONGO_SAVE_MAX_RETRIES) {
                    log.warn("[书籍加载] Mongo/GridFS 写入失败，{}ms 后重试 ({}/{}): bookId={}, {}", MONGO_SAVE_RETRY_DELAY_MS, attempt, MONGO_SAVE_MAX_RETRIES, bookId, e.getMessage());
                    try {
                        Thread.sleep(MONGO_SAVE_RETRY_DELAY_MS);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        log.warn("[书籍加载] 重试被中断");
                        return false;
                    }
                } else {
                    log.error("[书籍加载] Mongo/GridFS 写入在重试 {} 次后仍失败: bookId={}", MONGO_SAVE_MAX_RETRIES, bookId, e);
                    return false;
                }
            }
        }
        return false;
    }

    private static boolean isMongoDocumentSizeExceeded(Throwable e) {
        for (Throwable t = e; t != null; t = t.getCause()) {
            String msg = t.getMessage();
            if (msg != null && (msg.contains("16777216") || msg.contains("maximum of 16777216") || msg.contains("BsonMaximumSizeExceeded"))) {
                return true;
            }
        }
        return false;
    }

    /** Mongo 写入失败时回滚：删除该书在 PostgreSQL 中的作者关系与书籍记录。 */
    private void rollbackBook(int bookId) {
        try {
            BmsBookAuthorRelationExample relEx = new BmsBookAuthorRelationExample();
            relEx.createCriteria().andBookIdEqualTo(bookId);
            bmsBookAuthorRelationMapper.deleteByExample(relEx);
            bmsBookMapper.deleteByPrimaryKey(bookId);
        } catch (Exception e) {
            log.error("[书籍加载] 回滚 bookId={} 时异常", bookId, e);
        }
    }

    /**
     * 从 JSON 根节点构建 BookContent，不设置 file_path，设置 book_id。
     */
    private BookContent buildBookContentFromJson(JsonNode root, int bookId) throws IOException {
        BookContent doc = new BookContent();
        doc.setBookId(bookId);
        doc.setBookName(getText(root, "book_name"));
        doc.setFilePath(null); // 按需求排除 file_path
        doc.setPublisher(getText(root, "publisher"));
        doc.setPublishDate(parsePublishDate(root.get("publish_date")));

        JsonNode authorsNode = root.get("authors");
        if (authorsNode != null && authorsNode.isArray()) {
            List<String> authors = OBJECT_MAPPER.convertValue(authorsNode, new TypeReference<List<String>>() {});
            doc.setAuthors(authors != null ? authors : new ArrayList<>());
        }

        JsonNode chaptersNode = root.get("chapters");
        if (chaptersNode != null && chaptersNode.isArray()) {
            List<ChapterItem> chapters = OBJECT_MAPPER.convertValue(chaptersNode, new TypeReference<List<ChapterItem>>() {});
            doc.setChapters(chapters != null ? chapters : new ArrayList<>());
        }

        return doc;
    }

    private static String getText(JsonNode node, String field) {
        if (node == null) {
            return null;
        }
        JsonNode f = node.get(field);
        if (f == null || f.isNull()) {
            return null;
        }
        return f.asText(null);
    }

    private static Date parsePublishDate(JsonNode node) {
        if (node == null || node.isNull()) {
            return null;
        }
        if (node.isTextual()) {
            String s = node.asText();
            if (!StringUtils.hasText(s)) {
                return null;
            }
            try {
                return java.sql.Date.valueOf(s.trim());
            } catch (Exception e) {
                return null;
            }
        }
        if (node.isNumber()) {
            long t = node.asLong();
            if (t <= 0) {
                return null;
            }
            return new Date(t);
        }
        return null;
    }
}
