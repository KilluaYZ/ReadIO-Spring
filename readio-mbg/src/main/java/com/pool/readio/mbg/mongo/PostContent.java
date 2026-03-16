package com.pool.readio.mbg.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 帖子内容文档：元信息存在 PostgreSQL cms_post 表，这里仅存放正文内容等大字段。
 */
@Document(collection = "post_content")
public class PostContent {

    @Id
    private String id;

    /**
     * 关联的帖子元数据 ID（PostgreSQL cms_post.id）
     */
    @Field("post_id")
    @Indexed(unique = true)
    private Integer postId;

    /**
     * 帖子正文内容（Markdown/纯文本/HTML 由上层约定）
     */
    @Field("content")
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

