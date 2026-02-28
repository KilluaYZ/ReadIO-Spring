package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 添加帖子内容块参数
 */
@Getter
@Setter
@Schema(description = "添加帖子内容块参数")
public class CmsPostContentBlockParam {

    @Schema(description = "内容块文本内容", requiredMode = Schema.RequiredMode.REQUIRED)
    private String content;

    @Schema(description = "内容块类型：0->文本；1->标签；2->书籍超链接；3->作者超链接；4->内容块超链接", example = "0")
    private Integer type = 0;
}
