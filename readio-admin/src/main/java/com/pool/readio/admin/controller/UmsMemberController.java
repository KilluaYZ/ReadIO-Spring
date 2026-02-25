package com.pool.readio.admin.controller;

import com.pool.readio.admin.service.UmsMemberService;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMember;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "UmsMemberController", description = "会员管理")
@RequestMapping("/member")
public class UmsMemberController {

    @Autowired
    private UmsMemberService umsMemberService;

    @Operation(summary = "获取所有会员")
    @GetMapping("/listAll")
    public CommonResult<List<UmsMember>> listAll() {
        return CommonResult.success(umsMemberService.listAll());
    }

    @Operation(summary = "根据ID获取会员")
    @GetMapping("/{id}")
    public CommonResult<UmsMember> getById(@PathVariable Integer id) {
        UmsMember item = umsMemberService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("会员不存在");
    }

    @Operation(summary = "新增会员")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsMember record) {
        int n = umsMemberService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新会员")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody UmsMember record) {
        int n = umsMemberService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除会员")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = umsMemberService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }
}
