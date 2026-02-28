package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonResult;
import com.pool.readio.admin.dto.SmsFlashPromotionSessionDetail;
import com.pool.readio.mbg.model.SmsFlashPromotionSession;
import com.pool.readio.admin.service.SmsFlashPromotionSessionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 限时购场次管理Controller
 * Created by macro on 2018/11/16.
 */
@Controller
@Tag(name = "SmsFlashPromotionSessionController", description = "限时购场次管理")
@RequestMapping("/flashSession")
public class SmsFlashPromotionSessionController {
    @Autowired
    private SmsFlashPromotionSessionService flashPromotionSessionService;

    @Operation(summary = "添加场次")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult<Integer> create(@RequestBody SmsFlashPromotionSession promotionSession) {
        int count = flashPromotionSessionService.create(promotionSession);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "修改场次")
    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult<Integer> update(@PathVariable Long id, @RequestBody SmsFlashPromotionSession promotionSession) {
        int count = flashPromotionSessionService.update(id, promotionSession);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "修改启用状态")
    @PostMapping("/update/status/{id}")
    @ResponseBody
    public CommonResult<Integer> updateStatus(@PathVariable Long id, @RequestParam("status") Integer status) {
        int count = flashPromotionSessionService.updateStatus(id, status);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除场次")
    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult<Integer> delete(@PathVariable Long id) {
        int count = flashPromotionSessionService.delete(id);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "获取场次详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<SmsFlashPromotionSession> getItem(@PathVariable Long id) {
        SmsFlashPromotionSession promotionSession = flashPromotionSessionService.getItem(id);
        if (promotionSession == null) {
            return CommonResult.failed("场次不存在");
        }
        return CommonResult.success(promotionSession);
    }

    @Operation(summary = "获取全部场次")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<List<SmsFlashPromotionSession>> list() {
        List<SmsFlashPromotionSession> promotionSessionList = flashPromotionSessionService.list();
        return CommonResult.success(promotionSessionList);
    }

    @Operation(summary = "获取全部可选场次及其数量（按指定限时购活动统计各场次商品数）")
    @GetMapping("/selectList")
    @ResponseBody
    public CommonResult<List<SmsFlashPromotionSessionDetail>> selectList(
            @RequestParam("flashPromotionId") Long flashPromotionId) {
        List<SmsFlashPromotionSessionDetail> promotionSessionList = flashPromotionSessionService.selectList(flashPromotionId);
        return CommonResult.success(promotionSessionList);
    }
}