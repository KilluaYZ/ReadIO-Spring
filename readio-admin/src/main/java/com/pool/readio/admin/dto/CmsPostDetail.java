package com.pool.readio.admin.dto;

import com.pool.readio.mbg.model.CmsPost;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 帖子详情：帖子元信息。内容块表 cms_post_content_block 已废弃，不再包含 contentBlocks。
 */
@Getter
@Setter
@Schema(description = "帖子详情（帖子元信息）")
public class CmsPostDetail {

    @Schema(description = "帖子元信息：id、memberId、visible、createTime、updateTime、publishTime、title、ip、address")
    private CmsPost post;
}
