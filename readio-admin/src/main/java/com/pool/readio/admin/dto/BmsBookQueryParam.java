package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 书籍查询参数（用于列表条件、分页统计等）
 */
@Getter
@Setter
public class BmsBookQueryParam {
    @Schema(description = "书籍名称关键字（模糊匹配）")
    private String nameKeyword;
    @Schema(description = "简介关键字（模糊匹配）")
    private String descriptionKeyword;
    @Schema(description = "作者ID")
    private Integer authorId;
    @Schema(description = "书籍分类ID")
    private Integer bookCategoryId;
    @Schema(description = "出版社ID")
    private Integer publisherId;
    @Schema(description = "ISBN（精确或模糊）")
    private String isbn;
    @Schema(description = "语言")
    private String language;
    @Schema(description = "创建时间前缀，如 2024-01 表示该月")
    private String createTime;
}
