package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.admin.dto.SmsFlashPromotionProduct;
import com.pool.readio.mbg.model.SmsFlashPromotion;
import com.pool.readio.mbg.model.SmsFlashPromotionProductRelation;
import com.pool.readio.admin.service.SmsFlashPromotionProductRelationService;
import com.pool.readio.admin.service.SmsFlashPromotionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * 限时购活动管理Controller
 * 对应表 sms_flash_promotion（id, title, start_date, end_date, status, create_time）
 */
@Controller
@Tag(name = "SmsFlashPromotionController", description = "限时购活动管理")
@RequestMapping("/flash")
public class SmsFlashPromotionController {
    @Autowired
    private SmsFlashPromotionService flashPromotionService;
    @Autowired
    private SmsFlashPromotionProductRelationService flashProductRelationService;

    @Operation(summary = "添加活动")
    @PostMapping("/create")
    @ResponseBody
    public CommonResult<Integer> create(@RequestBody SmsFlashPromotion flashPromotion) {
        int count = flashPromotionService.create(flashPromotion);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "编辑活动信息")
    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult<Integer> update(@PathVariable Long id, @RequestBody SmsFlashPromotion flashPromotion) {
        int count = flashPromotionService.update(id, flashPromotion);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除活动信息")
    @PostMapping("/delete/{id}")
    @ResponseBody
    public CommonResult<Integer> delete(@PathVariable Long id) {
        int count = flashPromotionService.delete(id);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "修改上下线状态")
    @PostMapping("/update/status/{id}")
    @ResponseBody
    public CommonResult<Integer> updateStatus(@PathVariable Long id, @RequestParam("status") Integer status) {
        int count = flashPromotionService.updateStatus(id, status);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "获取活动详情")
    @GetMapping("/{id}")
    @ResponseBody
    public CommonResult<SmsFlashPromotion> getItem(@PathVariable Long id) {
        SmsFlashPromotion flashPromotion = flashPromotionService.getItem(id);
        if (flashPromotion == null) {
            return CommonResult.failed("活动不存在");
        }
        return CommonResult.success(flashPromotion);
    }

    @Operation(summary = "根据活动名称分页查询")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<SmsFlashPromotion>> list(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsFlashPromotion> list = flashPromotionService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    // ---------- 秒杀活动下的商品：增、删、查 ----------

    @Operation(summary = "为秒杀活动添加商品（需指定场次、商品、限时价等）")
    @PostMapping("/{id}/products")
    @ResponseBody
    public CommonResult<Integer> addProduct(
            @PathVariable("id") Long promotionId,
            @RequestBody SmsFlashPromotionProductRelation relation) {
        if (relation.getFlashPromotionSessionId() == null || relation.getProductId() == null) {
            return CommonResult.failed("场次ID和商品ID不能为空");
        }
        relation.setFlashPromotionId(promotionId.intValue());
        if (relation.getFlashPromotionPrice() == null) relation.setFlashPromotionPrice((short) 0);
        if (relation.getFlashPromotionCount() == null) relation.setFlashPromotionCount(-1);
        if (relation.getFlashPromotionLimit() == null) relation.setFlashPromotionLimit(-1);
        int count = flashProductRelationService.create(Collections.singletonList(relation));
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "从秒杀活动中删除一条商品关联（按关联表主键）")
    @PostMapping("/{id}/products/delete/{relationId}")
    @ResponseBody
    public CommonResult<Integer> deleteProduct(
            @PathVariable("id") Long promotionId,
            @PathVariable("relationId") Long relationId) {
        int count = flashProductRelationService.delete(relationId);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "查询秒杀活动下的商品列表（可按场次筛选，分页）")
    @GetMapping("/{id}/products")
    @ResponseBody
    public CommonResult<CommonPage<SmsFlashPromotionProduct>> listProducts(
            @PathVariable("id") Long promotionId,
            @RequestParam(value = "flashPromotionSessionId", required = false) Long sessionId,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsFlashPromotionProduct> list;
        if (sessionId != null) {
            list = flashProductRelationService.list(promotionId, sessionId, pageSize, pageNum);
        } else {
            list = flashProductRelationService.listByPromotionId(promotionId, pageSize, pageNum);
        }
        return CommonResult.success(CommonPage.restPage(list));
    }
}
