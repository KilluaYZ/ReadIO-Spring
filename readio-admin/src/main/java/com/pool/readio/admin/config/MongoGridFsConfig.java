package com.pool.readio.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

/**
 * GridFS 配置：提供 book_content 桶，用于存储超 16MB 的书籍正文。
 * Docker 无需额外配置，GridFS 使用 MongoDB 自带能力。
 */
@Configuration
public class MongoGridFsConfig {

    public static final String GRIDFS_BUCKET_BOOK_CONTENT = "book_content";

    @Bean(name = "bookContentGridFsTemplate")
    public GridFsTemplate bookContentGridFsTemplate(MongoDatabaseFactory factory, MongoConverter converter) {
        return new GridFsTemplate(factory, converter, GRIDFS_BUCKET_BOOK_CONTENT);
    }
}
