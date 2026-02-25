package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.BmsAuthorQueryParam;
import com.pool.readio.admin.service.BmsAuthorService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsAuthor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "BmsAuthorController", description = "作者管理")
@RequestMapping("/author")
public class BmsAuthorController {

    @Autowired
    private BmsAuthorService bmsAuthorService;

    @Operation(summary = "获取所有作者")
    @GetMapping("/listAll")
    public CommonResult<List<BmsAuthor>> listAll() {
        return CommonResult.success(bmsAuthorService.listAll());
    }

    @Operation(summary = "分页条件查询作者列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsAuthor>> list(BmsAuthorQueryParam queryParam,
                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                    @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsAuthor> list = bmsAuthorService.list(
                queryParam != null ? queryParam : new BmsAuthorQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取作者")
    @GetMapping("/{id}")
    public CommonResult<BmsAuthor> getById(@PathVariable Integer id) {
        BmsAuthor item = bmsAuthorService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("作者不存在");
    }

    @Operation(summary = "新增作者")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsAuthor record) {
        int n = bmsAuthorService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新作者")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsAuthor record) {
        int n = bmsAuthorService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除作者")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsAuthorService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除作者")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的作者");
        }
        int n = bmsAuthorService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
