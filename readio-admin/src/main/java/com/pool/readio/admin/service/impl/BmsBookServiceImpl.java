package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.BmsBookQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookStatusResult;
import com.pool.readio.admin.service.BmsBookService;
import com.pool.readio.mbg.mapper.BmsBookMapper;
import com.pool.readio.mbg.mapper.CmsMemberPreferBookRelationMapper;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookExample;
import com.pool.readio.mbg.model.CmsMemberPreferBookRelation;
import com.pool.readio.mbg.model.CmsMemberPreferBookRelationExample;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BmsBookServiceImpl implements BmsBookService {

    @Autowired
    private BmsBookMapper bmsBookMapper;

    @Autowired
    private CmsMemberPreferBookRelationMapper cmsMemberPreferBookRelationMapper;

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public List<BmsBook> listAll() {
        return bmsBookMapper.selectByExample(new BmsBookExample());
    }

    @Override
    public List<BmsBook> list(BmsBookQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookExample example = new BmsBookExample();
        example.setOrderByClause("id DESC");
        BmsBookExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (StringUtils.hasText(queryParam.getNameKeyword())) {
                criteria.andNameLike("%" + queryParam.getNameKeyword().trim() + "%");
            }
            if (StringUtils.hasText(queryParam.getDescriptionKeyword())) {
                criteria.andDescriptionLike("%" + queryParam.getDescriptionKeyword().trim() + "%");
            }
            if (queryParam.getAuthorId() != null) {
                criteria.andAuthorIdEqualTo(queryParam.getAuthorId());
            }
            if (queryParam.getBookCategoryId() != null) {
                criteria.andBookCategoryIdEqualTo(queryParam.getBookCategoryId());
            }
            if (queryParam.getPublisherId() != null) {
                criteria.andPublisherIdEqualTo(queryParam.getPublisherId());
            }
            if (StringUtils.hasText(queryParam.getIsbn())) {
                String isbn = queryParam.getIsbn().trim();
                criteria.andIsbnLike("%" + isbn + "%");
            }
            if (StringUtils.hasText(queryParam.getLanguage())) {
                criteria.andLanguageEqualTo(queryParam.getLanguage().trim());
            }
            if (StringUtils.hasText(queryParam.getCreateTime())) {
                String prefix = queryParam.getCreateTime().trim();
                Date[] range = parseCreateTimePrefix(prefix);
                if (range != null) {
                    criteria.andCreateTimeGreaterThanOrEqualTo(range[0]);
                    criteria.andCreateTimeLessThan(range[1]);
                }
            }
        }
        return bmsBookMapper.selectByExample(example);
    }

    /**
     * 解析创建时间前缀为 [起始时间, 结束时间)，如 2024-01 -> 该月范围
     */
    private Date[] parseCreateTimePrefix(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return null;
        }
        try {
            LocalDate start;
            LocalDate end;
            if (prefix.length() == 4) {
                start = LocalDate.of(Integer.parseInt(prefix), 1, 1);
                end = start.plusYears(1);
            } else if (prefix.length() == 7) {
                int y = Integer.parseInt(prefix.substring(0, 4));
                int m = Integer.parseInt(prefix.substring(5, 7));
                start = LocalDate.of(y, m, 1);
                end = start.plusMonths(1);
            } else if (prefix.length() >= 10) {
                start = LocalDate.parse(prefix.substring(0, 10));
                end = start.plusDays(1);
            } else {
                return null;
            }
            ZoneId zone = ZoneId.systemDefault();
            return new Date[]{
                    Date.from(start.atStartOfDay(zone).toInstant()),
                    Date.from(end.atStartOfDay(zone).toInstant())
            };
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public BmsBook getById(Integer id) {
        return bmsBookMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsBook record) {
        return bmsBookMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBook record) {
        record.setId(id);
        return bmsBookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsBookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        BmsBookExample example = new BmsBookExample();
        example.createCriteria().andIdIn(ids);
        return bmsBookMapper.deleteByExample(example);
    }

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    @Override
    public int addMemberPrefer(Integer memberId, Integer bookId, Integer type) {
        if (memberId == null || bookId == null || type == null) {
            return 0;
        }
        CmsMemberPreferBookRelationExample ex = new CmsMemberPreferBookRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andBookIdEqualTo(bookId)
                .andTypeEqualTo(type);
        // 先删除可能存在的重复关系，保证幂等
        cmsMemberPreferBookRelationMapper.deleteByExample(ex);

        CmsMemberPreferBookRelation rel = new CmsMemberPreferBookRelation();
        rel.setMemberId(memberId);
        rel.setBookId(bookId);
        rel.setType(type);
        return cmsMemberPreferBookRelationMapper.insertSelective(rel);
    }

    @Override
    public int removeMemberPrefer(Integer memberId, Integer bookId, Integer type) {
        if (memberId == null || bookId == null || type == null) {
            return 0;
        }
        CmsMemberPreferBookRelationExample ex = new CmsMemberPreferBookRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andBookIdEqualTo(bookId)
                .andTypeEqualTo(type);
        return cmsMemberPreferBookRelationMapper.deleteByExample(ex);
    }

    @Override
    public long countMemberPreferByBook(Integer bookId, Integer type) {
        if (bookId == null || type == null) {
            return 0L;
        }
        CmsMemberPreferBookRelationExample ex = new CmsMemberPreferBookRelationExample();
        ex.createCriteria()
                .andBookIdEqualTo(bookId)
                .andTypeEqualTo(type);
        return cmsMemberPreferBookRelationMapper.countByExample(ex);
    }

    @Override
    public List<UmsMember> listMembersByBookAndPreferType(Integer bookId, Integer type) {
        if (bookId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferBookRelationExample ex = new CmsMemberPreferBookRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andBookIdEqualTo(bookId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferBookRelation> relations = cmsMemberPreferBookRelationMapper.selectByExample(ex);
        List<Integer> memberIds = relations.stream()
                .map(CmsMemberPreferBookRelation::getMemberId)
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
    public List<BmsBook> listBooksByMemberAndPreferType(Integer memberId, Integer type) {
        if (memberId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferBookRelationExample ex = new CmsMemberPreferBookRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferBookRelation> relations = cmsMemberPreferBookRelationMapper.selectByExample(ex);
        List<Integer> bookIds = relations.stream()
                .map(CmsMemberPreferBookRelation::getBookId)
                .collect(Collectors.toList());
        if (bookIds.isEmpty()) {
            return new ArrayList<>();
        }
        BmsBookExample bookExample = new BmsBookExample();
        bookExample.createCriteria().andIdIn(bookIds);
        List<BmsBook> books = bmsBookMapper.selectByExample(bookExample);
        Map<Integer, BmsBook> idToBook = new LinkedHashMap<>();
        for (BmsBook b : books) {
            idToBook.put(b.getId(), b);
        }
        List<BmsBook> result = new ArrayList<>();
        for (Integer id : bookIds) {
            if (idToBook.containsKey(id)) {
                result.add(idToBook.get(id));
            }
        }
        return result;
    }

    @Override
    public CmsMemberPreferBookStatusResult getMemberPreferStatus(Integer memberId, Integer bookId) {
        CmsMemberPreferBookStatusResult status = new CmsMemberPreferBookStatusResult();
        if (memberId == null || bookId == null) {
            status.setLiked(false);
            status.setFavorited(false);
            status.setDisliked(false);
            return status;
        }
        CmsMemberPreferBookRelationExample ex = new CmsMemberPreferBookRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andBookIdEqualTo(bookId);
        List<CmsMemberPreferBookRelation> relations = cmsMemberPreferBookRelationMapper.selectByExample(ex);
        boolean liked = false;
        boolean favorited = false;
        boolean disliked = false;
        for (CmsMemberPreferBookRelation rel : relations) {
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

