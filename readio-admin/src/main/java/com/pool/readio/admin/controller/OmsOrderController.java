package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.admin.dto.*;
import com.pool.readio.mbg.model.OmsOrder;
import com.pool.readio.admin.service.OmsOrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单管理Controller
 */
@Controller
@Tag(name = "OmsOrderController", description = "订单管理")
@RequestMapping("/order")
public class OmsOrderController {
    @Autowired
    private OmsOrderService orderService;

    // (1) listAll 列出所有的订单（不分页）
    @Operation(summary = "列出所有订单")
    @GetMapping("/listAll")
    @ResponseBody
    public CommonResult<List<OmsOrder>> listAll() {
        List<OmsOrder> orderList = orderService.listAll();
        return CommonResult.success(orderList);
    }

    // (2) list 根据 page 列出订单（分页）
    @Operation(summary = "分页查询订单")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<OmsOrder>> list(OmsOrderQueryParam queryParam,
                                                   @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsOrder> orderList = orderService.list(queryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(orderList));
    }

    // (3) listall/member/ 根据 member_id 列出这个用户的所有订单（不分页）
    @Operation(summary = "根据会员ID列出该用户的所有订单")
    @GetMapping("/listAll/member")
    @ResponseBody
    public CommonResult<List<OmsOrder>> listAllByMember(@RequestParam("memberId") Long memberId) {
        List<OmsOrder> orderList = orderService.listByMemberId(memberId);
        return CommonResult.success(orderList);
    }

    // (4) list/member/ 根据 member_id 和 page 列出这个用户的订单（分页）
    @Operation(summary = "根据会员ID分页列出订单")
    @GetMapping("/list/member")
    @ResponseBody
    public CommonResult<CommonPage<OmsOrder>> listByMember(@RequestParam("memberId") Long memberId,
                                                           @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<OmsOrder> orderList = orderService.listByMemberId(memberId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(orderList));
    }

    @Operation(summary = "新增订单")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult<Integer> create(@RequestBody OmsOrder order) {
        int count = orderService.create(order);
        return count > 0 ? CommonResult.success(order.getId()) : CommonResult.failed("新增失败");
    }

    // (6) update 修改订单
    @Operation(summary = "修改订单")
    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult<Void> update(@PathVariable("id") Long id,
                                     @RequestBody OmsOrder order) {
        int count = orderService.update(id, order);
        return count > 0 ? CommonResult.success(null) : CommonResult.failed("修改失败");
    }

    // (7) delete 删除订单
    @Operation(summary = "删除单个订单")
    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult<Void> delete(@PathVariable("id") Long id) {
        int count = orderService.deleteById(id);
        return count > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除订单")
    @PostMapping("/delete/batch")
    @ResponseBody
    public CommonResult<Integer> deleteBatch(@RequestBody List<Long> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的订单");
        }
        int count = orderService.delete(ids);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "获取订单详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<OmsOrderDetail> getById(@PathVariable("id") Long id) {
        OmsOrderDetail orderDetailResult = orderService.detail(id);
        if (orderDetailResult == null) {
            return CommonResult.failed("订单不存在");
        }
        return CommonResult.success(orderDetailResult);
    }
}
