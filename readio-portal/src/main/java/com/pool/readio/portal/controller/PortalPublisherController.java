package com.pool.readio.portal.controller;

import com.pool.readio.admin.service.BmsPublisherService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsPublisher;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：出版社只读接口（书籍详情页展示出版社信息等）。
 */
@RestController
@Tag(name = "Portal-出版社", description = "业务层-出版社查询")
@RequestMapping("/portal/publisher")
public class PortalPublisherController {

    @Autowired
    private BmsPublisherService bmsPublisherService;

    @Operation(summary = "获取所有出版社")
    @GetMapping("/listAll")
    public CommonResult<List<BmsPublisher>> listAll() {
        return CommonResult.success(bmsPublisherService.listAll());
    }

    @Operation(summary = "分页条件查询出版社列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsPublisher>> list(
            @RequestParam(required = false) String nameKeyword,
            @RequestParam(required = false) String descriptionKeyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsPublisher> list = bmsPublisherService.list(nameKeyword, descriptionKeyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取出版社")
    @GetMapping("/{id}")
    public CommonResult<BmsPublisher> getById(@PathVariable Integer id) {
        BmsPublisher item = bmsPublisherService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("出版社不存在");
    }
}
