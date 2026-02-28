package com.pool.readio.admin.controller;

import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.admin.service.UmsMemberFollowRelationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户关注关系 Controller
 * 对应数据表 ums_member_follow_relation（follower_id 关注 flowee_id）
 */
@RestController
@Tag(name = "UmsMemberFollowRelationController", description = "用户关注关系")
@RequestMapping("/memberFollow")
public class UmsMemberFollowRelationController {

    @Autowired
    private UmsMemberFollowRelationService followRelationService;

    @Operation(summary = "关注：当前用户关注目标用户")
    @PostMapping("/follow")
    public CommonResult<Void> follow(@RequestParam Integer followerId,
                                    @RequestParam Integer floweeId) {
        int n = followRelationService.follow(followerId, floweeId);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("关注失败或已关注");
    }

    @Operation(summary = "取消关注")
    @PostMapping("/unfollow")
    public CommonResult<Void> unfollow(@RequestParam Integer followerId,
                                      @RequestParam Integer floweeId) {
        int n = followRelationService.unfollow(followerId, floweeId);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("取消关注失败或未关注");
    }

    @Operation(summary = "是否已关注")
    @GetMapping("/isFollowing")
    public CommonResult<Boolean> isFollowing(@RequestParam Integer followerId,
                                            @RequestParam Integer floweeId) {
        boolean following = followRelationService.isFollowing(followerId, floweeId);
        return CommonResult.success(following);
    }

    @Operation(summary = "某用户的关注数")
    @GetMapping("/member/{memberId}/followees/count")
    public CommonResult<Long> countFollowees(@PathVariable Integer memberId) {
        long count = followRelationService.countFollowees(memberId);
        return CommonResult.success(count);
    }

    @Operation(summary = "某用户的粉丝数")
    @GetMapping("/member/{memberId}/followers/count")
    public CommonResult<Long> countFollowers(@PathVariable Integer memberId) {
        long count = followRelationService.countFollowers(memberId);
        return CommonResult.success(count);
    }

    @Operation(summary = "某用户关注的人列表")
    @GetMapping("/member/{memberId}/followees")
    public CommonResult<List<UmsMember>> listFollowees(@PathVariable Integer memberId) {
        List<UmsMember> list = followRelationService.listFollowees(memberId);
        return CommonResult.success(list);
    }

    @Operation(summary = "某用户关注的人列表（分页）")
    @GetMapping("/member/{memberId}/followees/page")
    public CommonResult<CommonPage<UmsMember>> listFolloweesPage(
            @PathVariable Integer memberId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<UmsMember> list = followRelationService.listFolloweesPage(memberId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "某用户的粉丝列表")
    @GetMapping("/member/{memberId}/followers")
    public CommonResult<List<UmsMember>> listFollowers(@PathVariable Integer memberId) {
        List<UmsMember> list = followRelationService.listFollowers(memberId);
        return CommonResult.success(list);
    }

    @Operation(summary = "某用户的粉丝列表（分页）")
    @GetMapping("/member/{memberId}/followers/page")
    public CommonResult<CommonPage<UmsMember>> listFollowersPage(
            @PathVariable Integer memberId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<UmsMember> list = followRelationService.listFollowersPage(memberId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
