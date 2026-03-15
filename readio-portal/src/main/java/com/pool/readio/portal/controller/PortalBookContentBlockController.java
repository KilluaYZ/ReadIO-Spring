package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.BmsBookContentBlockQueryParam;
import com.pool.readio.admin.service.BmsBookContentBlockService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBookContentBlock;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：书籍内容块只读接口（阅读内容）。
 */
@RestController
@Tag(name = "Portal-书籍内容块", description = "业务层-书籍内容块查询")
@RequestMapping("/portal/bookContentBlock")
public class PortalBookContentBlockController {

    private final BmsBookContentBlockService bmsBookContentBlockService;

    public PortalBookContentBlockController(BmsBookContentBlockService bmsBookContentBlockService) {
        this.bmsBookContentBlockService = bmsBookContentBlockService;
    }

    @Operation(summary = "获取所有书籍内容块")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookContentBlock>> listAll() {
        return CommonResult.success(bmsBookContentBlockService.listAll());
    }

    @Operation(summary = "分页条件查询书籍内容块列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookContentBlock>> list(BmsBookContentBlockQueryParam queryParam,
                                                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                              @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookContentBlock> list = bmsBookContentBlockService.list(
                queryParam != null ? queryParam : new BmsBookContentBlockQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书籍内容块")
    @GetMapping("/{id}")
    public CommonResult<BmsBookContentBlock> getById(@PathVariable Integer id) {
        BmsBookContentBlock item = bmsBookContentBlockService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("内容块不存在");
    }
}
