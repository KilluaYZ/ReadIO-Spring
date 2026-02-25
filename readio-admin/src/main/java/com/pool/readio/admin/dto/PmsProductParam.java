package com.pool.readio.admin.dto;

import com.pool.readio.mbg.model.PmsProduct;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 创建和修改商品时使用的参数（与当前 PmsProduct 模型一致）
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductParam extends PmsProduct {
}
