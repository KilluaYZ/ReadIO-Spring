package com.pool.readio.mbg.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * 帖子内容文档的 MongoDB Repository。
 */
public interface PostContentRepository extends MongoRepository<PostContent, String> {

    /**
     * 按帖子 ID 查询内容。
     */
    Optional<PostContent> findByPostId(Integer postId);
}

