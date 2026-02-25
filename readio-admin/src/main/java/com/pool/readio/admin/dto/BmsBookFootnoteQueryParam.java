package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 书籍脚注查询参数（用于列表条件、分页统计等）
 */
@Getter
@Setter
public class BmsBookFootnoteQueryParam {
    @Schema(description = "书籍ID")
    private Integer bookId;
    @Schema(description = "章节ID")
    private Integer chapterId;
    @Schema(description = "脚注类型：0->章节末尾脚注；1->书籍末尾尾注")
    private Integer type;
    @Schema(description = "脚注内容关键字（模糊匹配）")
    private String contentKeyword;
    @Schema(description = "创建时间前缀，如 2024-01 表示该月")
    private String createTime;
}
