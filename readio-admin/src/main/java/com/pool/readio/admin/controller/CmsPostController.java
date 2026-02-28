package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.CmsPostContentBlockParam;
import com.pool.readio.admin.dto.CmsPostDetail;
import com.pool.readio.admin.dto.CmsMemberPreferPostCountResult;
import com.pool.readio.admin.dto.CmsMemberPreferPostStatusResult;
import com.pool.readio.admin.service.CmsPostService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.CmsPost;
import com.pool.readio.mbg.model.UmsMember;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pool.readio.admin.dto.BmsPostTagsParam;

import java.util.List;

@RestController
@Tag(name = "CmsPostController", description = "帖子管理")
@RequestMapping("/post")
public class CmsPostController {

    @Autowired
    private CmsPostService cmsPostService;

    @Operation(summary = "获取所有帖子")
    @GetMapping("/listAll")
    public CommonResult<List<CmsPost>> listAll() {
        return CommonResult.success(cmsPostService.listAll());
    }

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

    @Operation(summary = "根据ID获取帖子详情（含按 order 排序的内容块列表）")
    @GetMapping("/{id}/detail")
    public CommonResult<CmsPostDetail> getDetailById(@PathVariable Integer id) {
        CmsPostDetail item = cmsPostService.getDetailById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("帖子不存在");
    }

    @Operation(summary = "向帖子追加一个内容块（前端传入一段文本，加入该帖子的 contentBlocks）")
    @PostMapping("/{id}/content-block/add")
    public CommonResult<Integer> addContentBlock(@PathVariable Integer id,
                                                @RequestBody CmsPostContentBlockParam param) {
        if (param == null || param.getContent() == null || param.getContent().isBlank()) {
            return CommonResult.failed("内容不能为空");
        }
        Integer blockId = cmsPostService.addContentBlock(id, param);
        if (blockId == null) {
            return CommonResult.failed("帖子不存在或添加失败");
        }
        return CommonResult.success(blockId);
    }

    @Operation(summary = "删除帖子的全部内容块")
    @PostMapping("/{id}/content-blocks/delete")
    public CommonResult<Integer> deleteContentBlocks(@PathVariable Integer id) {
        int deleted = cmsPostService.deleteContentBlocksByPostId(id);
        return CommonResult.success(deleted);
    }

    @Operation(summary = "新增帖子")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody CmsPost record) {
        int n = cmsPostService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新帖子")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody CmsPost record) {
        int n = cmsPostService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除帖子")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int deleted = cmsPostService.deleteContentBlocksByPostId(id);
        if (deleted <= 0) {
            return CommonResult.failed("删除内容块失败");
        }
        deleted = cmsPostService.deleteById(id);
        return deleted > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "新增帖子标签")
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

    @Operation(summary = "根据标签名称列表获取帖子列表")
    @GetMapping("/tag/list/posts")
    public CommonResult<List<CmsPost>> getPostsByTagNames(@RequestParam String tagName) {
        List<CmsPost> posts = cmsPostService.getPostsByTagNames(tagName);
        return CommonResult.success(posts);
    }

    // ===================== 用户喜好（喜欢 / 不喜欢 / 收藏）相关 =====================

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

    @Operation(summary = "获取喜欢该帖子的用户列表")
    @GetMapping("/{postId}/prefer/likes")
    public CommonResult<List<UmsMember>> listLikeMembers(@PathVariable Integer postId) {
        List<UmsMember> list = cmsPostService.listMembersByPostAndPreferType(postId, 0);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取不喜欢该帖子的用户列表")
    @GetMapping("/{postId}/prefer/dislikes")
    public CommonResult<List<UmsMember>> listDislikeMembers(@PathVariable Integer postId) {
        List<UmsMember> list = cmsPostService.listMembersByPostAndPreferType(postId, 2);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取收藏该帖子的用户列表")
    @GetMapping("/{postId}/prefer/favorites")
    public CommonResult<List<UmsMember>> listFavoriteMembers(@PathVariable Integer postId) {
        List<UmsMember> list = cmsPostService.listMembersByPostAndPreferType(postId, 1);
        return CommonResult.success(list);
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
