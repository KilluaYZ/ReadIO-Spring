package com.pool.readio.admin;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pool.readio.admin.dao.BmsAuthorDao;
import com.pool.readio.admin.service.BmsBookChapterService;
import com.pool.readio.admin.service.BmsBookContentBlockService;
import com.pool.readio.admin.service.BmsBookService;
import com.pool.readio.admin.service.BmsAuthorService;
import com.pool.readio.admin.service.BmsPublisherService;
import com.pool.readio.mbg.mapper.BmsBookAuthorRelationMapper;
import com.pool.readio.mbg.mapper.BmsBookMapper;
import com.pool.readio.mbg.mapper.BmsPublisherMapper;
import com.pool.readio.mbg.model.BmsAuthor;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookAuthorRelation;
import com.pool.readio.mbg.model.BmsBookChapter;
import com.pool.readio.mbg.model.BmsBookContentBlock;
import com.pool.readio.mbg.model.BmsBookExample;
import com.pool.readio.mbg.model.BmsPublisher;
import com.pool.readio.mbg.model.BmsPublisherExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 从指定目录加载 JSON 格式的书籍到数据库。
 * 启动时若传入 <code>--book-dir=/path/to/json/dir</code> 则执行加载。
 */
@Component
@Order(100)
public class ReadioBookLoader implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ReadioBookLoader.class);

    /** 内容块类型：0 文本，1 图片 */
    private static final int BLOCK_TYPE_TEXT = 0;
    private static final int BLOCK_TYPE_IMAGE = 1;

    /** 中英文句号、问号、叹号、分号、换行作为分块边界 */
    private static final Pattern TEXT_SPLIT_PATTERN = Pattern.compile(
            "[。！？；\\n\\r.!?;]+"
    );

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final BmsBookMapper bmsBookMapper;
    private final BmsAuthorDao bmsAuthorDao;
    private final BmsPublisherMapper bmsPublisherMapper;
    private final BmsBookAuthorRelationMapper bmsBookAuthorRelationMapper;
    private final BmsBookService bmsBookService;
    private final BmsAuthorService bmsAuthorService;
    private final BmsPublisherService bmsPublisherService;
    private final BmsBookChapterService bmsBookChapterService;
    private final BmsBookContentBlockService bmsBookContentBlockService;

    public ReadioBookLoader(
            BmsBookMapper bmsBookMapper,
            BmsAuthorDao bmsAuthorDao,
            BmsPublisherMapper bmsPublisherMapper,
            BmsBookAuthorRelationMapper bmsBookAuthorRelationMapper,
            BmsBookService bmsBookService,
            BmsAuthorService bmsAuthorService,
            BmsPublisherService bmsPublisherService,
            BmsBookChapterService bmsBookChapterService,
            BmsBookContentBlockService bmsBookContentBlockService) {
        this.bmsBookMapper = bmsBookMapper;
        this.bmsAuthorDao = bmsAuthorDao;
        this.bmsPublisherMapper = bmsPublisherMapper;
        this.bmsBookAuthorRelationMapper = bmsBookAuthorRelationMapper;
        this.bmsBookService = bmsBookService;
        this.bmsAuthorService = bmsAuthorService;
        this.bmsPublisherService = bmsPublisherService;
        this.bmsBookChapterService = bmsBookChapterService;
        this.bmsBookContentBlockService = bmsBookContentBlockService;
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
                // 下一个参数为路径（这里不处理，仅支持 --book-dir=/path）
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
     *
     * @param current            当前第几本（从 1 开始）
     * @param total              总共有多少本
     * @param defaultCategoryId  默认书籍分类 ID（库中必填）
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

        // （4）创建书籍元信息
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
        book.setWordCount(0); // 后面可按需从章节汇总
        bmsBookService.create(book);
        int bookId = book.getId();
        if (bookId <= 0) {
            log.info("[书籍加载]   -> 结果: 入库失败(书籍表插入异常)");
            return false;
        }

        // 书籍-作者关联（使用 insert 以让 PostgreSQL 正确返回自增 id）
        for (Integer authorId : authorIds) {
            BmsBookAuthorRelation rel = new BmsBookAuthorRelation();
            rel.setBookId(bookId);
            rel.setAuthorId(authorId);
            bmsBookAuthorRelationMapper.insert(rel);
        }

        // （5）章节按顺序插入
        JsonNode chaptersNode = root.get("chapters");
        if (chaptersNode == null || !chaptersNode.isArray()) {
            log.info("Book has no chapters: {}", bookName);
            return true;
        }

        int orderIndex = 0;
        for (JsonNode chNode : chaptersNode) {
            String title = getText(chNode, "title");
            if (title == null) {
                title = "Chapter " + (orderIndex + 1);
            }

            BmsBookChapter chapter = new BmsBookChapter();
            chapter.setBookId(bookId);
            chapter.setName(title.trim());
            chapter.setOrderId(orderIndex);
            String content = getText(chNode, "content");
            chapter.setWordCount(content != null ? content.length() : 0);
            chapter.setCreateTime(new Date());
            bmsBookChapterService.create(chapter);
            int chapterId = chapter.getId();
            if (chapterId <= 0) {
                continue;
            }

            // （6）章节文本分块插入（类型 0 文本），按顺序设置 order_id
            int blockOrderId = 0;
            if (StringUtils.hasText(content)) {
                List<String> chunks = splitContent(content);
                for (String chunk : chunks) {
                    String trimmed = chunk.trim();
                    if (trimmed.isEmpty()) {
                        continue;
                    }
                    BmsBookContentBlock block = new BmsBookContentBlock();
                    block.setBookId(bookId);
                    block.setChapterId(chapterId);
                    block.setType(BLOCK_TYPE_TEXT);
                    block.setOrderId(blockOrderId++);
                    block.setContent(trimmed);
                    block.setNewline(Boolean.TRUE);
                    bmsBookContentBlockService.create(block);
                }
            }

            // （7）图片块：来自 chapters[i].images，作为图片类型块接在文本块后面
            JsonNode imagesNode = chNode.get("images");
            if (imagesNode != null && imagesNode.isArray()) {
                for (JsonNode img : imagesNode) {
                    String url = img.isTextual() ? img.asText() : img.toString();
                    if (!StringUtils.hasText(url)) {
                        continue;
                    }
                    BmsBookContentBlock block = new BmsBookContentBlock();
                    block.setBookId(bookId);
                    block.setChapterId(chapterId);
                    block.setType(BLOCK_TYPE_IMAGE);
                    block.setOrderId(blockOrderId++);
                    block.setImage(url.trim());
                    block.setContent(null);
                    block.setNewline(Boolean.TRUE);
                    bmsBookContentBlockService.create(block);
                }
            }

            orderIndex++;
        }

        log.info("[书籍加载]   -> 结果: 已入库 (bookId={})", bookId);
        return true;
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

    /**
     * 按中英文句号、问号、叹号、分号、换行分块，保留边界符在上一块末尾（或丢弃，这里选择不保留以简化）。
     * 这里按边界切分，每块为“一段”文本（边界之间的内容），空段丢弃。
     */
    private List<String> splitContent(String content) {
        if (content == null || content.isEmpty()) {
            return List.of();
        }
        String[] parts = TEXT_SPLIT_PATTERN.split(content);
        List<String> result = new ArrayList<>();
        for (String p : parts) {
            String t = p.trim();
            if (!t.isEmpty()) {
                result.add(p);
            }
        }
        return result;
    }
}
