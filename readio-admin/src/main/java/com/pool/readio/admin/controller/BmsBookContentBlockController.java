package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.BmsBookContentBlockQueryParam;
import com.pool.readio.admin.service.BmsBookContentBlockService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBookContentBlock;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "BmsBookContentBlockController", description = "书籍内容块管理")
@RequestMapping("/bookContentBlock")
public class BmsBookContentBlockController {

    @Autowired
    private BmsBookContentBlockService bmsBookContentBlockService;

    @Operation(summary = "获取所有书籍内容块")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookContentBlock>> listAll() {
        return CommonResult.success(bmsBookContentBlockService.listAll());
    }

    @Operation(summary = "分页条件查询书籍内容块列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookContentBlock>> list(BmsBookContentBlockQueryParam queryParam,
                                                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                              @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookContentBlock> list = bmsBookContentBlockService.list(
                queryParam != null ? queryParam : new BmsBookContentBlockQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书籍内容块")
    @GetMapping("/{id}")
    public CommonResult<BmsBookContentBlock> getById(@PathVariable Integer id) {
        BmsBookContentBlock item = bmsBookContentBlockService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("内容块不存在");
    }

    @Operation(summary = "新增书籍内容块")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookContentBlock record) {
        int n = bmsBookContentBlockService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新书籍内容块")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookContentBlock record) {
        int n = bmsBookContentBlockService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除书籍内容块")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookContentBlockService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除书籍内容块")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的内容块");
        }
        int n = bmsBookContentBlockService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
