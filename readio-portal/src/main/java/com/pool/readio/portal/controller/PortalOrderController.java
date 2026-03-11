package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.OmsOrderDetail;
import com.pool.readio.admin.service.OmsOrderService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.OmsOrder;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Portal：我的订单（查询）。
 * 说明：当前通过 memberId 参数联调；生产环境应从 token 解析当前用户并做归属校验。
 */
@RestController
@Tag(name = "Portal-订单", description = "业务层-我的订单")
@RequestMapping("/portal/order")
public class PortalOrderController {

    @Autowired
    private OmsOrderService orderService;

    @Operation(summary = "列出当前用户的所有订单（不分页）")
    @GetMapping("/listAll")
    public CommonResult<List<OmsOrder>> listAllByMember(@RequestParam("memberId") Long memberId) {
        return CommonResult.success(orderService.listByMemberId(memberId));
    }

    @Operation(summary = "分页列出当前用户的订单")
    @GetMapping("/list")
    public CommonResult<CommonPage<OmsOrder>> listByMember(@RequestParam("memberId") Long memberId,
                                                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsOrder> list = orderService.listByMemberId(memberId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "获取订单详情（需确保订单归属当前用户）")
    @GetMapping("/{id}")
    public CommonResult<OmsOrderDetail> detail(@PathVariable("id") Long id,
                                               @RequestParam("memberId") Long memberId) {
        OmsOrderDetail detail = orderService.detail(id);
        if (detail == null) {
            return CommonResult.failed("订单不存在");
        }
        // 最小防护：按 memberId 参数做一次归属校验（生产环境应改为 token 中的 memberId）
        if (detail.getMemberId() == null || !detail.getMemberId().equals(memberId.intValue())) {
            return CommonResult.forbidden(null);
        }
        return CommonResult.success(detail);
    }
}

