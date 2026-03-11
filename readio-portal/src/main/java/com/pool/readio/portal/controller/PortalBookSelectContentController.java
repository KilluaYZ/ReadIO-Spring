package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.BmsBookSelectContentWithItems;
import com.pool.readio.admin.service.BmsBookSelectContentService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：当前用户的划线（选中段落）增删改查。不暴露 listAll、全局分页等管理接口。
 */
@RestController
@Tag(name = "Portal-书籍划线", description = "业务层-用户划线（选中段落）")
@RequestMapping("/portal/bookSelectContent")
public class PortalBookSelectContentController {

    @Autowired
    private BmsBookSelectContentService bmsBookSelectContentService;

    @Operation(summary = "新增划线")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookSelectContentWithItems param) {
        if (param.getMemberId() == null || param.getType() == null) {
            return CommonResult.failed("用户ID和选中类型不能为空");
        }
        Integer id = bmsBookSelectContentService.create(param);
        return id != null ? CommonResult.success(id) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新划线")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookSelectContentWithItems param) {
        int n = bmsBookSelectContentService.updateById(id, param);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败或记录不存在");
    }

    @Operation(summary = "删除划线")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookSelectContentService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "根据ID查询划线（含明细项）")
    @GetMapping("/{id}")
    public CommonResult<BmsBookSelectContentWithItems> getById(@PathVariable Integer id) {
        BmsBookSelectContentWithItems item = bmsBookSelectContentService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("划线不存在");
    }

    @Operation(summary = "查询某用户的所有划线（全部）")
    @GetMapping("/byMember/{memberId}/listAll")
    public CommonResult<List<BmsBookSelectContentWithItems>> listByMemberId(@PathVariable Integer memberId) {
        return CommonResult.success(bmsBookSelectContentService.listByMemberId(memberId));
    }

    @Operation(summary = "分页查询某用户的所有划线")
    @GetMapping("/byMember/{memberId}/list")
    public CommonResult<CommonPage<BmsBookSelectContentWithItems>> listByMemberIdPage(
            @PathVariable Integer memberId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookSelectContentWithItems> list = bmsBookSelectContentService.listByMemberIdPage(memberId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "查询某用户在某本书上的划线（全部）")
    @GetMapping("/byMemberAndBook/listAll")
    public CommonResult<List<BmsBookSelectContentWithItems>> listByMemberIdAndBookId(
            @RequestParam Integer memberId, @RequestParam Integer bookId) {
        return CommonResult.success(bmsBookSelectContentService.listByMemberIdAndBookId(memberId, bookId));
    }

    @Operation(summary = "分页查询某用户在某本书上的划线")
    @GetMapping("/byMemberAndBook/list")
    public CommonResult<CommonPage<BmsBookSelectContentWithItems>> listByMemberIdAndBookIdPage(
            @RequestParam Integer memberId, @RequestParam Integer bookId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookSelectContentWithItems> list = bmsBookSelectContentService.listByMemberIdAndBookIdPage(memberId, bookId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "查询某本书上所有用户的划线（全部，如做公开笔记展示）")
    @GetMapping("/byBook/{bookId}/listAll")
    public CommonResult<List<BmsBookSelectContentWithItems>> listByBookId(@PathVariable Integer bookId) {
        return CommonResult.success(bmsBookSelectContentService.listByBookId(bookId));
    }

    @Operation(summary = "分页查询某本书上所有用户的划线")
    @GetMapping("/byBook/{bookId}/list")
    public CommonResult<CommonPage<BmsBookSelectContentWithItems>> listByBookIdPage(
            @PathVariable Integer bookId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookSelectContentWithItems> list = bmsBookSelectContentService.listByBookIdPage(bookId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
