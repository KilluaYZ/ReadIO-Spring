package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.BmsBookListBookRelationParam;
import com.pool.readio.admin.dto.BmsBookListMemberRelationParam;
import com.pool.readio.admin.dto.BmsBookListQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookListCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferBookListStatusResult;
import com.pool.readio.admin.service.BmsBookListService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookList;
import com.pool.readio.mbg.model.UmsMember;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 书单管理 Controller
 * 对应数据表 bms_book_list
 */
@RestController
@Tag(name = "BmsBookListController", description = "书单管理")
@RequestMapping("/bookList")
public class BmsBookListController {

    @Autowired
    private BmsBookListService bmsBookListService;

    @Operation(summary = "获取所有书单")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookList>> listAll() {
        List<BmsBookList> list = bmsBookListService.listAll();
        return CommonResult.success(list);
    }

    @Operation(summary = "获取未隐藏的书单")
    @GetMapping("/listVisible")
    public CommonResult<List<BmsBookList>> listVisible() {
        List<BmsBookList> list = bmsBookListService.listVisible();
        return CommonResult.success(list);
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

    @Operation(summary = "新增书单")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookList record) {
        int n = bmsBookListService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新书单")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookList record) {
        int n = bmsBookListService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除书单")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookListService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除书单")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的书单");
        }
        int n = bmsBookListService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量添加书籍到书单")
    @PostMapping("/add/books")
    public CommonResult<Integer> addBooksToList(@RequestBody BmsBookListBookRelationParam record) {
        int n = bmsBookListService.addBooksToList(record);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "批量从书单中删除书籍")
    @PostMapping("/remove/books")
    public CommonResult<Integer> removeBooksFromList(@RequestBody BmsBookListBookRelationParam record) {
        int n = bmsBookListService.removeBooksFromList(record);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量添加成员到书单")
    @PostMapping("/add/members")
    public CommonResult<Integer> addMembersToList(@RequestBody BmsBookListMemberRelationParam record) {
        int n = bmsBookListService.addMembersToList(record);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "批量从书单中移除成员")
    @PostMapping("/remove/members")
    public CommonResult<Integer> removeMembersFromList(@RequestBody BmsBookListMemberRelationParam record) {
        int n = bmsBookListService.removeMembersFromList(record);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("移除失败");
    }

    @Operation(summary = "返回该书单下的所有书籍")
    @GetMapping("/{bookListId}/books")
    public CommonResult<List<BmsBook>> listBooksByBookListId(@PathVariable("bookListId") Integer bookListId) {
        List<BmsBook> list = bmsBookListService.listBooksByBookListId(bookListId);
        return CommonResult.success(list);
    }

    @Operation(summary = "分页返回该书单下的书籍")
    @GetMapping("/{bookListId}/books/page")
    public CommonResult<CommonPage<BmsBook>> listBooksByBookListIdPage(
            @PathVariable("bookListId") Integer bookListId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBook> list = bmsBookListService.listBooksByBookListIdPage(bookListId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "返回该书单下的所有成员")
    @GetMapping("/{bookListId}/members")
    public CommonResult<List<UmsMember>> listMembersByBookListId(@PathVariable("bookListId") Integer bookListId) {
        List<UmsMember> list = bmsBookListService.listMembersByBookListId(bookListId);
        return CommonResult.success(list);
    }

    @Operation(summary = "分页返回该书单下的成员")
    @GetMapping("/{bookListId}/members/page")
    public CommonResult<CommonPage<UmsMember>> listMembersByBookListIdPage(
            @PathVariable("bookListId") Integer bookListId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<UmsMember> list = bmsBookListService.listMembersByBookListIdPage(bookListId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    // ===================== 用户喜好（喜欢 / 不喜欢 / 收藏）相关 =====================

    @Operation(summary = "用户喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/like")
    public CommonResult<Void> likeBookList(@PathVariable Integer bookListId,
                                           @RequestParam Integer memberId) {
        int n = bmsBookListService.addMemberPrefer(memberId, bookListId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikeBookList(@PathVariable Integer bookListId,
                                                 @RequestParam Integer memberId) {
        int n = bmsBookListService.removeMemberPrefer(memberId, bookListId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户不喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/dislike")
    public CommonResult<Void> dislikeBookList(@PathVariable Integer bookListId,
                                              @RequestParam Integer memberId) {
        int n = bmsBookListService.addMemberPrefer(memberId, bookListId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消不喜欢某个书单")
    @PostMapping("/{bookListId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikeBookList(@PathVariable Integer bookListId,
                                                    @RequestParam Integer memberId) {
        int n = bmsBookListService.removeMemberPrefer(memberId, bookListId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户收藏某个书单")
    @PostMapping("/{bookListId}/prefer/favorite")
    public CommonResult<Void> favoriteBookList(@PathVariable Integer bookListId,
                                               @RequestParam Integer memberId) {
        int n = bmsBookListService.addMemberPrefer(memberId, bookListId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消收藏某个书单")
    @PostMapping("/{bookListId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoriteBookList(@PathVariable Integer bookListId,
                                                     @RequestParam Integer memberId) {
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

    @Operation(summary = "获取某用户对该书单的喜好状态")
    @GetMapping("/{bookListId}/prefer/status")
    public CommonResult<CmsMemberPreferBookListStatusResult> getMemberPreferStatus(@PathVariable Integer bookListId,
                                                                                   @RequestParam Integer memberId) {
        CmsMemberPreferBookListStatusResult status = bmsBookListService.getMemberPreferStatus(memberId, bookListId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取喜欢该书单的用户列表")
    @GetMapping("/{bookListId}/prefer/likes")
    public CommonResult<List<UmsMember>> listLikeMembers(@PathVariable Integer bookListId) {
        List<UmsMember> list = bmsBookListService.listMembersByBookListAndPreferType(bookListId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取不喜欢该书单的用户列表")
    @GetMapping("/{bookListId}/prefer/dislikes")
    public CommonResult<List<UmsMember>> listDislikeMembers(@PathVariable Integer bookListId) {
        List<UmsMember> list = bmsBookListService.listMembersByBookListAndPreferType(bookListId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取收藏该书单的用户列表")
    @GetMapping("/{bookListId}/prefer/favorites")
    public CommonResult<List<UmsMember>> listFavoriteMembers(@PathVariable Integer bookListId) {
        List<UmsMember> list = bmsBookListService.listMembersByBookListAndPreferType(bookListId, 1);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户喜欢的书单列表")
    @GetMapping("/member/{memberId}/prefer/likes")
    public CommonResult<List<BmsBookList>> listLikedBookLists(@PathVariable Integer memberId) {
        List<BmsBookList> list = bmsBookListService.listBookListsByMemberAndPreferType(memberId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户不喜欢的书单列表")
    @GetMapping("/member/{memberId}/prefer/dislikes")
    public CommonResult<List<BmsBookList>> listDislikedBookLists(@PathVariable Integer memberId) {
        List<BmsBookList> list = bmsBookListService.listBookListsByMemberAndPreferType(memberId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户收藏的书单列表")
    @GetMapping("/member/{memberId}/prefer/favorites")
    public CommonResult<List<BmsBookList>> listFavoriteBookLists(@PathVariable Integer memberId) {
        List<BmsBookList> list = bmsBookListService.listBookListsByMemberAndPreferType(memberId, 1);
        return CommonResult.success(list);
    }
}
