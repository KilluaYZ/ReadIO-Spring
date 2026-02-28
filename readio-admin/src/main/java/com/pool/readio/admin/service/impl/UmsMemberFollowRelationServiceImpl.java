package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.service.UmsMemberFollowRelationService;
import com.pool.readio.mbg.mapper.UmsMemberFollowRelationMapper;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberFollowRelation;
import com.pool.readio.mbg.model.UmsMemberFollowRelationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户关注关系 Service 实现，对应 ums_member_follow_relation
 */
@Service
public class UmsMemberFollowRelationServiceImpl implements UmsMemberFollowRelationService {

    @Autowired
    private UmsMemberFollowRelationMapper followRelationMapper;

    @Autowired
    private UmsMemberMapper memberMapper;

    @Override
    public int follow(Integer followerId, Integer floweeId) {
        if (followerId == null || floweeId == null || followerId.equals(floweeId)) {
            return 0;
        }
        UmsMemberFollowRelationExample example = new UmsMemberFollowRelationExample();
        example.createCriteria().andFollowerIdEqualTo(followerId).andFloweeIdEqualTo(floweeId);
        if (followRelationMapper.countByExample(example) > 0) {
            return 0; // 已关注
        }
        UmsMemberFollowRelation relation = new UmsMemberFollowRelation();
        relation.setFollowerId(followerId);
        relation.setFloweeId(floweeId);
        relation.setCreateTime(new Date());
        return followRelationMapper.insertSelective(relation);
    }

    @Override
    public int unfollow(Integer followerId, Integer floweeId) {
        if (followerId == null || floweeId == null) {
            return 0;
        }
        UmsMemberFollowRelationExample example = new UmsMemberFollowRelationExample();
        example.createCriteria().andFollowerIdEqualTo(followerId).andFloweeIdEqualTo(floweeId);
        return followRelationMapper.deleteByExample(example);
    }

    @Override
    public boolean isFollowing(Integer followerId, Integer floweeId) {
        if (followerId == null || floweeId == null) {
            return false;
        }
        UmsMemberFollowRelationExample example = new UmsMemberFollowRelationExample();
        example.createCriteria().andFollowerIdEqualTo(followerId).andFloweeIdEqualTo(floweeId);
        return followRelationMapper.countByExample(example) > 0;
    }

    @Override
    public long countFollowees(Integer memberId) {
        if (memberId == null) {
            return 0;
        }
        UmsMemberFollowRelationExample example = new UmsMemberFollowRelationExample();
        example.createCriteria().andFollowerIdEqualTo(memberId);
        return followRelationMapper.countByExample(example);
    }

    @Override
    public long countFollowers(Integer memberId) {
        if (memberId == null) {
            return 0;
        }
        UmsMemberFollowRelationExample example = new UmsMemberFollowRelationExample();
        example.createCriteria().andFloweeIdEqualTo(memberId);
        return followRelationMapper.countByExample(example);
    }

    @Override
    public List<UmsMember> listFollowees(Integer memberId) {
        return listFolloweesInternal(memberId, null, null);
    }

    @Override
    public List<UmsMember> listFolloweesPage(Integer memberId, Integer pageNum, Integer pageSize) {
        return listFolloweesInternal(memberId, pageNum, pageSize);
    }

    private List<UmsMember> listFolloweesInternal(Integer memberId, Integer pageNum, Integer pageSize) {
        if (memberId == null) {
            return List.of();
        }
        UmsMemberFollowRelationExample example = new UmsMemberFollowRelationExample();
        example.createCriteria().andFollowerIdEqualTo(memberId);
        example.setOrderByClause("create_time DESC");
        if (pageNum != null && pageSize != null) {
            PageHelper.startPage(pageNum, pageSize);
        }
        List<UmsMemberFollowRelation> relations = followRelationMapper.selectByExample(example);
        return toMemberList(relations.stream().map(UmsMemberFollowRelation::getFloweeId).collect(Collectors.toList()));
    }

    @Override
    public List<UmsMember> listFollowers(Integer memberId) {
        return listFollowersInternal(memberId, null, null);
    }

    @Override
    public List<UmsMember> listFollowersPage(Integer memberId, Integer pageNum, Integer pageSize) {
        return listFollowersInternal(memberId, pageNum, pageSize);
    }

    private List<UmsMember> listFollowersInternal(Integer memberId, Integer pageNum, Integer pageSize) {
        if (memberId == null) {
            return List.of();
        }
        UmsMemberFollowRelationExample example = new UmsMemberFollowRelationExample();
        example.createCriteria().andFloweeIdEqualTo(memberId);
        example.setOrderByClause("create_time DESC");
        if (pageNum != null && pageSize != null) {
            PageHelper.startPage(pageNum, pageSize);
        }
        List<UmsMemberFollowRelation> relations = followRelationMapper.selectByExample(example);
        return toMemberList(relations.stream().map(UmsMemberFollowRelation::getFollowerId).collect(Collectors.toList()));
    }

    private List<UmsMember> toMemberList(List<Integer> memberIds) {
        if (memberIds == null || memberIds.isEmpty()) {
            return List.of();
        }
        List<UmsMember> result = new ArrayList<>();
        for (Integer id : memberIds) {
            UmsMember member = memberMapper.selectByPrimaryKey(id);
            if (member != null) {
                result.add(member);
            }
        }
        return result;
    }
}
