package com.pool.readio.mbg.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

/**
 * 书籍内容文档的 MongoDB Repository，用于与 MongoDB 的 ORM 读写。
 */
public interface BookContentRepository extends MongoRepository<BookContent, String> {

    /**
     * 按书名查询（支持多本同名书）。
     */
    List<BookContent> findByBookName(String bookName);

    /**
     * 按文件路径精确查询唯一文档。
     */
    Optional<BookContent> findByFilePath(String filePath);

    /**
     * 按作者名查询（authors 数组包含指定作者）。
     */
    List<BookContent> findByAuthorsContaining(String author);
}
