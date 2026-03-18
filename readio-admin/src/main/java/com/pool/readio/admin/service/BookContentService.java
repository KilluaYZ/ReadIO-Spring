package com.pool.readio.admin.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pool.readio.mbg.mongo.BookContent;
import com.pool.readio.mbg.mongo.BookContentRepository;
import com.mongodb.client.gridfs.model.GridFSFile;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.InputStream;
import java.util.Optional;

/**
 * 书籍内容查询：支持从 GridFS 解析 contentFileId，返回完整 BookContent。
 */
@Service
public class BookContentService {

    private final BookContentRepository bookContentRepository;
    private final GridFsTemplate bookContentGridFsTemplate;
    private final ObjectMapper objectMapper;

    public BookContentService(BookContentRepository bookContentRepository,
                             @Qualifier("bookContentGridFsTemplate") GridFsTemplate bookContentGridFsTemplate,
                             @Autowired(required = false) ObjectMapper objectMapper) {
        this.bookContentRepository = bookContentRepository;
        this.bookContentGridFsTemplate = bookContentGridFsTemplate;
        this.objectMapper = objectMapper != null ? objectMapper : new ObjectMapper();
    }

    /**
     * 按书籍 ID 获取完整内容。若文档带 contentFileId 则从 GridFS 读取正文并合并返回。
     */
    @Cacheable(cacheNames = "bookContent", key = "#bookId")
    public Optional<BookContent> getByBookId(Integer bookId) {
        Optional<BookContent> metaOpt = bookContentRepository.findByBookId(bookId);
        if (metaOpt.isEmpty()) {
            return Optional.empty();
        }
        BookContent meta = metaOpt.get();
        String contentFileId = meta.getContentFileId();
        if (contentFileId == null || contentFileId.isBlank()) {
            return metaOpt;
        }
        try {
            GridFSFile file = bookContentGridFsTemplate.findOne(
                    Query.query(Criteria.where("_id").is(new ObjectId(contentFileId))));
            if (file == null) {
                return Optional.of(meta);
            }
            Resource resource = bookContentGridFsTemplate.getResource(file);
            if (!resource.exists()) {
                return Optional.of(meta);
            }
            try (InputStream in = resource.getInputStream()) {
                byte[] bytes = StreamUtils.copyToByteArray(in);
                BookContent full = objectMapper.readValue(bytes, BookContent.class);
                full.setId(meta.getId());
                return Optional.of(full);
            }
        } catch (Exception e) {
            return Optional.of(meta);
        }
    }
}
