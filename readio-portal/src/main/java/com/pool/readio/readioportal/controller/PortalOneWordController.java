package com.pool.readio.readioportal.controller;

import com.pool.readio.admin.dto.CmsMemberPreferOneWordCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferOneWordStatusResult;
import com.pool.readio.admin.service.BmsOneWordService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsOneWord;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：一言/金句只读与用户喜好。不暴露创建/更新/删除。
 */
@RestController
@Tag(name = "Portal-一言", description = "业务层-一言/金句查询与喜好")
@RequestMapping("/portal/oneWord")
public class PortalOneWordController {

    @Autowired
    private BmsOneWordService bmsOneWordService;

    @Operation(summary = "获取全部一言列表")
    @GetMapping("/listAll")
    public CommonResult<List<BmsOneWord>> listAll() {
        return CommonResult.success(bmsOneWordService.listAll());
    }

    @Operation(summary = "分页查询一言列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsOneWord>> list(
            @RequestParam(required = false) Integer bookId,
            @RequestParam(required = false) String contentKeyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsOneWord> list = bmsOneWordService.list(bookId, contentKeyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取一言")
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

    @Operation(summary = "根据书籍ID分页查询一言")
    @GetMapping("/byBook/{bookId}/list")
    public CommonResult<CommonPage<BmsOneWord>> listByBookIdPage(
            @PathVariable Integer bookId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsOneWord> list = bmsOneWordService.listByBookIdPage(bookId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    // --------------- 用户喜好 ---------------

    @Operation(summary = "点赞一言")
    @PostMapping("/{oneWordId}/prefer/like")
    public CommonResult<Void> likeOneWord(@PathVariable Integer oneWordId, @RequestParam Integer memberId) {
        int n = bmsOneWordService.addMemberPrefer(memberId, oneWordId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消点赞一言")
    @PostMapping("/{oneWordId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikeOneWord(@PathVariable Integer oneWordId, @RequestParam Integer memberId) {
        int n = bmsOneWordService.removeMemberPrefer(memberId, oneWordId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "不喜欢一言")
    @PostMapping("/{oneWordId}/prefer/dislike")
    public CommonResult<Void> dislikeOneWord(@PathVariable Integer oneWordId, @RequestParam Integer memberId) {
        int n = bmsOneWordService.addMemberPrefer(memberId, oneWordId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消不喜欢一言")
    @PostMapping("/{oneWordId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikeOneWord(@PathVariable Integer oneWordId, @RequestParam Integer memberId) {
        int n = bmsOneWordService.removeMemberPrefer(memberId, oneWordId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "收藏一言")
    @PostMapping("/{oneWordId}/prefer/favorite")
    public CommonResult<Void> favoriteOneWord(@PathVariable Integer oneWordId, @RequestParam Integer memberId) {
        int n = bmsOneWordService.addMemberPrefer(memberId, oneWordId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "取消收藏一言")
    @PostMapping("/{oneWordId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoriteOneWord(@PathVariable Integer oneWordId, @RequestParam Integer memberId) {
        int n = bmsOneWordService.removeMemberPrefer(memberId, oneWordId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "获取某条一言的点赞/收藏/不喜欢数量")
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
    public CommonResult<CmsMemberPreferOneWordStatusResult> getMemberPreferStatus(
            @PathVariable Integer oneWordId, @RequestParam Integer memberId) {
        CmsMemberPreferOneWordStatusResult status = bmsOneWordService.getMemberPreferStatus(memberId, oneWordId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取当前用户点赞的一言列表")
    @GetMapping("/member/prefer/likes")
    public CommonResult<List<BmsOneWord>> listLikedOneWords(@RequestParam Integer memberId) {
        return CommonResult.success(bmsOneWordService.listOneWordsByMemberAndPreferType(memberId, 0));
    }

    @Operation(summary = "获取当前用户收藏的一言列表")
    @GetMapping("/member/prefer/favorites")
    public CommonResult<List<BmsOneWord>> listFavoriteOneWords(@RequestParam Integer memberId) {
        return CommonResult.success(bmsOneWordService.listOneWordsByMemberAndPreferType(memberId, 1));
    }
}
