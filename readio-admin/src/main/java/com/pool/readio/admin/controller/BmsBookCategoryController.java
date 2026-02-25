package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.BmsBookCategoryQueryParam;
import com.pool.readio.admin.service.BmsBookCategoryService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBookCategory;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "BmsBookCategoryController", description = "书籍分类管理")
@RequestMapping("/bookCategory")
public class BmsBookCategoryController {

    @Autowired
    private BmsBookCategoryService bmsBookCategoryService;

    @Operation(summary = "获取所有书籍分类")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookCategory>> listAll() {
        return CommonResult.success(bmsBookCategoryService.listAll());
    }

    @Operation(summary = "分页条件查询书籍分类列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookCategory>> list(BmsBookCategoryQueryParam queryParam,
                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                          @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookCategory> list = bmsBookCategoryService.list(
                queryParam != null ? queryParam : new BmsBookCategoryQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书籍分类")
    @GetMapping("/{id}")
    public CommonResult<BmsBookCategory> getById(@PathVariable Integer id) {
        BmsBookCategory item = bmsBookCategoryService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("分类不存在");
    }

    @Operation(summary = "新增书籍分类")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookCategory record) {
        int n = bmsBookCategoryService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新书籍分类")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookCategory record) {
        int n = bmsBookCategoryService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除书籍分类")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookCategoryService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除书籍分类")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的分类");
        }
        int n = bmsBookCategoryService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
