package com.pool.readio.readioportal.controller;

import com.pool.readio.admin.dto.BmsBookQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferBookStatusResult;
import com.pool.readio.admin.service.BmsBookService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBook;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：书籍只读 + 用户喜好（喜欢/不喜欢/收藏）。不暴露创建/更新/删除。
 * memberId 可由网关或鉴权层从登录态注入，此处保留参数便于联调。
 */
@RestController
@Tag(name = "Portal-书籍", description = "业务层-书籍查询与用户喜好")
@RequestMapping("/portal/book")
public class PortalBookController {

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

    // --------------- 用户喜好（需登录，memberId 建议从 token 取） ---------------

    @Operation(summary = "喜欢某本书")
    @PostMapping("/{bookId}/prefer/like")
    public CommonResult<Void> likeBook(@PathVariable Integer bookId, @RequestParam Integer memberId) {
        int n = bmsBookService.addMemberPrefer(memberId, bookId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消喜欢某本书")
    @PostMapping("/{bookId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikeBook(@PathVariable Integer bookId, @RequestParam Integer memberId) {
        int n = bmsBookService.removeMemberPrefer(memberId, bookId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "不喜欢某本书")
    @PostMapping("/{bookId}/prefer/dislike")
    public CommonResult<Void> dislikeBook(@PathVariable Integer bookId, @RequestParam Integer memberId) {
        int n = bmsBookService.addMemberPrefer(memberId, bookId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消不喜欢某本书")
    @PostMapping("/{bookId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikeBook(@PathVariable Integer bookId, @RequestParam Integer memberId) {
        int n = bmsBookService.removeMemberPrefer(memberId, bookId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "收藏某本书")
    @PostMapping("/{bookId}/prefer/favorite")
    public CommonResult<Void> favoriteBook(@PathVariable Integer bookId, @RequestParam Integer memberId) {
        int n = bmsBookService.addMemberPrefer(memberId, bookId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消收藏某本书")
    @PostMapping("/{bookId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoriteBook(@PathVariable Integer bookId, @RequestParam Integer memberId) {
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

    @Operation(summary = "获取当前用户对该书的喜好状态")
    @GetMapping("/{bookId}/prefer/status")
    public CommonResult<CmsMemberPreferBookStatusResult> getMemberPreferStatus(
            @PathVariable Integer bookId, @RequestParam Integer memberId) {
        CmsMemberPreferBookStatusResult status = bmsBookService.getMemberPreferStatus(memberId, bookId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取当前用户喜欢的书籍列表")
    @GetMapping("/member/prefer/likes")
    public CommonResult<List<BmsBook>> listLikedBooks(@RequestParam Integer memberId) {
        return CommonResult.success(bmsBookService.listBooksByMemberAndPreferType(memberId, 0));
    }

    @Operation(summary = "获取当前用户不喜欢的书籍列表")
    @GetMapping("/member/prefer/dislikes")
    public CommonResult<List<BmsBook>> listDislikedBooks(@RequestParam Integer memberId) {
        return CommonResult.success(bmsBookService.listBooksByMemberAndPreferType(memberId, 2));
    }

    @Operation(summary = "获取当前用户收藏的书籍列表")
    @GetMapping("/member/prefer/favorites")
    public CommonResult<List<BmsBook>> listFavoriteBooks(@RequestParam Integer memberId) {
        return CommonResult.success(bmsBookService.listBooksByMemberAndPreferType(memberId, 1));
    }
}
