package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 商品查询参数
 */
@Getter
@Setter
public class PmsProductQueryParam {
    @Schema(title = "关键词（商品名称）")
    private String keyword;
    @Schema(title = "商品分类ID")
    private Integer productCategoryId;
    @Schema(title = "书籍ID")
    private Integer bookId;
    @Schema(title = "是否隐藏")
    private Boolean hidden;
}
