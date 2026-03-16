package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.CmsMemberPreferCommentCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferCommentStatusResult;
import com.pool.readio.admin.service.CmsCommentService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.CmsComment;
import com.pool.readio.mbg.model.UmsMember;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：评论接口（帖子/书籍/选中段落等），面向普通用户。
 *
 * - 用户可以新增评论、修改/删除自己的评论；
 * - 按帖子、书籍、选中段落、评论 ID 获取评论列表及分页列表；
 * - 对评论进行喜欢/收藏/不喜欢等操作，并获取统计与状态信息。
 *
 * 说明：memberId 建议由鉴权层从登录态中解析并注入，这里仍通过参数显式传入以便联调。
 */
@RestController
@Tag(name = "Portal-评论", description = "Portal-评论阅读与互动接口")
@RequestMapping("/portal/comment")
public class PortalCommentController {

    private final CmsCommentService cmsCommentService;

    public PortalCommentController(CmsCommentService cmsCommentService) {
        this.cmsCommentService = cmsCommentService;
    }

    // ===================== 查询类接口 =====================

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

    @Operation(summary = "根据ID获取评论详情")
    @GetMapping("/{id}")
    public CommonResult<CmsComment> getById(@PathVariable Integer id) {
        CmsComment item = cmsCommentService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("评论不存在");
    }

    // ===================== 新增 / 修改 / 删除（含权限检查） =====================

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

    @Operation(summary = "更新评论（仅本人可操作）")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id,
                                     @RequestParam Integer memberId,
                                     @RequestBody CmsComment record) {
        CmsComment exist = cmsCommentService.getById(id);
        if (exist == null) {
            return CommonResult.failed("评论不存在");
        }
        if (exist.getMemberId() == null || !exist.getMemberId().equals(memberId)) {
            return CommonResult.failed("无权限修改该评论");
        }
        // 防止恶意篡改 memberId，强制保持为原作者
        record.setMemberId(exist.getMemberId());
        int n = cmsCommentService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除评论（仅本人可操作）")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id,
                                     @RequestParam Integer memberId) {
        CmsComment exist = cmsCommentService.getById(id);
        if (exist == null) {
            return CommonResult.failed("评论不存在");
        }
        if (exist.getMemberId() == null || !exist.getMemberId().equals(memberId)) {
            return CommonResult.failed("无权限删除该评论");
        }
        int n = cmsCommentService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    // ===================== 用户喜好（喜欢 / 不喜欢 / 收藏） =====================

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

