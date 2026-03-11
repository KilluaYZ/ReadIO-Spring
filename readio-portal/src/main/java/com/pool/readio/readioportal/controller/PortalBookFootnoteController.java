package com.pool.readio.readioportal.controller;

import com.pool.readio.admin.dto.BmsBookFootnoteQueryParam;
import com.pool.readio.admin.service.BmsBookFootnoteService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBookFootnote;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：书籍脚注只读接口。
 */
@RestController
@Tag(name = "Portal-书籍脚注", description = "业务层-书籍脚注查询")
@RequestMapping("/portal/bookFootnote")
public class PortalBookFootnoteController {

    @Autowired
    private BmsBookFootnoteService bmsBookFootnoteService;

    @Operation(summary = "获取所有书籍脚注")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookFootnote>> listAll() {
        return CommonResult.success(bmsBookFootnoteService.listAll());
    }

    @Operation(summary = "分页条件查询书籍脚注列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookFootnote>> list(BmsBookFootnoteQueryParam queryParam,
                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                          @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookFootnote> list = bmsBookFootnoteService.list(
                queryParam != null ? queryParam : new BmsBookFootnoteQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书籍脚注")
    @GetMapping("/{id}")
    public CommonResult<BmsBookFootnote> getById(@PathVariable Integer id) {
        BmsBookFootnote item = bmsBookFootnoteService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("脚注不存在");
    }
}
