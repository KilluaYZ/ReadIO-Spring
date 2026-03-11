package com.pool.readio.readioportal.controller;

import com.pool.readio.admin.service.BmsBookReadProgressService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBookReadProgress;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：当前用户的阅读进度（查询、更新、创建）。不暴露全量列表、按书查所有人等管理接口。
 */
@RestController
@Tag(name = "Portal-阅读进度", description = "业务层-用户阅读进度")
@RequestMapping("/portal/bookReadProgress")
public class PortalBookReadProgressController {

    @Autowired
    private BmsBookReadProgressService bmsBookReadProgressService;

    @Operation(summary = "根据用户ID和书籍ID查询该用户对某本书的阅读进度")
    @GetMapping("/byMemberAndBook")
    public CommonResult<BmsBookReadProgress> getByMemberAndBook(
            @RequestParam Integer memberId, @RequestParam Integer bookId) {
        BmsBookReadProgress item = bmsBookReadProgressService.getByMemberAndBook(memberId, bookId);
        return item != null ? CommonResult.success(item) : CommonResult.failed("未找到该用户对该书的阅读进度");
    }

    @Operation(summary = "根据用户ID获取该用户阅读的书籍进度列表（全部）")
    @GetMapping("/byMember/{memberId}/listAll")
    public CommonResult<List<BmsBookReadProgress>> listByMemberId(@PathVariable Integer memberId) {
        return CommonResult.success(bmsBookReadProgressService.listByMemberId(memberId));
    }

    @Operation(summary = "根据用户ID分页获取该用户阅读的书籍进度列表")
    @GetMapping("/byMember/{memberId}/list")
    public CommonResult<CommonPage<BmsBookReadProgress>> listByMemberIdPage(
            @PathVariable Integer memberId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookReadProgress> list = bmsBookReadProgressService.listByMemberIdPage(memberId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "新增阅读进度（用户开始读某本书时）")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookReadProgress record) {
        if (record.getMemberId() == null || record.getBookId() == null) {
            return CommonResult.failed("用户ID和书籍ID不能为空");
        }
        if (record.getLastBlockId() == null) record.setLastBlockId(0);
        if (record.getIsFinished() == null) record.setIsFinished(false);
        int n = bmsBookReadProgressService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "根据用户ID和书籍ID更新阅读进度")
    @PostMapping("/byMemberAndBook/update")
    public CommonResult<Void> updateByMemberAndBook(
            @RequestParam Integer memberId, @RequestParam Integer bookId,
            @RequestBody BmsBookReadProgress record) {
        int n = bmsBookReadProgressService.updateByMemberAndBook(memberId, bookId, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("未找到该用户对该书的阅读进度或更新失败");
    }
}
