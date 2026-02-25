package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.BmsBookFootnoteQueryParam;
import com.pool.readio.admin.service.BmsBookFootnoteService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBookFootnote;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "BmsBookFootnoteController", description = "书籍脚注管理")
@RequestMapping("/bookFootnote")
public class BmsBookFootnoteController {

    @Autowired
    private BmsBookFootnoteService bmsBookFootnoteService;

    @Operation(summary = "获取所有书籍脚注")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookFootnote>> listAll() {
        return CommonResult.success(bmsBookFootnoteService.listAll());
    }

    @Operation(summary = "分页条件查询书籍脚注列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookFootnote>> list(BmsBookFootnoteQueryParam queryParam,
                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                          @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookFootnote> list = bmsBookFootnoteService.list(
                queryParam != null ? queryParam : new BmsBookFootnoteQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书籍脚注")
    @GetMapping("/{id}")
    public CommonResult<BmsBookFootnote> getById(@PathVariable Integer id) {
        BmsBookFootnote item = bmsBookFootnoteService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("脚注不存在");
    }

    @Operation(summary = "新增书籍脚注")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookFootnote record) {
        int n = bmsBookFootnoteService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新书籍脚注")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookFootnote record) {
        int n = bmsBookFootnoteService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除书籍脚注")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookFootnoteService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除书籍脚注")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的脚注");
        }
        int n = bmsBookFootnoteService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
