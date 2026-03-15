package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.BmsBookListQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookListCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferBookListStatusResult;
import com.pool.readio.admin.service.BmsBookListService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：书单只读 + 书单下书籍 + 用户对书单的喜好。不暴露创建/更新/删除书单及管理成员。
 */
@RestController
@Tag(name = "Portal-书单", description = "业务层-书单查询与用户喜好")
@RequestMapping("/portal/bookList")
public class PortalBookListController {

    private final BmsBookListService bmsBookListService;

    public PortalBookListController(BmsBookListService bmsBookListService) {
        this.bmsBookListService = bmsBookListService;
    }

    @Operation(summary = "获取未隐藏的书单（C 端展示）")
    @GetMapping("/listVisible")
    public CommonResult<List<BmsBookList>> listVisible() {
        return CommonResult.success(bmsBookListService.listVisible());
    }

    @Operation(summary = "获取所有书单")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookList>> listAll() {
        return CommonResult.success(bmsBookListService.listAll());
    }

    @Operation(summary = "分页条件查询书单列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookList>> list(BmsBookListQueryParam queryParam,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookList> list = bmsBookListService.list(
                queryParam != null ? queryParam : new BmsBookListQueryParam(),
                pageNum,
                pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书单")
    @GetMapping("/{id}")
    public CommonResult<BmsBookList> getById(@PathVariable Integer id) {
        BmsBookList item = bmsBookListService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("书单不存在");
    }

    @Operation(summary = "该书单下的所有书籍")
    @GetMapping("/{bookListId}/books")
    public CommonResult<List<BmsBook>> listBooksByBookListId(@PathVariable Integer bookListId) {
        return CommonResult.success(bmsBookListService.listBooksByBookListId(bookListId));
    }

    @Operation(summary = "分页返回该书单下的书籍")
    @GetMapping("/{bookListId}/books/page")
    public CommonResult<CommonPage<BmsBook>> listBooksByBookListIdPage(
            @PathVariable Integer bookListId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBook> list = bmsBookListService.listBooksByBookListIdPage(bookListId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    // --------------- 用户对书单的喜好 ---------------

    @Operation(summary = "喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/like")
    public CommonResult<Void> likeBookList(@PathVariable Integer bookListId, @RequestParam Integer memberId) {
        int n = bmsBookListService.addMemberPrefer(memberId, bookListId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikeBookList(@PathVariable Integer bookListId, @RequestParam Integer memberId) {
        int n = bmsBookListService.removeMemberPrefer(memberId, bookListId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "不喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/dislike")
    public CommonResult<Void> dislikeBookList(@PathVariable Integer bookListId, @RequestParam Integer memberId) {
        int n = bmsBookListService.addMemberPrefer(memberId, bookListId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消不喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikeBookList(@PathVariable Integer bookListId, @RequestParam Integer memberId) {
        int n = bmsBookListService.removeMemberPrefer(memberId, bookListId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "收藏某个书单")
    @PostMapping("/{bookListId}/prefer/favorite")
    public CommonResult<Void> favoriteBookList(@PathVariable Integer bookListId, @RequestParam Integer memberId) {
        int n = bmsBookListService.addMemberPrefer(memberId, bookListId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消收藏某个书单")
    @PostMapping("/{bookListId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoriteBookList(@PathVariable Integer bookListId, @RequestParam Integer memberId) {
        int n = bmsBookListService.removeMemberPrefer(memberId, bookListId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "获取某个书单的喜欢/不喜欢/收藏人数统计")
    @GetMapping("/{bookListId}/prefer/count")
    public CommonResult<CmsMemberPreferBookListCountResult> getPreferCount(@PathVariable Integer bookListId) {
        CmsMemberPreferBookListCountResult result = new CmsMemberPreferBookListCountResult();
        result.setLikeCount(bmsBookListService.countMemberPreferByBookList(bookListId, 0));
        result.setFavoriteCount(bmsBookListService.countMemberPreferByBookList(bookListId, 1));
        result.setDislikeCount(bmsBookListService.countMemberPreferByBookList(bookListId, 2));
        return CommonResult.success(result);
    }

    @Operation(summary = "获取当前用户对该书单的喜好状态")
    @GetMapping("/{bookListId}/prefer/status")
    public CommonResult<CmsMemberPreferBookListStatusResult> getMemberPreferStatus(
            @PathVariable Integer bookListId, @RequestParam Integer memberId) {
        CmsMemberPreferBookListStatusResult status = bmsBookListService.getMemberPreferStatus(memberId, bookListId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取当前用户喜欢的书单列表")
    @GetMapping("/member/prefer/likes")
    public CommonResult<List<BmsBookList>> listLikedBookLists(@RequestParam Integer memberId) {
        return CommonResult.success(bmsBookListService.listBookListsByMemberAndPreferType(memberId, 0));
    }

    @Operation(summary = "获取当前用户不喜欢的书单列表")
    @GetMapping("/member/prefer/dislikes")
    public CommonResult<List<BmsBookList>> listDislikedBookLists(@RequestParam Integer memberId) {
        return CommonResult.success(bmsBookListService.listBookListsByMemberAndPreferType(memberId, 2));
    }

    @Operation(summary = "获取当前用户收藏的书单列表")
    @GetMapping("/member/prefer/favorites")
    public CommonResult<List<BmsBookList>> listFavoriteBookLists(@RequestParam Integer memberId) {
        return CommonResult.success(bmsBookListService.listBookListsByMemberAndPreferType(memberId, 1));
    }
}
