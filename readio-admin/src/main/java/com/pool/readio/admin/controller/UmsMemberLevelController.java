package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMemberLevel;
import com.pool.readio.admin.service.UmsMemberLevelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员等级管理 Controller
 */
@RestController
@Tag(name = "UmsMemberLevelController", description = "会员等级管理")
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {

    private final UmsMemberLevelService memberLevelService;

    public UmsMemberLevelController(UmsMemberLevelService memberLevelService) {
        this.memberLevelService = memberLevelService;
    }

    @Operation(summary = "查询所有会员等级（可按是否默认筛选）")
    @GetMapping("/list")
    public CommonResult<List<UmsMemberLevel>> list(
            @RequestParam(value = "defaultStatus", required = false) Integer defaultStatus) {
        List<UmsMemberLevel> list = memberLevelService.list(defaultStatus);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取全部会员等级（不筛选）")
    @GetMapping("/listAll")
    public CommonResult<List<UmsMemberLevel>> listAll() {
        List<UmsMemberLevel> list = memberLevelService.listAll();
        return CommonResult.success(list);
    }

    @Operation(summary = "根据ID获取会员等级")
    @GetMapping("/{id}")
    public CommonResult<UmsMemberLevel> getById(@PathVariable Integer id) {
        UmsMemberLevel item = memberLevelService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("等级不存在");
    }

    @Operation(summary = "新增会员等级")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsMemberLevel record) {
        int n = memberLevelService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新会员等级")
    @PostMapping("/update/{id}")
    public CommonResult<Integer> update(@PathVariable Integer id, @RequestBody UmsMemberLevel record) {
        int n = memberLevelService.updateById(id, record);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除会员等级")
    @PostMapping("/delete/{id}")
    public CommonResult<Integer> delete(@PathVariable Integer id) {
        int n = memberLevelService.deleteById(id);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "设为默认等级")
    @PostMapping("/setDefault/{id}")
    public CommonResult<Integer> setDefaultLevel(@PathVariable Integer id) {
        int n = memberLevelService.setDefaultLevel(id);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("设置失败");
    }
}
