package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 书单查询参数（用于列表条件、分页统计等）
 */
@Getter
@Setter
public class BmsBookListQueryParam {
    @Schema(description = "书单名称关键字（模糊匹配）")
    private String nameKeyword;
    @Schema(description = "书单简介关键字（模糊匹配）")
    private String descriptionKeyword;
    @Schema(description = "是否隐藏：true->隐藏；false->显示")
    private Boolean hidden;
    @Schema(description = "创建时间前缀，如 2024-01 表示该月")
    private String createTime;
}
