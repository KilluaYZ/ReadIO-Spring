package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 用户关注关系 Service，对应 ums_member_follow_relation
 * follower_id 关注 flowee_id（关注者 -> 被关注者）
 */
public interface UmsMemberFollowRelationService {

    /**
     * 关注：followerId 关注 floweeId
     *
     * @return 1 表示新关注成功，0 表示已关注或参数无效
     */
    int follow(Integer followerId, Integer floweeId);

    /**
     * 取消关注
     *
     * @return 删除的记录数
     */
    int unfollow(Integer followerId, Integer floweeId);

    /**
     * 是否已关注
     */
    boolean isFollowing(Integer followerId, Integer floweeId);

    /**
     * 某用户关注的人数（关注数）
     */
    long countFollowees(Integer memberId);

    /**
     * 某用户的粉丝数
     */
    long countFollowers(Integer memberId);

    /**
     * 某用户关注的人列表（UmsMember）
     */
    List<UmsMember> listFollowees(Integer memberId);

    /**
     * 某用户的粉丝列表（UmsMember）
     */
    List<UmsMember> listFollowers(Integer memberId);

    /**
     * 某用户关注的人列表（分页）
     */
    List<UmsMember> listFolloweesPage(Integer memberId, Integer pageNum, Integer pageSize);

    /**
     * 某用户的粉丝列表（分页）
     */
    List<UmsMember> listFollowersPage(Integer memberId, Integer pageNum, Integer pageSize);
}
