package com.pool.readio.admin.dto;

import com.pool.readio.mbg.model.PmsProduct;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询单个商品用于编辑时返回的结果
 */
@Getter
@Setter
public class PmsProductResult extends PmsProduct {
    @Schema(title = "商品所属分类的父ID")
    private Integer cateParentId;
}
