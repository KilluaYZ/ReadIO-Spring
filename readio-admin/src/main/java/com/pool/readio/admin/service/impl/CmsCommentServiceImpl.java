package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.CmsMemberPreferCommentStatusResult;
import com.pool.readio.admin.service.CmsCommentService;
import com.pool.readio.mbg.mapper.CmsCommentMapper;
import com.pool.readio.mbg.mapper.CmsMemberPreferCommentRelationMapper;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.CmsComment;
import com.pool.readio.mbg.model.CmsCommentExample;
import com.pool.readio.mbg.model.CmsMemberPreferCommentRelation;
import com.pool.readio.mbg.model.CmsMemberPreferCommentRelationExample;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CmsCommentServiceImpl implements CmsCommentService {

    @Autowired
    private CmsCommentMapper cmsCommentMapper;

    @Autowired
    private CmsMemberPreferCommentRelationMapper cmsMemberPreferCommentRelationMapper;

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<CmsComment> listAll() {
        CmsCommentExample ex = new CmsCommentExample();
        ex.setOrderByClause("create_time DESC");
        return cmsCommentMapper.selectByExample(ex);
    }

    @Override
    public List<CmsComment> list(Integer type, Integer memberId, Integer bookId, Integer postId,
                               Integer selectId, Integer commentId, String contentKeyword,
                               Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsCommentExample ex = new CmsCommentExample();
        ex.setOrderByClause("create_time DESC");
        CmsCommentExample.Criteria c = ex.createCriteria();
        if (type != null) c.andTypeEqualTo(type);
        if (memberId != null) c.andMemberIdEqualTo(memberId);
        if (bookId != null) c.andBookIdEqualTo(bookId);
        if (postId != null) c.andPostIdEqualTo(postId);
        if (selectId != null) c.andSelectIdEqualTo(selectId);
        if (commentId != null) c.andCommentIdEqualTo(commentId);
        if (StringUtils.hasText(contentKeyword)) c.andContentLike("%" + contentKeyword.trim() + "%");
        return cmsCommentMapper.selectByExample(ex);
    }

    @Override
    public CmsComment getById(Integer id) {
        return cmsCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CmsComment> listByPostId(Integer postId) {
        if (postId == null) return List.of();
        CmsCommentExample ex = new CmsCommentExample();
        ex.createCriteria().andPostIdEqualTo(postId);
        ex.setOrderByClause("create_time DESC");
        return cmsCommentMapper.selectByExample(ex);
    }

    @Override
    public List<CmsComment> listByPostIdPage(Integer postId, Integer pageNum, Integer pageSize) {
        if (postId == null) return List.of();
        PageHelper.startPage(pageNum, pageSize);
        return listByPostId(postId);
    }

    @Override
    public List<CmsComment> listByBookId(Integer bookId) {
        if (bookId == null) return List.of();
        CmsCommentExample ex = new CmsCommentExample();
        ex.createCriteria().andBookIdEqualTo(bookId);
        ex.setOrderByClause("create_time DESC");
        return cmsCommentMapper.selectByExample(ex);
    }

    @Override
    public List<CmsComment> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize) {
        if (bookId == null) return List.of();
        PageHelper.startPage(pageNum, pageSize);
        return listByBookId(bookId);
    }

    @Override
    public List<CmsComment> listBySelectId(Integer selectId) {
        if (selectId == null) return List.of();
        CmsCommentExample ex = new CmsCommentExample();
        ex.createCriteria().andSelectIdEqualTo(selectId);
        ex.setOrderByClause("create_time DESC");
        return cmsCommentMapper.selectByExample(ex);
    }

    @Override
    public List<CmsComment> listBySelectIdPage(Integer selectId, Integer pageNum, Integer pageSize) {
        if (selectId == null) return List.of();
        PageHelper.startPage(pageNum, pageSize);
        return listBySelectId(selectId);
    }

    @Override
    public List<CmsComment> listRepliesByCommentId(Integer commentId) {
        if (commentId == null) return List.of();
        CmsCommentExample ex = new CmsCommentExample();
        ex.createCriteria().andCommentIdEqualTo(commentId);
        ex.setOrderByClause("create_time ASC");
        return cmsCommentMapper.selectByExample(ex);
    }

    @Override
    public List<CmsComment> listRepliesByCommentIdPage(Integer commentId, Integer pageNum, Integer pageSize) {
        if (commentId == null) return List.of();
        PageHelper.startPage(pageNum, pageSize);
        return listRepliesByCommentId(commentId);
    }

    @Override
    public int create(CmsComment record) {
        return cmsCommentMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, CmsComment record) {
        record.setId(id);
        return cmsCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return cmsCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) return 0;
        CmsCommentExample ex = new CmsCommentExample();
        ex.createCriteria().andIdIn(ids);
        return cmsCommentMapper.deleteByExample(ex);
    }

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    @Override
    public int addMemberPrefer(Integer memberId, Integer commentId, Integer type) {
        if (memberId == null || commentId == null || type == null) {
            return 0;
        }
        CmsMemberPreferCommentRelationExample ex = new CmsMemberPreferCommentRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andCommentIdEqualTo(commentId)
                .andTypeEqualTo(type);
        cmsMemberPreferCommentRelationMapper.deleteByExample(ex);

        CmsMemberPreferCommentRelation rel = new CmsMemberPreferCommentRelation();
        rel.setMemberId(memberId);
        rel.setCommentId(commentId);
        rel.setType(type);
        return cmsMemberPreferCommentRelationMapper.insertSelective(rel);
    }

    @Override
    public int removeMemberPrefer(Integer memberId, Integer commentId, Integer type) {
        if (memberId == null || commentId == null || type == null) {
            return 0;
        }
        CmsMemberPreferCommentRelationExample ex = new CmsMemberPreferCommentRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andCommentIdEqualTo(commentId)
                .andTypeEqualTo(type);
        return cmsMemberPreferCommentRelationMapper.deleteByExample(ex);
    }

    @Override
    public long countMemberPreferByComment(Integer commentId, Integer type) {
        if (commentId == null || type == null) {
            return 0L;
        }
        CmsMemberPreferCommentRelationExample ex = new CmsMemberPreferCommentRelationExample();
        ex.createCriteria()
                .andCommentIdEqualTo(commentId)
                .andTypeEqualTo(type);
        return cmsMemberPreferCommentRelationMapper.countByExample(ex);
    }

    @Override
    public List<UmsMember> listMembersByCommentAndPreferType(Integer commentId, Integer type) {
        if (commentId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferCommentRelationExample ex = new CmsMemberPreferCommentRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andCommentIdEqualTo(commentId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferCommentRelation> relations = cmsMemberPreferCommentRelationMapper.selectByExample(ex);
        List<Integer> memberIds = relations.stream()
                .map(CmsMemberPreferCommentRelation::getMemberId)
                .collect(Collectors.toList());
        if (memberIds.isEmpty()) {
            return new ArrayList<>();
        }
        UmsMemberExample memberExample = new UmsMemberExample();
        memberExample.createCriteria().andIdIn(memberIds);
        List<UmsMember> members = umsMemberMapper.selectByExample(memberExample);
        Map<Integer, UmsMember> idToMember = new LinkedHashMap<>();
        for (UmsMember m : members) {
            idToMember.put(m.getId(), m);
        }
        List<UmsMember> result = new ArrayList<>();
        for (Integer id : memberIds) {
            if (idToMember.containsKey(id)) {
                result.add(idToMember.get(id));
            }
        }
        return result;
    }

    @Override
    public List<CmsComment> listCommentsByMemberAndPreferType(Integer memberId, Integer type) {
        if (memberId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferCommentRelationExample ex = new CmsMemberPreferCommentRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferCommentRelation> relations = cmsMemberPreferCommentRelationMapper.selectByExample(ex);
        List<Integer> commentIds = relations.stream()
                .map(CmsMemberPreferCommentRelation::getCommentId)
                .collect(Collectors.toList());
        if (commentIds.isEmpty()) {
            return new ArrayList<>();
        }
        CmsCommentExample commentExample = new CmsCommentExample();
        commentExample.createCriteria().andIdIn(commentIds);
        List<CmsComment> comments = cmsCommentMapper.selectByExample(commentExample);
        Map<Integer, CmsComment> idToComment = new LinkedHashMap<>();
        for (CmsComment c : comments) {
            idToComment.put(c.getId(), c);
        }
        List<CmsComment> result = new ArrayList<>();
        for (Integer id : commentIds) {
            if (idToComment.containsKey(id)) {
                result.add(idToComment.get(id));
            }
        }
        return result;
    }

    @Override
    public CmsMemberPreferCommentStatusResult getMemberPreferStatus(Integer memberId, Integer commentId) {
        CmsMemberPreferCommentStatusResult status = new CmsMemberPreferCommentStatusResult();
        if (memberId == null || commentId == null) {
            status.setLiked(false);
            status.setFavorited(false);
            status.setDisliked(false);
            return status;
        }
        CmsMemberPreferCommentRelationExample ex = new CmsMemberPreferCommentRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andCommentIdEqualTo(commentId);
        List<CmsMemberPreferCommentRelation> relations = cmsMemberPreferCommentRelationMapper.selectByExample(ex);
        boolean liked = false;
        boolean favorited = false;
        boolean disliked = false;
        for (CmsMemberPreferCommentRelation rel : relations) {
            if (rel.getType() == null) {
                continue;
            }
            if (rel.getType() == 0) {
                liked = true;
            } else if (rel.getType() == 1) {
                favorited = true;
            } else if (rel.getType() == 2) {
                disliked = true;
            }
        }
        status.setLiked(liked);
        status.setFavorited(favorited);
        status.setDisliked(disliked);
        return status;
    }
}
