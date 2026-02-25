package com.pool.readio.admin.controller;

import com.pool.readio.admin.service.BmsPublisherService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsPublisher;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 出版社（书籍供应商）管理 Controller
 * 对应数据表 bms_publisher
 */
@RestController
@Tag(name = "BmsPublisherController", description = "出版社管理")
@RequestMapping("/publisher")
public class BmsPublisherController {

    @Autowired
    private BmsPublisherService bmsPublisherService;

    @Operation(summary = "获取所有出版社")
    @GetMapping("/listAll")
    public CommonResult<List<BmsPublisher>> listAll() {
        return CommonResult.success(bmsPublisherService.listAll());
    }

    @Operation(summary = "分页条件查询出版社列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsPublisher>> list(
            @RequestParam(required = false) String nameKeyword,
            @RequestParam(required = false) String descriptionKeyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsPublisher> list = bmsPublisherService.list(nameKeyword, descriptionKeyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取出版社")
    @GetMapping("/{id}")
    public CommonResult<BmsPublisher> getById(@PathVariable Integer id) {
        BmsPublisher item = bmsPublisherService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("出版社不存在");
    }

    @Operation(summary = "新增出版社")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsPublisher record) {
        if (record.getName() == null || record.getName().isBlank()) {
            return CommonResult.failed("出版社名称不能为空");
        }
        int n = bmsPublisherService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新出版社")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsPublisher record) {
        int n = bmsPublisherService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除出版社")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsPublisherService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除出版社")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的出版社");
        }
        int n = bmsPublisherService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
