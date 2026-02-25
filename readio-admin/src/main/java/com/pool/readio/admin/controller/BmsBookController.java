package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.BmsBookQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferBookStatusResult;
import com.pool.readio.admin.service.BmsBookService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.UmsMember;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "BmsBookController", description = "书籍管理")
@RequestMapping("/book")
public class BmsBookController {

    @Autowired
    private BmsBookService bmsBookService;

    @Operation(summary = "获取所有书籍")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBook>> listAll() {
        return CommonResult.success(bmsBookService.listAll());
    }

    @Operation(summary = "分页条件查询书籍列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBook>> list(BmsBookQueryParam queryParam,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBook> list = bmsBookService.list(
                queryParam != null ? queryParam : new BmsBookQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书籍")
    @GetMapping("/{id}")
    public CommonResult<BmsBook> getById(@PathVariable Integer id) {
        BmsBook item = bmsBookService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("书籍不存在");
    }

    @Operation(summary = "新增书籍")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBook record) {
        int n = bmsBookService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新书籍")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBook record) {
        int n = bmsBookService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除书籍")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除书籍")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的书籍");
        }
        int n = bmsBookService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    // ===================== 用户喜好（喜欢 / 不喜欢 / 收藏）相关 =====================

    @Operation(summary = "用户喜欢某本书")
    @PostMapping("/{bookId}/prefer/like")
    public CommonResult<Void> likeBook(@PathVariable Integer bookId,
                                       @RequestParam Integer memberId) {
        int n = bmsBookService.addMemberPrefer(memberId, bookId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消喜欢某本书")
    @PostMapping("/{bookId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikeBook(@PathVariable Integer bookId,
                                             @RequestParam Integer memberId) {
        int n = bmsBookService.removeMemberPrefer(memberId, bookId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户不喜欢某本书")
    @PostMapping("/{bookId}/prefer/dislike")
    public CommonResult<Void> dislikeBook(@PathVariable Integer bookId,
                                          @RequestParam Integer memberId) {
        int n = bmsBookService.addMemberPrefer(memberId, bookId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消不喜欢某本书")
    @PostMapping("/{bookId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikeBook(@PathVariable Integer bookId,
                                                @RequestParam Integer memberId) {
        int n = bmsBookService.removeMemberPrefer(memberId, bookId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户收藏某本书")
    @PostMapping("/{bookId}/prefer/favorite")
    public CommonResult<Void> favoriteBook(@PathVariable Integer bookId,
                                           @RequestParam Integer memberId) {
        int n = bmsBookService.addMemberPrefer(memberId, bookId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消收藏某本书")
    @PostMapping("/{bookId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoriteBook(@PathVariable Integer bookId,
                                                 @RequestParam Integer memberId) {
        int n = bmsBookService.removeMemberPrefer(memberId, bookId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "获取某本书的喜欢/不喜欢/收藏人数统计")
    @GetMapping("/{bookId}/prefer/count")
    public CommonResult<CmsMemberPreferBookCountResult> getPreferCount(@PathVariable Integer bookId) {
        CmsMemberPreferBookCountResult result = new CmsMemberPreferBookCountResult();
        result.setLikeCount(bmsBookService.countMemberPreferByBook(bookId, 0));
        result.setFavoriteCount(bmsBookService.countMemberPreferByBook(bookId, 1));
        result.setDislikeCount(bmsBookService.countMemberPreferByBook(bookId, 2));
        return CommonResult.success(result);
    }

    @Operation(summary = "获取某用户对该书的喜好状态")
    @GetMapping("/{bookId}/prefer/status")
    public CommonResult<CmsMemberPreferBookStatusResult> getMemberPreferStatus(@PathVariable Integer bookId,
                                                                               @RequestParam Integer memberId) {
        CmsMemberPreferBookStatusResult status = bmsBookService.getMemberPreferStatus(memberId, bookId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取喜欢该书的用户列表")
    @GetMapping("/{bookId}/prefer/likes")
    public CommonResult<List<UmsMember>> listLikeMembers(@PathVariable Integer bookId) {
        List<UmsMember> list = bmsBookService.listMembersByBookAndPreferType(bookId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取不喜欢该书的用户列表")
    @GetMapping("/{bookId}/prefer/dislikes")
    public CommonResult<List<UmsMember>> listDislikeMembers(@PathVariable Integer bookId) {
        List<UmsMember> list = bmsBookService.listMembersByBookAndPreferType(bookId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取收藏该书的用户列表")
    @GetMapping("/{bookId}/prefer/favorites")
    public CommonResult<List<UmsMember>> listFavoriteMembers(@PathVariable Integer bookId) {
        List<UmsMember> list = bmsBookService.listMembersByBookAndPreferType(bookId, 1);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户喜欢的书籍列表")
    @GetMapping("/member/{memberId}/prefer/likes")
    public CommonResult<List<BmsBook>> listLikedBooks(@PathVariable Integer memberId) {
        List<BmsBook> list = bmsBookService.listBooksByMemberAndPreferType(memberId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户不喜欢的书籍列表")
    @GetMapping("/member/{memberId}/prefer/dislikes")
    public CommonResult<List<BmsBook>> listDislikedBooks(@PathVariable Integer memberId) {
        List<BmsBook> list = bmsBookService.listBooksByMemberAndPreferType(memberId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户收藏的书籍列表")
    @GetMapping("/member/{memberId}/prefer/favorites")
    public CommonResult<List<BmsBook>> listFavoriteBooks(@PathVariable Integer memberId) {
        List<BmsBook> list = bmsBookService.listBooksByMemberAndPreferType(memberId, 1);
        return CommonResult.success(list);
    }
}

