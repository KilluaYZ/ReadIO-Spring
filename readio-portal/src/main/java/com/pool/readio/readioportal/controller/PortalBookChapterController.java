package com.pool.readio.readioportal.controller;

import com.pool.readio.admin.dto.BmsBookChapterQueryParam;
import com.pool.readio.admin.service.BmsBookChapterService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBookChapter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：书籍章节只读接口。
 */
@RestController
@Tag(name = "Portal-书籍章节", description = "业务层-书籍章节查询")
@RequestMapping("/portal/bookChapter")
public class PortalBookChapterController {

    @Autowired
    private BmsBookChapterService bmsBookChapterService;

    @Operation(summary = "获取所有书籍章节")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookChapter>> listAll() {
        return CommonResult.success(bmsBookChapterService.listAll());
    }

    @Operation(summary = "分页条件查询书籍章节列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookChapter>> list(BmsBookChapterQueryParam queryParam,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookChapter> list = bmsBookChapterService.list(
                queryParam != null ? queryParam : new BmsBookChapterQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书籍章节")
    @GetMapping("/{id}")
    public CommonResult<BmsBookChapter> getById(@PathVariable Integer id) {
        BmsBookChapter item = bmsBookChapterService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("章节不存在");
    }
}
