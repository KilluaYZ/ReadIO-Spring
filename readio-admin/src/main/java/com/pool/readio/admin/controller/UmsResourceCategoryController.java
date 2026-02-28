package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsResourceCategory;
import com.pool.readio.admin.service.UmsResourceCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台资源分类管理 Controller
 * 对应数据表 ums_resource_category
 */
@RestController
@Tag(name = "UmsResourceCategoryController", description = "后台资源分类管理")
@RequestMapping("/resourceCategory")
public class UmsResourceCategoryController {

    @Autowired
    private UmsResourceCategoryService resourceCategoryService;

    @Operation(summary = "获取所有资源分类")
    @GetMapping("/listAll")
    public CommonResult<List<UmsResourceCategory>> listAll() {
        List<UmsResourceCategory> list = resourceCategoryService.listAll();
        return CommonResult.success(list);
    }

    @Operation(summary = "根据ID获取资源分类")
    @GetMapping("/{id}")
    public CommonResult<UmsResourceCategory> getById(@PathVariable Integer id) {
        UmsResourceCategory item = resourceCategoryService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("资源分类不存在");
    }

    @Operation(summary = "新增资源分类")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsResourceCategory umsResourceCategory) {
        int n = resourceCategoryService.create(umsResourceCategory);
        return n > 0 ? CommonResult.success(umsResourceCategory.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新资源分类")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody UmsResourceCategory umsResourceCategory) {
        int n = resourceCategoryService.update(id, umsResourceCategory);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除资源分类")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = resourceCategoryService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除资源分类")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的资源分类");
        }
        int n = resourceCategoryService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
