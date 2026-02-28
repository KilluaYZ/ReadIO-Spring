package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.UmsPermissionQueryParam;
import com.pool.readio.admin.service.UmsPermissionService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsPermission;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户权限管理 Controller
 * 对应数据表 ums_permission
 */
@RestController
@Tag(name = "UmsPermissonController", description = "后台权限管理")
@RequestMapping("/permission")
public class UmsPermissonController {

    @Autowired
    private UmsPermissionService umsPermissionService;

    @Operation(summary = "获取所有权限")
    @GetMapping("/listAll")
    public CommonResult<List<UmsPermission>> listAll() {
        List<UmsPermission> list = umsPermissionService.listAll();
        return CommonResult.success(list);
    }

    @Operation(summary = "分页条件查询权限列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<UmsPermission>> list(UmsPermissionQueryParam queryParam,
                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<UmsPermission> list = umsPermissionService.list(
                queryParam != null ? queryParam : new UmsPermissionQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取权限")
    @GetMapping("/{id}")
    public CommonResult<UmsPermission> getById(@PathVariable Integer id) {
        UmsPermission item = umsPermissionService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("权限不存在");
    }

    @Operation(summary = "新增权限")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsPermission record) {
        int n = umsPermissionService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新权限")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody UmsPermission record) {
        int n = umsPermissionService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除权限")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = umsPermissionService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除权限")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的权限");
        }
        int n = umsPermissionService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
