package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.CmsMemberPreferOneWordCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferOneWordStatusResult;
import com.pool.readio.admin.service.BmsOneWordService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsOneWord;
import com.pool.readio.mbg.model.UmsMember;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 一言/金句 Controller
 * 对应表 bms_one_word
 */
@RestController
@Tag(name = "BmsOneWordController", description = "一言/金句管理")
@RequestMapping("/oneWord")
public class BmsOneWordController {

    @Autowired
    private BmsOneWordService bmsOneWordService;

    @Operation(summary = "获取全部列表")
    @GetMapping("/listAll")
    public CommonResult<List<BmsOneWord>> listAll() {
        return CommonResult.success(bmsOneWordService.listAll());
    }

    @Operation(summary = "分页查询列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsOneWord>> list(
            @RequestParam(required = false) Integer bookId,
            @RequestParam(required = false) String contentKeyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsOneWord> list = bmsOneWordService.list(bookId, contentKeyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取")
    @GetMapping("/{id}")
    public CommonResult<BmsOneWord> getById(@PathVariable Integer id) {
        BmsOneWord item = bmsOneWordService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("记录不存在");
    }

    @Operation(summary = "根据书籍ID获取该书籍下所有一言")
    @GetMapping("/byBook/{bookId}/listAll")
    public CommonResult<List<BmsOneWord>> listByBookId(@PathVariable Integer bookId) {
        return CommonResult.success(bmsOneWordService.listByBookId(bookId));
    }

    @Operation(summary = "根据书籍ID分页查询")
    @GetMapping("/byBook/{bookId}/list")
    public CommonResult<CommonPage<BmsOneWord>> listByBookIdPage(
            @PathVariable Integer bookId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsOneWord> list = bmsOneWordService.listByBookIdPage(bookId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "创建")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsOneWord record) {
        if (record.getBookId() == null) {
            return CommonResult.failed("书籍ID必填");
        }
        if (record.getContent() == null || record.getContent().isBlank()) {
            return CommonResult.failed("内容不能为空");
        }
        int n = bmsOneWordService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("创建失败");
    }

    @Operation(summary = "更新")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsOneWord record) {
        int n = bmsOneWordService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsOneWordService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请提供要删除的ID列表");
        }
        int n = bmsOneWordService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    // ===================== 点赞 / 收藏 / 不喜欢 =====================

    @Operation(summary = "点赞一言")
    @PostMapping("/{oneWordId}/prefer/like")
    public CommonResult<Void> likeOneWord(@PathVariable Integer oneWordId,
                                          @RequestParam Integer memberId) {
        int n = bmsOneWordService.addMemberPrefer(memberId, oneWordId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消点赞一言")
    @PostMapping("/{oneWordId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikeOneWord(@PathVariable Integer oneWordId,
                                                 @RequestParam Integer memberId) {
        int n = bmsOneWordService.removeMemberPrefer(memberId, oneWordId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "不喜欢一言")
    @PostMapping("/{oneWordId}/prefer/dislike")
    public CommonResult<Void> dislikeOneWord(@PathVariable Integer oneWordId,
                                             @RequestParam Integer memberId) {
        int n = bmsOneWordService.addMemberPrefer(memberId, oneWordId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消不喜欢一言")
    @PostMapping("/{oneWordId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikeOneWord(@PathVariable Integer oneWordId,
                                                    @RequestParam Integer memberId) {
        int n = bmsOneWordService.removeMemberPrefer(memberId, oneWordId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "收藏一言")
    @PostMapping("/{oneWordId}/prefer/favorite")
    public CommonResult<Void> favoriteOneWord(@PathVariable Integer oneWordId,
                                              @RequestParam Integer memberId) {
        int n = bmsOneWordService.addMemberPrefer(memberId, oneWordId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消收藏一言")
    @PostMapping("/{oneWordId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoriteOneWord(@PathVariable Integer oneWordId,
                                                     @RequestParam Integer memberId) {
        int n = bmsOneWordService.removeMemberPrefer(memberId, oneWordId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "获取点赞/收藏/不喜欢数量")
    @GetMapping("/{oneWordId}/prefer/count")
    public CommonResult<CmsMemberPreferOneWordCountResult> getPreferCount(@PathVariable Integer oneWordId) {
        CmsMemberPreferOneWordCountResult result = new CmsMemberPreferOneWordCountResult();
        result.setLikeCount(bmsOneWordService.countMemberPreferByOneWord(oneWordId, 0));
        result.setFavoriteCount(bmsOneWordService.countMemberPreferByOneWord(oneWordId, 1));
        result.setDislikeCount(bmsOneWordService.countMemberPreferByOneWord(oneWordId, 2));
        return CommonResult.success(result);
    }

    @Operation(summary = "获取当前用户对该一言的偏好状态")
    @GetMapping("/{oneWordId}/prefer/status")
    public CommonResult<CmsMemberPreferOneWordStatusResult> getMemberPreferStatus(@PathVariable Integer oneWordId,
                                                                                  @RequestParam Integer memberId) {
        CmsMemberPreferOneWordStatusResult status = bmsOneWordService.getMemberPreferStatus(memberId, oneWordId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取点赞该一言的用户列表")
    @GetMapping("/{oneWordId}/prefer/likes")
    public CommonResult<List<UmsMember>> listLikeMembers(@PathVariable Integer oneWordId) {
        List<UmsMember> list = bmsOneWordService.listMembersByOneWordAndPreferType(oneWordId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取不喜欢该一言的用户列表")
    @GetMapping("/{oneWordId}/prefer/dislikes")
    public CommonResult<List<UmsMember>> listDislikeMembers(@PathVariable Integer oneWordId) {
        List<UmsMember> list = bmsOneWordService.listMembersByOneWordAndPreferType(oneWordId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取收藏该一言的用户列表")
    @GetMapping("/{oneWordId}/prefer/favorites")
    public CommonResult<List<UmsMember>> listFavoriteMembers(@PathVariable Integer oneWordId) {
        List<UmsMember> list = bmsOneWordService.listMembersByOneWordAndPreferType(oneWordId, 1);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取用户点赞的一言列表")
    @GetMapping("/member/{memberId}/prefer/likes")
    public CommonResult<List<BmsOneWord>> listLikedOneWords(@PathVariable Integer memberId) {
        List<BmsOneWord> list = bmsOneWordService.listOneWordsByMemberAndPreferType(memberId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取用户不喜欢的一言列表")
    @GetMapping("/member/{memberId}/prefer/dislikes")
    public CommonResult<List<BmsOneWord>> listDislikedOneWords(@PathVariable Integer memberId) {
        List<BmsOneWord> list = bmsOneWordService.listOneWordsByMemberAndPreferType(memberId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取用户收藏的一言列表")
    @GetMapping("/member/{memberId}/prefer/favorites")
    public CommonResult<List<BmsOneWord>> listFavoriteOneWords(@PathVariable Integer memberId) {
        List<BmsOneWord> list = bmsOneWordService.listOneWordsByMemberAndPreferType(memberId, 1);
        return CommonResult.success(list);
    }
}
