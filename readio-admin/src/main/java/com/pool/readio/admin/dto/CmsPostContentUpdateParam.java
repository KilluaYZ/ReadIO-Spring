package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 更新帖子内容请求：只包含正文，由路径中的 postId 关联到元信息。
 */
@Getter
@Setter
@Schema(description = "帖子内容更新参数")
public class CmsPostContentUpdateParam {

    @Schema(description = "帖子正文内容（Markdown/纯文本/HTML 由上层约定）", requiredMode = Schema.RequiredMode.REQUIRED)
    private String content;
}

