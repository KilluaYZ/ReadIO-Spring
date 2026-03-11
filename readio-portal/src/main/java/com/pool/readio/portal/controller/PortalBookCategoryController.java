package com.pool.readio.portal.controller;

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

/**
 * Portal：书籍分类只读接口。
 */
@RestController
@Tag(name = "Portal-书籍分类", description = "业务层-书籍分类查询")
@RequestMapping("/portal/bookCategory")
public class PortalBookCategoryController {

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
}
