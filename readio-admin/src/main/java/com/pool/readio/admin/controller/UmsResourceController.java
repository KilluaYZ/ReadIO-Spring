package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsResource;
import com.pool.readio.admin.service.UmsResourceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 后台资源管理 Controller
 * 对应数据表 ums_resource
 */
@RestController
@Tag(name = "UmsResourceController", description = "后台资源管理")
@RequestMapping("/resource")
public class UmsResourceController {

    @Autowired
    private UmsResourceService resourceService;

    @Operation(summary = "获取所有资源")
    @GetMapping("/listAll")
    public CommonResult<List<UmsResource>> listAll() {
        List<UmsResource> list = resourceService.listAll();
        return CommonResult.success(list);
    }

    @Operation(summary = "分页条件查询资源列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<UmsResource>> list(
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false) String nameKeyword,
            @RequestParam(required = false) String urlKeyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<UmsResource> list = resourceService.list(categoryId, nameKeyword, urlKeyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取资源详情")
    @GetMapping("/{id}")
    public CommonResult<UmsResource> getById(@PathVariable Integer id) {
        UmsResource item = resourceService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("资源不存在");
    }

    @Operation(summary = "新增资源")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsResource umsResource) {
        int n = resourceService.create(umsResource);
        return n > 0 ? CommonResult.success(umsResource.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新资源")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody UmsResource umsResource) {
        int n = resourceService.update(id, umsResource);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除资源")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = resourceService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除资源")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的资源");
        }
        int n = resourceService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "初始化路径与资源的关联数据（写入 Redis）")
    @GetMapping("/initPathResourceMap")
    public CommonResult<Map<String, String>> initPathResourceMap() {
        Map<String, String> pathResourceMap = resourceService.initPathResourceMap();
        return CommonResult.success(pathResourceMap);
    }
}
