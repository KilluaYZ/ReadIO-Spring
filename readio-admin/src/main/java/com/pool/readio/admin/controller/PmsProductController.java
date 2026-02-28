package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.admin.dto.PmsProductParam;
import com.pool.readio.admin.dto.PmsProductQueryParam;
import com.pool.readio.mbg.model.PmsProduct;
import com.pool.readio.admin.service.PmsProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品管理Controller
 * 对应表 pms_product（id, name, product_category_id, book_id, chapter_id, vip_duration, create_time, price, hidden）
 */
@Controller
@Tag(name = "PmsProductController", description = "商品管理")
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    private PmsProductService productService;

    /** (1) /listAll：获取所有的商品 */
    @Operation(summary = "获取所有商品")
    @GetMapping("/listAll")
    @ResponseBody
    public CommonResult<List<PmsProduct>> listAll() {
        List<PmsProduct> list = productService.listAll();
        return CommonResult.success(list);
    }

    /** (2) /list：分页获取商品 */
    @Operation(summary = "分页获取商品")
    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> list(PmsProductQueryParam productQueryParam,
                                                     @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> list = productService.list(productQueryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    /** (3) /get：获取一个商品的详细信息（类型、创建时间、价格等，与数据库字段对应） */
    @Operation(summary = "获取商品详细信息")
    @GetMapping("/get/{id}")
    @ResponseBody
    public CommonResult<PmsProduct> get(@PathVariable("id") Long id) {
        PmsProduct product = productService.getById(id);
        if (product == null) {
            return CommonResult.failed("商品不存在");
        }
        return CommonResult.success(product);
    }

    /** (4) /add：创建新商品 */
    @Operation(summary = "创建新商品")
    @PostMapping("/add")
    @ResponseBody
    public CommonResult<Integer> add(@RequestBody PmsProductParam productParam) {
        int count = productService.create(productParam);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("新增失败");
    }

    /** (5) /delete：批量删除商品 */
    @Operation(summary = "批量删除商品")
    @PostMapping("/delete")
    @ResponseBody
    public CommonResult<Integer> delete(@RequestParam("ids") List<Long> ids) {
        int count = productService.delete(ids);
        return count > 0 ? CommonResult.success(count) : CommonResult.failed("删除失败");
    }

    /** (6) /update：修改商品信息 */
    @Operation(summary = "修改商品信息")
    @PostMapping("/update/{id}")
    @ResponseBody
    public CommonResult<Void> update(@PathVariable("id") Long id, @RequestBody PmsProductParam productParam) {
        int count = productService.update(id, productParam);
        return count > 0 ? CommonResult.success(null) : CommonResult.failed("修改失败");
    }
}
