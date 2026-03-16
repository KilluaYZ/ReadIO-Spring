package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.CmsMemberPreferPostCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferPostStatusResult;
import com.pool.readio.admin.dto.CmsPostDetail;
import com.pool.readio.admin.dto.CmsPostContentUpdateParam;
import com.pool.readio.admin.dto.BmsPostTagsParam;
import com.pool.readio.admin.service.CmsPostService;
import com.pool.readio.admin.service.PostContentService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.mongo.PostContent;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：帖子对普通用户开放的读写能力。
 * - 用户可以发布帖子、修改/删除自己的帖子；
 * - 获取帖子列表、帖子详情、帖子正文内容；
 * - 点赞 / 收藏 / 点踩 及其统计与状态查询；
 * - 通过标签筛选帖子。
 *
 * 说明：memberId、ip 等字段建议由网关或鉴权层从登录态注入。
 * 目前为方便联调，仍保留显式的 memberId 请求参数。
 */
@RestController
@Tag(name = "Portal-帖子", description = "Portal-帖子阅读与互动接口")
@RequestMapping("/portal/post")
public class PortalPostController {

    private final CmsPostService cmsPostService;
    private final PostContentService postContentService;

    public PortalPostController(CmsPostService cmsPostService,
                                PostContentService postContentService) {
        this.cmsPostService = cmsPostService;
        this.postContentService = postContentService;
    }

    // ====================== 帖子基础读写 ======================

    @Operation(summary = "分页获取帖子列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<CmsPost>> list(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<CmsPost> list = cmsPostService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取帖子的元信息")
    @GetMapping("/{id}")
    public CommonResult<CmsPost> getById(@PathVariable Integer id) {
        CmsPost item = cmsPostService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("帖子不存在");
    }

    @Operation(summary = "根据ID获取帖子详情（仅帖子元信息）")
    @GetMapping("/{id}/detail")
    public CommonResult<CmsPostDetail> getDetailById(@PathVariable Integer id) {
        CmsPostDetail item = cmsPostService.getDetailById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("帖子不存在");
    }

    @Operation(summary = "根据帖子ID从 MongoDB 获取帖子正文内容")
    @GetMapping("/{id}/content")
    public CommonResult<PostContent> getContentById(@PathVariable Integer id) {
        return postContentService.getByPostId(id)
                .map(CommonResult::success)
                .orElse(CommonResult.failed("该帖子暂无内容"));
    }

    @Operation(summary = "用户发布帖子（仅创建元信息，不含正文内容）")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody CmsPost record) {
        int n = cmsPostService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "用户保存或更新自己帖子的正文内容到 MongoDB")
    @PostMapping("/{id}/content")
    public CommonResult<Void> saveOrUpdateContent(@PathVariable Integer id,
                                                  @RequestBody CmsPostContentUpdateParam body) {
        if (body == null || body.getContent() == null) {
            return CommonResult.failed("内容不能为空");
        }
        postContentService.saveOrUpdate(id, body.getContent());
        return CommonResult.success(null);
    }

    @Operation(summary = "用户修改自己的帖子元信息")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody CmsPost record) {
        int n = cmsPostService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "用户删除自己的帖子")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int deleted = cmsPostService.deleteById(id);
        return deleted > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    // ====================== 标签相关 ======================

    @Operation(summary = "给帖子新增标签")
    @PostMapping("/tag/create")
    public CommonResult<Integer> createTag(@RequestBody BmsPostTagsParam record) {
        int n = cmsPostService.createTag(record.getPostId(), record.getNames());
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "删除帖子标签")
    @PostMapping("/tag/delete")
    public CommonResult<Integer> deleteTag(@RequestBody BmsPostTagsParam record) {
        int n = cmsPostService.deleteTag(record.getPostId(), record.getNames());
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "获取帖子标签名称列表")
    @GetMapping("/tag/list")
    public CommonResult<List<String>> getTagNames(@RequestParam Integer postId) {
        List<String> tagNames = cmsPostService.getTagNames(postId);
        return CommonResult.success(tagNames);
    }

    @Operation(summary = "根据标签名称获取帖子列表")
    @GetMapping("/tag/list/posts")
    public CommonResult<List<CmsPost>> getPostsByTagNames(@RequestParam String tagName) {
        List<CmsPost> posts = cmsPostService.getPostsByTagNames(tagName);
        return CommonResult.success(posts);
    }

    // ====================== 用户喜好（喜欢 / 不喜欢 / 收藏） ======================

    @Operation(summary = "用户喜欢某个帖子")
    @PostMapping("/{postId}/prefer/like")
    public CommonResult<Void> likePost(@PathVariable Integer postId,
                                       @RequestParam Integer memberId) {
        int n = cmsPostService.addMemberPrefer(memberId, postId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消喜欢某个帖子")
    @PostMapping("/{postId}/prefer/like/cancel")
    public CommonResult<Void> cancelLikePost(@PathVariable Integer postId,
                                             @RequestParam Integer memberId) {
        int n = cmsPostService.removeMemberPrefer(memberId, postId, 0);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户不喜欢某个帖子")
    @PostMapping("/{postId}/prefer/dislike")
    public CommonResult<Void> dislikePost(@PathVariable Integer postId,
                                          @RequestParam Integer memberId) {
        int n = cmsPostService.addMemberPrefer(memberId, postId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消不喜欢某个帖子")
    @PostMapping("/{postId}/prefer/dislike/cancel")
    public CommonResult<Void> cancelDislikePost(@PathVariable Integer postId,
                                                @RequestParam Integer memberId) {
        int n = cmsPostService.removeMemberPrefer(memberId, postId, 2);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户收藏某个帖子")
    @PostMapping("/{postId}/prefer/favorite")
    public CommonResult<Void> favoritePost(@PathVariable Integer postId,
                                           @RequestParam Integer memberId) {
        int n = cmsPostService.addMemberPrefer(memberId, postId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "用户取消收藏某个帖子")
    @PostMapping("/{postId}/prefer/favorite/cancel")
    public CommonResult<Void> cancelFavoritePost(@PathVariable Integer postId,
                                                 @RequestParam Integer memberId) {
        int n = cmsPostService.removeMemberPrefer(memberId, postId, 1);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("操作失败");
    }

    @Operation(summary = "获取某个帖子的喜欢/不喜欢/收藏人数统计")
    @GetMapping("/{postId}/prefer/count")
    public CommonResult<CmsMemberPreferPostCountResult> getPreferCount(@PathVariable Integer postId) {
        CmsMemberPreferPostCountResult result = new CmsMemberPreferPostCountResult();
        result.setLikeCount(cmsPostService.countMemberPreferByPost(postId, 0));
        result.setFavoriteCount(cmsPostService.countMemberPreferByPost(postId, 1));
        result.setDislikeCount(cmsPostService.countMemberPreferByPost(postId, 2));
        return CommonResult.success(result);
    }

    @Operation(summary = "获取某用户对该帖子的喜好状态")
    @GetMapping("/{postId}/prefer/status")
    public CommonResult<CmsMemberPreferPostStatusResult> getMemberPreferStatus(@PathVariable Integer postId,
                                                                               @RequestParam Integer memberId) {
        CmsMemberPreferPostStatusResult status = cmsPostService.getMemberPreferStatus(memberId, postId);
        return CommonResult.success(status);
    }

    @Operation(summary = "获取某用户喜欢的帖子列表")
    @GetMapping("/member/{memberId}/prefer/likes")
    public CommonResult<List<CmsPost>> listLikedPosts(@PathVariable Integer memberId) {
        List<CmsPost> list = cmsPostService.listPostsByMemberAndPreferType(memberId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户不喜欢的帖子列表")
    @GetMapping("/member/{memberId}/prefer/dislikes")
    public CommonResult<List<CmsPost>> listDislikedPosts(@PathVariable Integer memberId) {
        List<CmsPost> list = cmsPostService.listPostsByMemberAndPreferType(memberId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取某用户收藏的帖子列表")
    @GetMapping("/member/{memberId}/prefer/favorites")
    public CommonResult<List<CmsPost>> listFavoritePosts(@PathVariable Integer memberId) {
        List<CmsPost> list = cmsPostService.listPostsByMemberAndPreferType(memberId, 1);
        return CommonResult.success(list);
    }
}
