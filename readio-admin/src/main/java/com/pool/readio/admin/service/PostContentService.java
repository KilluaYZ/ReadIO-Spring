package com.pool.readio.admin.service;

import com.pool.readio.mbg.mongo.PostContent;
import com.pool.readio.mbg.mongo.PostContentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 帖子内容读写：元信息存 PostgreSQL，正文存 MongoDB post_content 集合。
 */
@Service
public class PostContentService {

    private final PostContentRepository postContentRepository;

    public PostContentService(PostContentRepository postContentRepository) {
        this.postContentRepository = postContentRepository;
    }

    /**
     * 按帖子 ID 获取内容。
     */
    public Optional<PostContent> getByPostId(Integer postId) {
        if (postId == null) {
            return Optional.empty();
        }
        return postContentRepository.findByPostId(postId);
    }

    /**
     * 保存或更新指定帖子的正文内容。
     */
    public PostContent saveOrUpdate(Integer postId, String content) {
        if (postId == null) {
            throw new IllegalArgumentException("postId cannot be null");
        }
        PostContent entity = postContentRepository.findByPostId(postId)
                .orElseGet(PostContent::new);
        entity.setPostId(postId);
        entity.setContent(content);
        return postContentRepository.save(entity);
    }
}

