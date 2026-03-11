package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.BmsAuthorQueryParam;
import com.pool.readio.admin.dto.BmsBookQueryParam;
import com.pool.readio.admin.service.BmsAuthorService;
import com.pool.readio.admin.service.BmsBookService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsAuthor;
import com.pool.readio.mbg.model.BmsBook;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Portal：搜索能力（对现有 list 查询做语义化封装）。
 */
@RestController
@Tag(name = "Portal-搜索", description = "业务层-搜索（书籍/作者）")
@RequestMapping("/portal/search")
public class PortalSearchController {

    @Autowired
    private BmsBookService bmsBookService;

    @Autowired
    private BmsAuthorService bmsAuthorService;

    @Operation(summary = "搜索书籍（按关键词匹配书名/简介）")
    @GetMapping("/books")
    public CommonResult<CommonPage<BmsBook>> searchBooks(@RequestParam("keyword") String keyword,
                                                         @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        BmsBookQueryParam param = new BmsBookQueryParam();
        param.setNameKeyword(keyword);
        param.setDescriptionKeyword(keyword);
        List<BmsBook> list = bmsBookService.list(param, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "搜索作者（按关键词匹配作者名/简介）")
    @GetMapping("/authors")
    public CommonResult<CommonPage<BmsAuthor>> searchAuthors(@RequestParam("keyword") String keyword,
                                                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                             @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        BmsAuthorQueryParam param = new BmsAuthorQueryParam();
        param.setNameKeyword(keyword);
        param.setDescriptionKeyword(keyword);
        List<BmsAuthor> list = bmsAuthorService.list(param, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }
}

