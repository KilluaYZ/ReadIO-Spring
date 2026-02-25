package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 书籍分类查询参数（用于列表条件、分页统计等）
 */
@Getter
@Setter
public class BmsBookCategoryQueryParam {
    @Schema(description = "类型名称关键字（模糊匹配）")
    private String nameKeyword;
    @Schema(description = "代表字母关键字（模糊匹配）")
    private String keyKeyword;
    @Schema(description = "创建时间前缀，如 2024-01 表示该月")
    private String createTime;
}
