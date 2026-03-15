package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.BmsAuthorQueryParam;
import com.pool.readio.admin.service.BmsAuthorService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsAuthor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：作者只读接口（列表、分页、详情）。不暴露创建/更新/删除。
 */
@RestController
@Tag(name = "Portal-作者", description = "业务层-作者查询")
@RequestMapping("/portal/author")
public class PortalAuthorController {

    private final BmsAuthorService bmsAuthorService;

    public PortalAuthorController(BmsAuthorService bmsAuthorService) {
        this.bmsAuthorService = bmsAuthorService;
    }

    @Operation(summary = "获取所有作者")
    @GetMapping("/listAll")
    public CommonResult<List<BmsAuthor>> listAll() {
        return CommonResult.success(bmsAuthorService.listAll());
    }

    @Operation(summary = "分页条件查询作者列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsAuthor>> list(BmsAuthorQueryParam queryParam,
                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                    @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsAuthor> list = bmsAuthorService.list(
                queryParam != null ? queryParam : new BmsAuthorQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取作者")
    @GetMapping("/{id}")
    public CommonResult<BmsAuthor> getById(@PathVariable Integer id) {
        BmsAuthor item = bmsAuthorService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("作者不存在");
    }
}
