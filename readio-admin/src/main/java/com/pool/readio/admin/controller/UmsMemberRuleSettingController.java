package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMemberRuleSetting;
import com.pool.readio.admin.service.UmsMemberRuleSettingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员积分/成长值规则配置 Controller
 * type：0->积分规则；1->成长值规则
 */
@RestController
@Tag(name = "UmsMemberRuleSettingController", description = "会员积分成长规则配置")
@RequestMapping("/memberRuleSetting")
public class UmsMemberRuleSettingController {

    @Autowired
    private UmsMemberRuleSettingService ruleSettingService;

    @Operation(summary = "获取全部规则")
    @GetMapping("/listAll")
    public CommonResult<List<UmsMemberRuleSetting>> listAll() {
        return CommonResult.success(ruleSettingService.listAll());
    }

    @Operation(summary = "按类型获取规则（0 积分规则，1 成长值规则）")
    @GetMapping("/list")
    public CommonResult<List<UmsMemberRuleSetting>> listByType(
            @RequestParam(value = "type", required = false) Integer type) {
        return CommonResult.success(ruleSettingService.listByType(type));
    }

    @Operation(summary = "根据ID获取规则")
    @GetMapping("/{id}")
    public CommonResult<UmsMemberRuleSetting> getById(@PathVariable Integer id) {
        UmsMemberRuleSetting item = ruleSettingService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("规则不存在");
    }

    @Operation(summary = "新增规则")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsMemberRuleSetting record) {
        if (record.getType() == null) {
            return CommonResult.failed("类型必填：0 积分规则，1 成长值规则");
        }
        int n = ruleSettingService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新规则")
    @PostMapping("/update/{id}")
    public CommonResult<Integer> update(@PathVariable Integer id, @RequestBody UmsMemberRuleSetting record) {
        int n = ruleSettingService.updateById(id, record);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除规则")
    @PostMapping("/delete/{id}")
    public CommonResult<Integer> delete(@PathVariable Integer id) {
        int n = ruleSettingService.deleteById(id);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }
}
