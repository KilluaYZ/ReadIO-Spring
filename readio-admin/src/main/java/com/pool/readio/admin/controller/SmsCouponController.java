package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.admin.dto.SmsCouponParam;
import com.pool.readio.mbg.model.PmsProduct;
import com.pool.readio.mbg.model.PmsProductCategory;
import com.pool.readio.mbg.model.SmsCoupon;
import com.pool.readio.admin.service.SmsCouponService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 优惠券管理Controller
 * Created by macro on 2018/8/28.
 */
@Controller
@Tag(name = "SmsCouponController", description = "优惠券管理")
@RequestMapping("/coupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService couponService;
    @Operation(summary = "添加优惠券")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> add(@RequestBody SmsCouponParam couponParam) {
        int count = couponService.create(couponParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @Operation(summary = "删除优惠券")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> delete(@PathVariable Long id) {
        int count = couponService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @Operation(summary = "修改优惠券")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> update(@PathVariable Long id, @RequestBody SmsCouponParam couponParam) {
        int count = couponService.update(id, couponParam);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @Operation(summary = "根据优惠券名称和类型分页获取优惠券列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SmsCoupon>> list(
            @RequestParam(value = "name",required = false) String name,
            @RequestParam(value = "type",required = false) Integer type,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsCoupon> couponList = couponService.list(name,type,pageSize,pageNum);
        return CommonResult.success(CommonPage.restPage(couponList));
    }

    @Operation(summary = "获取单个优惠券的详细信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<SmsCouponParam> getItem(@PathVariable Long id) {
        SmsCouponParam couponParam = couponService.getItem(id);
        if (couponParam == null) {
            return CommonResult.failed("优惠券不存在");
        }
        return CommonResult.success(couponParam);
    }

    // --------------- 优惠券与商品/商品类型绑定 ---------------

    @Operation(summary = "增加优惠券与某一个商品类型的绑定")
    @PostMapping("/{couponId}/binding/category")
    @ResponseBody
    public CommonResult<Integer> addCouponProductCategoryBinding(@PathVariable Long couponId,
                                                                 @RequestParam Long productCategoryId) {
        int n = couponService.addCouponProductCategoryBinding(couponId, productCategoryId);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("绑定失败");
    }

    @Operation(summary = "增加优惠券与某一个商品的绑定")
    @PostMapping("/{couponId}/binding/product")
    @ResponseBody
    public CommonResult<Integer> addCouponProductBinding(@PathVariable Long couponId,
                                                         @RequestParam Long productId) {
        int n = couponService.addCouponProductBinding(couponId, productId);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("绑定失败");
    }

    @Operation(summary = "删除优惠券与某一个商品类型的绑定")
    @PostMapping("/{couponId}/binding/category/remove")
    @ResponseBody
    public CommonResult<Integer> removeCouponProductCategoryBinding(@PathVariable Long couponId,
                                                                     @RequestParam Long productCategoryId) {
        int n = couponService.removeCouponProductCategoryBinding(couponId, productCategoryId);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("解除绑定失败");
    }

    @Operation(summary = "删除优惠券与某一个商品的绑定")
    @PostMapping("/{couponId}/binding/product/remove")
    @ResponseBody
    public CommonResult<Integer> removeCouponProductBinding(@PathVariable Long couponId,
                                                            @RequestParam Long productId) {
        int n = couponService.removeCouponProductBinding(couponId, productId);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("解除绑定失败");
    }

    @Operation(summary = "查看某一个优惠券适用于哪些商品")
    @GetMapping("/{couponId}/products")
    @ResponseBody
    public CommonResult<List<PmsProduct>> listProductsByCouponId(@PathVariable Long couponId) {
        List<PmsProduct> list = couponService.listProductsByCouponId(couponId);
        return CommonResult.success(list);
    }

    @Operation(summary = "查看某一个优惠券适用于哪些商品类型")
    @GetMapping("/{couponId}/categories")
    @ResponseBody
    public CommonResult<List<PmsProductCategory>> listProductCategoriesByCouponId(@PathVariable Long couponId) {
        List<PmsProductCategory> list = couponService.listProductCategoriesByCouponId(couponId);
        return CommonResult.success(list);
    }

    @Operation(summary = "查看一个商品上可以使用哪些优惠券")
    @GetMapping("/byProduct/{productId}")
    @ResponseBody
    public CommonResult<List<SmsCoupon>> listCouponsByProductId(@PathVariable Long productId) {
        List<SmsCoupon> list = couponService.listCouponsByProductId(productId);
        return CommonResult.success(list);
    }

    @Operation(summary = "查看一个商品类型上可以使用哪些优惠券")
    @GetMapping("/byCategory/{productCategoryId}")
    @ResponseBody
    public CommonResult<List<SmsCoupon>> listCouponsByProductCategoryId(@PathVariable Long productCategoryId) {
        List<SmsCoupon> list = couponService.listCouponsByProductCategoryId(productCategoryId);
        return CommonResult.success(list);
    }
}
