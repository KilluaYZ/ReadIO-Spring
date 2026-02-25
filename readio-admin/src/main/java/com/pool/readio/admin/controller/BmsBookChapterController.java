package com.pool.readio.admin.controller;

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

@RestController
@Tag(name = "BmsBookChapterController", description = "书籍章节管理")
@RequestMapping("/bookChapter")
public class BmsBookChapterController {

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

    @Operation(summary = "新增书籍章节")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookChapter record) {
        int n = bmsBookChapterService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新书籍章节")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookChapter record) {
        int n = bmsBookChapterService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除书籍章节")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookChapterService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除书籍章节")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的章节");
        }
        int n = bmsBookChapterService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
