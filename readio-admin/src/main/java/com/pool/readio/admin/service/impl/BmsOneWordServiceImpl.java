package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.CmsMemberPreferOneWordStatusResult;
import com.pool.readio.admin.service.BmsOneWordService;
import com.pool.readio.mbg.mapper.BmsOneWordMapper;
import com.pool.readio.mbg.mapper.CmsMemberPreferOneWordRelationMapper;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.BmsOneWord;
import com.pool.readio.mbg.model.BmsOneWordExample;
import com.pool.readio.mbg.model.CmsMemberPreferOneWordRelation;
import com.pool.readio.mbg.model.CmsMemberPreferOneWordRelationExample;
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
public class BmsOneWordServiceImpl implements BmsOneWordService {

    @Autowired
    private BmsOneWordMapper bmsOneWordMapper;

    @Autowired
    private CmsMemberPreferOneWordRelationMapper cmsMemberPreferOneWordRelationMapper;

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<BmsOneWord> listAll() {
        BmsOneWordExample ex = new BmsOneWordExample();
        ex.setOrderByClause("create_time DESC");
        return bmsOneWordMapper.selectByExample(ex);
    }

    @Override
    public List<BmsOneWord> list(Integer bookId, String contentKeyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsOneWordExample ex = new BmsOneWordExample();
        ex.setOrderByClause("create_time DESC");
        BmsOneWordExample.Criteria c = ex.createCriteria();
        if (bookId != null) {
            c.andBookIdEqualTo(bookId);
        }
        if (StringUtils.hasText(contentKeyword)) {
            c.andContentLike("%" + contentKeyword.trim() + "%");
        }
        return bmsOneWordMapper.selectByExample(ex);
    }

    @Override
    public BmsOneWord getById(Integer id) {
        return bmsOneWordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BmsOneWord> listByBookId(Integer bookId) {
        if (bookId == null) return List.of();
        BmsOneWordExample ex = new BmsOneWordExample();
        ex.createCriteria().andBookIdEqualTo(bookId);
        ex.setOrderByClause("create_time DESC");
        return bmsOneWordMapper.selectByExample(ex);
    }

    @Override
    public List<BmsOneWord> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize) {
        if (bookId == null) return List.of();
        PageHelper.startPage(pageNum, pageSize);
        BmsOneWordExample ex = new BmsOneWordExample();
        ex.createCriteria().andBookIdEqualTo(bookId);
        ex.setOrderByClause("create_time DESC");
        return bmsOneWordMapper.selectByExample(ex);
    }

    @Override
    public int create(BmsOneWord record) {
        return bmsOneWordMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsOneWord record) {
        record.setId(id);
        return bmsOneWordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsOneWordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) return 0;
        BmsOneWordExample ex = new BmsOneWordExample();
        ex.createCriteria().andIdIn(ids);
        return bmsOneWordMapper.deleteByExample(ex);
    }

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    @Override
    public int addMemberPrefer(Integer memberId, Integer oneWordId, Integer type) {
        if (memberId == null || oneWordId == null || type == null) {
            return 0;
        }
        CmsMemberPreferOneWordRelationExample ex = new CmsMemberPreferOneWordRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andOneWorkdIdEqualTo(oneWordId)
                .andTypeEqualTo(type);
        cmsMemberPreferOneWordRelationMapper.deleteByExample(ex);

        CmsMemberPreferOneWordRelation rel = new CmsMemberPreferOneWordRelation();
        rel.setMemberId(memberId);
        rel.setOneWorkdId(oneWordId);
        rel.setType(type);
        return cmsMemberPreferOneWordRelationMapper.insertSelective(rel);
    }

    @Override
    public int removeMemberPrefer(Integer memberId, Integer oneWordId, Integer type) {
        if (memberId == null || oneWordId == null || type == null) {
            return 0;
        }
        CmsMemberPreferOneWordRelationExample ex = new CmsMemberPreferOneWordRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andOneWorkdIdEqualTo(oneWordId)
                .andTypeEqualTo(type);
        return cmsMemberPreferOneWordRelationMapper.deleteByExample(ex);
    }

    @Override
    public long countMemberPreferByOneWord(Integer oneWordId, Integer type) {
        if (oneWordId == null || type == null) {
            return 0L;
        }
        CmsMemberPreferOneWordRelationExample ex = new CmsMemberPreferOneWordRelationExample();
        ex.createCriteria()
                .andOneWorkdIdEqualTo(oneWordId)
                .andTypeEqualTo(type);
        return cmsMemberPreferOneWordRelationMapper.countByExample(ex);
    }

    @Override
    public List<UmsMember> listMembersByOneWordAndPreferType(Integer oneWordId, Integer type) {
        if (oneWordId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferOneWordRelationExample ex = new CmsMemberPreferOneWordRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andOneWorkdIdEqualTo(oneWordId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferOneWordRelation> relations = cmsMemberPreferOneWordRelationMapper.selectByExample(ex);
        List<Integer> memberIds = relations.stream()
                .map(CmsMemberPreferOneWordRelation::getMemberId)
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
    public List<BmsOneWord> listOneWordsByMemberAndPreferType(Integer memberId, Integer type) {
        if (memberId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferOneWordRelationExample ex = new CmsMemberPreferOneWordRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferOneWordRelation> relations = cmsMemberPreferOneWordRelationMapper.selectByExample(ex);
        List<Integer> oneWordIds = relations.stream()
                .map(CmsMemberPreferOneWordRelation::getOneWorkdId)
                .collect(Collectors.toList());
        if (oneWordIds.isEmpty()) {
            return new ArrayList<>();
        }
        BmsOneWordExample oneWordExample = new BmsOneWordExample();
        oneWordExample.createCriteria().andIdIn(oneWordIds);
        List<BmsOneWord> oneWords = bmsOneWordMapper.selectByExample(oneWordExample);
        Map<Integer, BmsOneWord> idToOneWord = new LinkedHashMap<>();
        for (BmsOneWord w : oneWords) {
            idToOneWord.put(w.getId(), w);
        }
        List<BmsOneWord> result = new ArrayList<>();
        for (Integer id : oneWordIds) {
            if (idToOneWord.containsKey(id)) {
                result.add(idToOneWord.get(id));
            }
        }
        return result;
    }

    @Override
    public CmsMemberPreferOneWordStatusResult getMemberPreferStatus(Integer memberId, Integer oneWordId) {
        CmsMemberPreferOneWordStatusResult status = new CmsMemberPreferOneWordStatusResult();
        if (memberId == null || oneWordId == null) {
            status.setLiked(false);
            status.setFavorited(false);
            status.setDisliked(false);
            return status;
        }
        CmsMemberPreferOneWordRelationExample ex = new CmsMemberPreferOneWordRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andOneWorkdIdEqualTo(oneWordId);
        List<CmsMemberPreferOneWordRelation> relations = cmsMemberPreferOneWordRelationMapper.selectByExample(ex);
        boolean liked = false;
        boolean favorited = false;
        boolean disliked = false;
        for (CmsMemberPreferOneWordRelation rel : relations) {
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
