package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.SmsFlashPromotionLog;
import com.pool.readio.admin.service.SmsFlashPromotionLogService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 限时购通知记录 Controller
 * 对应表 sms_flash_promotion_log（id, member_id, product_id, member_username, product_name, create_time）
 */
@Controller
@Tag(name = "SmsFlashPromotionLogController", description = "限时购通知记录管理")
@RequestMapping("/flashLog")
public class SmsFlashPromotionLogController {

    @Autowired
    private SmsFlashPromotionLogService logService;

    @Operation(summary = "新增限时购通知记录")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult<Integer> create(@RequestBody SmsFlashPromotionLog log) {
        int count = logService.create(log);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新限时购通知记录")
    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult<Integer> update(@PathVariable Long id, @RequestBody SmsFlashPromotionLog log) {
        int count = logService.update(id, log);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除单条通知记录")
    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult<Integer> delete(@PathVariable Long id) {
        int count = logService.delete(id);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除通知记录")
    @PostMapping("/delete/batch")
    @ResponseBody
    public CommonResult<Integer> deleteBatch(@RequestBody List<Long> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的记录");
        }
        int count = logService.delete(ids);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "根据ID获取通知记录详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<SmsFlashPromotionLog> getById(@PathVariable Long id) {
        SmsFlashPromotionLog log = logService.getItem(id);
        if (log == null) {
            return CommonResult.failed("记录不存在");
        }
        return CommonResult.success(log);
    }

    @Operation(summary = "分页查询限时购通知记录")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<SmsFlashPromotionLog>> list(
            @RequestParam(value = "memberId", required = false) Long memberId,
            @RequestParam(value = "productId", required = false) Long productId,
            @RequestParam(value = "memberUsername", required = false) String memberUsername,
            @RequestParam(value = "productName", required = false) String productName,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsFlashPromotionLog> list = logService.list(memberId, productId, memberUsername, productName, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }
}

