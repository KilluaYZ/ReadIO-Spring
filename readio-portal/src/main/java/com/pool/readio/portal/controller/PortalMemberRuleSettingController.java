package com.pool.readio.portal.controller;

import com.pool.readio.admin.service.UmsMemberRuleSettingService;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMemberRuleSetting;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：会员积分/成长值规则只读接口（供前端展示规则说明）。不暴露新增/更新/删除。
 */
@RestController
@Tag(name = "Portal-会员规则", description = "业务层-会员积分成长规则查询")
@RequestMapping("/portal/memberRuleSetting")
public class PortalMemberRuleSettingController {

    private final UmsMemberRuleSettingService ruleSettingService;

    public PortalMemberRuleSettingController(UmsMemberRuleSettingService ruleSettingService) {
        this.ruleSettingService = ruleSettingService;
    }

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
}
