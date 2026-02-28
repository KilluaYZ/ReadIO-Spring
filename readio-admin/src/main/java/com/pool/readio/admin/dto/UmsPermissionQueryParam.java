package com.pool.readio.admin.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * 权限查询参数（用于列表条件、分页等）
 */
@Getter
@Setter
public class UmsPermissionQueryParam {
    @Schema(description = "权限名称关键字（模糊匹配）")
    private String nameKeyword;
    @Schema(description = "权限值关键字（模糊匹配）")
    private String valueKeyword;
    @Schema(description = "权限类型：0->目录；1->菜单；2->按钮")
    private Integer type;
    @Schema(description = "启用状态：true->启用；false->禁用")
    private Boolean status;
    @Schema(description = "父级权限ID")
    private Integer parentId;
}
