package com.pool.readio.admin.controller;

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
 * 书籍阅读进度管理 Controller（管理员用）
 * 对应数据表 bms_book_read_progress
 */
@RestController
@Tag(name = "BmsBookReadProgressController", description = "书籍阅读进度管理")
@RequestMapping("/bookReadProgress")
public class BmsBookReadProgressController {

    @Autowired
    private BmsBookReadProgressService bmsBookReadProgressService;

    @Operation(summary = "获取所有阅读进度")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookReadProgress>> listAll() {
        List<BmsBookReadProgress> list = bmsBookReadProgressService.listAll();
        return CommonResult.success(list);
    }

    @Operation(summary = "分页查询阅读进度列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookReadProgress>> list(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookReadProgress> list = bmsBookReadProgressService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取阅读进度")
    @GetMapping("/{id}")
    public CommonResult<BmsBookReadProgress> getById(@PathVariable Integer id) {
        BmsBookReadProgress item = bmsBookReadProgressService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("阅读进度不存在");
    }

    @Operation(summary = "根据用户ID和书籍ID查询该用户对某本书的阅读进度")
    @GetMapping("/byMemberAndBook")
    public CommonResult<BmsBookReadProgress> getByMemberAndBook(
            @RequestParam Integer memberId,
            @RequestParam Integer bookId) {
        BmsBookReadProgress item = bmsBookReadProgressService.getByMemberAndBook(memberId, bookId);
        return item != null ? CommonResult.success(item) : CommonResult.failed("未找到该用户对该书的阅读进度");
    }

    @Operation(summary = "根据书籍ID获取阅读过该书的用户进度列表（全部）")
    @GetMapping("/byBook/{bookId}/listAll")
    public CommonResult<List<BmsBookReadProgress>> listByBookId(@PathVariable Integer bookId) {
        List<BmsBookReadProgress> list = bmsBookReadProgressService.listByBookId(bookId);
        return CommonResult.success(list);
    }

    @Operation(summary = "根据书籍ID分页获取阅读过该书的用户进度列表")
    @GetMapping("/byBook/{bookId}/list")
    public CommonResult<CommonPage<BmsBookReadProgress>> listByBookIdPage(
            @PathVariable Integer bookId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookReadProgress> list = bmsBookReadProgressService.listByBookIdPage(bookId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据用户ID获取该用户阅读的书籍进度列表（全部）")
    @GetMapping("/byMember/{memberId}/listAll")
    public CommonResult<List<BmsBookReadProgress>> listByMemberId(@PathVariable Integer memberId) {
        List<BmsBookReadProgress> list = bmsBookReadProgressService.listByMemberId(memberId);
        return CommonResult.success(list);
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

    @Operation(summary = "新增阅读进度")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookReadProgress record) {
        if (record.getMemberId() == null || record.getBookId() == null) {
            return CommonResult.failed("用户ID和书籍ID不能为空");
        }
        if (record.getLastBlockId() == null) {
            record.setLastBlockId(0);
        }
        if (record.getIsFinished() == null) {
            record.setIsFinished(false);
        }
        int n = bmsBookReadProgressService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新阅读进度")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookReadProgress record) {
        int n = bmsBookReadProgressService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "根据用户ID和书籍ID更新阅读进度")
    @PostMapping("/byMemberAndBook/update")
    public CommonResult<Void> updateByMemberAndBook(
            @RequestParam Integer memberId,
            @RequestParam Integer bookId,
            @RequestBody BmsBookReadProgress record) {
        int n = bmsBookReadProgressService.updateByMemberAndBook(memberId, bookId, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("未找到该用户对该书的阅读进度或更新失败");
    }

    @Operation(summary = "删除阅读进度")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookReadProgressService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }
}
