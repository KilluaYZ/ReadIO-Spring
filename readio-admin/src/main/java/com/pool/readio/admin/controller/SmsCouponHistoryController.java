package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.SmsCouponHistory;
import com.pool.readio.admin.service.SmsCouponHistoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 优惠券领取/使用记录管理 Controller
 */
@RestController
@Tag(name = "SmsCouponHistoryController", description = "优惠券领取记录管理")
@RequestMapping("/couponHistory")
public class SmsCouponHistoryController {

    @Autowired
    private SmsCouponHistoryService historyService;

    @Operation(summary = "分页查询领取记录（支持按优惠券、会员、使用状态、订单号筛选）")
    @GetMapping("/list")
    public CommonResult<CommonPage<SmsCouponHistory>> list(
            @RequestParam(value = "couponId", required = false) Long couponId,
            @RequestParam(value = "memberId", required = false) Long memberId,
            @RequestParam(value = "useStatus", required = false) Integer useStatus,
            @RequestParam(value = "orderSn", required = false) String orderSn,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsCouponHistory> list = historyService.list(couponId, memberId, useStatus, orderSn, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取领取记录详情")
    @GetMapping("/{id}")
    public CommonResult<SmsCouponHistory> getById(@PathVariable Integer id) {
        SmsCouponHistory item = historyService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("记录不存在");
    }
}
