package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.CmsMemberPreferCommentCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferCommentStatusResult;
import com.pool.readio.admin.service.CmsCommentService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.CmsComment;
import com.pool.readio.mbg.model.UmsMember;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 评论管理 Controller
 * 对应 cms_comment。type: 0->帖子评论；1->回复评论；2->书籍评论；3->选中段落评论
 */
@RestController
@Tag(name = "CmsCommentController", description = "评论管理")
@RequestMapping("/comment")
public class CmsCommentController {

    @Autowired
    private CmsCommentService cmsCommentService;

    @Operation(summary = "获取所有评论")
    @GetMapping("/listAll")
    public CommonResult<List<CmsComment>> listAll() {
        return CommonResult.success(cmsCommentService.listAll());
    }

    @Operation(summary = "分页条件查询评论列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<CmsComment>> list(
            @RequestParam(required = false) Integer type,
            @RequestParam(required = false) Integer memberId,
            @RequestParam(required = false) Integer bookId,
            @RequestParam(required = false) Integer postId,
            @RequestParam(required = false) Integer selectId,
            @RequestParam(required = false) Integer commentId,
            @RequestParam(required = false) String contentKeyword,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<CmsComment> list = cmsCommentService.list(
                type, memberId, bookId, postId, selectId, commentId, contentKeyword,
                pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取评论")
    @GetMapping("/{id}")
    public CommonResult<CmsComment> getById(@PathVariable Integer id) {
        CmsComment item = cmsCommentService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("评论不存在");
    }

    @Operation(summary = "按帖子ID获取评论（全部）")
    @GetMapping("/byPost/{postId}/listAll")
    public CommonResult<List<CmsComment>> listByPostId(@PathVariable Integer postId) {
        return CommonResult.success(cmsCommentService.listByPostId(postId));
    }

    @Operation(summary = "按帖子ID分页获取评论")
    @GetMapping("/byPost/{postId}/list")
    public CommonResult<CommonPage<CmsComment>> listByPostIdPage(
            @PathVariable Integer postId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<CmsComment> list = cmsCommentService.listByPostIdPage(postId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "按书籍ID获取评论（全部）")
    @GetMapping("/byBook/{bookId}/listAll")
    public CommonResult<List<CmsComment>> listByBookId(@PathVariable Integer bookId) {
        return CommonResult.success(cmsCommentService.listByBookId(bookId));
    }

    @Operation(summary = "按书籍ID分页获取评论")
    @GetMapping("/byBook/{bookId}/list")
    public CommonResult<CommonPage<CmsComment>> listByBookIdPage(
            @PathVariable Integer bookId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<CmsComment> list = cmsCommentService.listByBookIdPage(bookId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "按选中段落ID获取评论（全部）")
    @GetMapping("/bySelect/{selectId}/listAll")
    public CommonResult<List<CmsComment>> listBySelectId(@PathVariable Integer selectId) {
        return CommonResult.success(cmsCommentService.listBySelectId(selectId));
    }

    @Operation(summary = "按选中段落ID分页获取评论")
    @GetMapping("/bySelect/{selectId}/list")
    public CommonResult<CommonPage<CmsComment>> listBySelectIdPage(
            @PathVariable Integer selectId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<CmsComment> list = cmsCommentService.listBySelectIdPage(selectId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "获取某条评论的回复（全部）")
    @GetMapping("/replies/{commentId}/listAll")
    public CommonResult<List<CmsComment>> listRepliesByCommentId(@PathVariable Integer commentId) {
        return CommonResult.success(cmsCommentService.listRepliesByCommentId(commentId));
    }

    @Operation(summary = "分页获取某条评论的回复")
    @GetMapping("/replies/{commentId}/list")
    public CommonResult<CommonPage<CmsComment>> listRepliesByCommentIdPage(
            @PathVariable Integer commentId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<CmsComment> list = cmsCommentService.listRepliesByCommentIdPage(commentId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "新增评论")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody CmsComment record) {
        if (record.getType() == null) {
            return CommonResult.failed("评论类型不能为空");
        }
        if (record.getMemberId() == null) {
            return CommonResult.failed("用户ID不能为空");
        }
        if (record.getSelectId() == null) {
            return CommonResult.failed("选中段落ID不能为空");
        }
        if (record.getContent() == null || record.getContent().isBlank()) {
            return CommonResult.failed("评论内容不能为空");
        }
        int n = cmsCommentService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新评论")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody CmsComment record) {
        int n = cmsCommentService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除评论")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = cmsCommentService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量删除评论")
    @PostMapping("/delete/batch")
    public CommonResult<Integer> deleteBatch(@RequestBody List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return CommonResult.failed("请选择要删除的评论");
        }
        int n = cmsCommentService.deleteByIds(ids);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    // ===================== 用户喜好（喜欢 / 不喜欢 / 收藏）相关 =====================

    @Operation(summary = "用户喜欢某条评论")
    @PostMapping("/{commentId}/prefer/like")
    public CommonResult<Void> likeComment(@PathVariable Integer commentId,
                                          @RequestParam Integer memberId) {
        int n = cmsCommentService.addMemberPrefer(memberId, commentId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消喜欢某条评论")
    @PostMapping("/{commentId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikeComment(@PathVariable Integer commentId,
                                                @RequestParam Integer memberId) {
        int n = cmsCommentService.removeMemberPrefer(memberId, commentId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户不喜欢某条评论")
    @PostMapping("/{commentId}/prefer/dislike")
    public CommonResult<Void> dislikeComment(@PathVariable Integer commentId,
                                             @RequestParam Integer memberId) {
        int n = cmsCommentService.addMemberPrefer(memberId, commentId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消不喜欢某条评论")
    @PostMapping("/{commentId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikeComment(@PathVariable Integer commentId,
                                                   @RequestParam Integer memberId) {
        int n = cmsCommentService.removeMemberPrefer(memberId, commentId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户收藏某条评论")
    @PostMapping("/{commentId}/prefer/favorite")
    public CommonResult<Void> favoriteComment(@PathVariable Integer commentId,
                                              @RequestParam Integer memberId) {
        int n = cmsCommentService.addMemberPrefer(memberId, commentId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消收藏某条评论")
    @PostMapping("/{commentId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoriteComment(@PathVariable Integer commentId,
                                                    @RequestParam Integer memberId) {
        int n = cmsCommentService.removeMemberPrefer(memberId, commentId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "获取某条评论的喜欢/不喜欢/收藏人数统计")
    @GetMapping("/{commentId}/prefer/count")
    public CommonResult<CmsMemberPreferCommentCountResult> getPreferCount(@PathVariable Integer commentId) {
        CmsMemberPreferCommentCountResult result = new CmsMemberPreferCommentCountResult();
        result.setLikeCount(cmsCommentService.countMemberPreferByComment(commentId, 0));
        result.setFavoriteCount(cmsCommentService.countMemberPreferByComment(commentId, 1));
        result.setDislikeCount(cmsCommentService.countMemberPreferByComment(commentId, 2));
        return CommonResult.success(result);
    }

    @Operation(summary = "获取某用户对该评论的喜好状态")
    @GetMapping("/{commentId}/prefer/status")
    public CommonResult<CmsMemberPreferCommentStatusResult> getMemberPreferStatus(@PathVariable Integer commentId,
                                                                                   @RequestParam Integer memberId) {
        CmsMemberPreferCommentStatusResult status = cmsCommentService.getMemberPreferStatus(memberId, commentId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取喜欢该评论的用户列表")
    @GetMapping("/{commentId}/prefer/likes")
    public CommonResult<List<UmsMember>> listLikeMembers(@PathVariable Integer commentId) {
        List<UmsMember> list = cmsCommentService.listMembersByCommentAndPreferType(commentId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取不喜欢该评论的用户列表")
    @GetMapping("/{commentId}/prefer/dislikes")
    public CommonResult<List<UmsMember>> listDislikeMembers(@PathVariable Integer commentId) {
        List<UmsMember> list = cmsCommentService.listMembersByCommentAndPreferType(commentId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取收藏该评论的用户列表")
    @GetMapping("/{commentId}/prefer/favorites")
    public CommonResult<List<UmsMember>> listFavoriteMembers(@PathVariable Integer commentId) {
        List<UmsMember> list = cmsCommentService.listMembersByCommentAndPreferType(commentId, 1);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户喜欢的评论列表")
    @GetMapping("/member/{memberId}/prefer/likes")
    public CommonResult<List<CmsComment>> listLikedComments(@PathVariable Integer memberId) {
        List<CmsComment> list = cmsCommentService.listCommentsByMemberAndPreferType(memberId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户不喜欢的评论列表")
    @GetMapping("/member/{memberId}/prefer/dislikes")
    public CommonResult<List<CmsComment>> listDislikedComments(@PathVariable Integer memberId) {
        List<CmsComment> list = cmsCommentService.listCommentsByMemberAndPreferType(memberId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户收藏的评论列表")
    @GetMapping("/member/{memberId}/prefer/favorites")
    public CommonResult<List<CmsComment>> listFavoriteComments(@PathVariable Integer memberId) {
        List<CmsComment> list = cmsCommentService.listCommentsByMemberAndPreferType(memberId, 1);
        return CommonResult.success(list);
    }
}
