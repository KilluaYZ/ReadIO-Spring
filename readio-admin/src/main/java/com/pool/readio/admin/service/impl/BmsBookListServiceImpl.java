package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.BmsBookListQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookListStatusResult;
import com.pool.readio.admin.service.BmsBookListService;
import com.pool.readio.mbg.mapper.BmsBookListMapper;
import com.pool.readio.mbg.model.BmsBookList;
import com.pool.readio.mbg.model.BmsBookListExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.pool.readio.admin.dto.BmsBookListBookRelationParam;
import com.pool.readio.admin.dto.BmsBookListMemberRelationParam;
import com.pool.readio.mbg.mapper.BmsBookListMemberRelationMapper;
import com.pool.readio.mbg.model.BmsBookListMemberRelation;
import com.pool.readio.mbg.model.BmsBookListMemberRelationExample;
import com.pool.readio.mbg.model.BmsBookListBookRelation;
import com.pool.readio.mbg.mapper.BmsBookListBookRelationMapper;
import com.pool.readio.mbg.model.BmsBookListBookRelationExample;
import com.pool.readio.mbg.mapper.BmsBookMapper;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookExample;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import com.pool.readio.mbg.mapper.CmsMemberPreferBookListRelationMapper;
import com.pool.readio.mbg.model.CmsMemberPreferBookListRelation;
import com.pool.readio.mbg.model.CmsMemberPreferBookListRelationExample;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 书单管理 Service 实现
 * 对应数据表 bms_book_list
 */
@Service
public class BmsBookListServiceImpl implements BmsBookListService {

    @Autowired
    private BmsBookListMapper bmsBookListMapper;

    @Autowired
    private BmsBookListBookRelationMapper bmsBookListBookRelationMapper;

    @Autowired
    private BmsBookListMemberRelationMapper bmsBookListMemberRelationMapper;

    @Autowired
    private BmsBookMapper bmsBookMapper;

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private CmsMemberPreferBookListRelationMapper cmsMemberPreferBookListRelationMapper;

    @Override
    public List<BmsBookList> listAll() {
        return bmsBookListMapper.selectByExample(new BmsBookListExample());
    }

    @Override
    public List<BmsBookList> listVisible() {
        BmsBookListExample example = new BmsBookListExample();
        example.createCriteria().andHiddenEqualTo(false);
        return bmsBookListMapper.selectByExample(example);
    }

    @Override
    public List<BmsBookList> list(BmsBookListQueryParam queryParam, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookListExample example = new BmsBookListExample();
        example.setOrderByClause("id DESC");
        BmsBookListExample.Criteria criteria = example.createCriteria();
        if (queryParam != null) {
            if (StringUtils.hasText(queryParam.getNameKeyword())) {
                criteria.andNameLike("%" + queryParam.getNameKeyword().trim() + "%");
            }
            if (StringUtils.hasText(queryParam.getDescriptionKeyword())) {
                criteria.andDescriptionLike("%" + queryParam.getDescriptionKeyword().trim() + "%");
            }
            if (queryParam.getHidden() != null) {
                criteria.andHiddenEqualTo(queryParam.getHidden());
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
        return bmsBookListMapper.selectByExample(example);
    }

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
    public BmsBookList getById(Integer id) {
        return bmsBookListMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsBookList record) {
        return bmsBookListMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBookList record) {
        record.setId(id);
        return bmsBookListMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsBookListMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        BmsBookListExample example = new BmsBookListExample();
        example.createCriteria().andIdIn(ids);
        return bmsBookListMapper.deleteByExample(example);
    }

    @Override 
    public int addBooksToList(BmsBookListBookRelationParam record) {
        if (record == null || record.getBookListId() == null || record.getBookIds() == null || record.getBookIds().isEmpty()) {
            return 0;
        }
        for (Integer bookId : record.getBookIds()) {
            BmsBookListBookRelation bookListBookRelation = new BmsBookListBookRelation();
            bookListBookRelation.setBookListId(record.getBookListId());
            bookListBookRelation.setBookId(bookId);
            bmsBookListBookRelationMapper.insertSelective(bookListBookRelation);
        }
        return record.getBookIds().size();
    }

    @Override
    public int removeBooksFromList(BmsBookListBookRelationParam record) {
        if(record == null || record.getBookListId() == null || record.getBookIds() == null || record.getBookIds().isEmpty()) {
            return 0;
        }
        for (Integer bookId : record.getBookIds()) {
            BmsBookListBookRelationExample example = new BmsBookListBookRelationExample();
            example.createCriteria().andBookListIdEqualTo(record.getBookListId()).andBookIdEqualTo(bookId);
            bmsBookListBookRelationMapper.deleteByExample(example);
        }
        return record.getBookIds().size();
    }

    @Override
    public int addMembersToList(BmsBookListMemberRelationParam record) {
        if (record == null || record.getBookListId() == null || record.getMemberIds() == null || record.getMemberIds().isEmpty()) {
            return 0;
        }
        for (Integer memberId : record.getMemberIds()) {
            BmsBookListMemberRelation relation = new BmsBookListMemberRelation();
            relation.setBookListId(record.getBookListId());
            relation.setMemberId(memberId);
            bmsBookListMemberRelationMapper.insertSelective(relation);
        }
        return record.getMemberIds().size();
    }

    @Override
    public int removeMembersFromList(BmsBookListMemberRelationParam record) {
        if (record == null || record.getBookListId() == null || record.getMemberIds() == null || record.getMemberIds().isEmpty()) {
            return 0;
        }
        for (Integer memberId : record.getMemberIds()) {
            BmsBookListMemberRelationExample example = new BmsBookListMemberRelationExample();
            example.createCriteria().andBookListIdEqualTo(record.getBookListId()).andMemberIdEqualTo(memberId);
            bmsBookListMemberRelationMapper.deleteByExample(example);
        }
        return record.getMemberIds().size();
    }

    @Override
    public List<BmsBook> listBooksByBookListId(Integer bookListId) {
        if (bookListId == null) {
            return new ArrayList<>();
        }
        BmsBookListBookRelationExample relExample = new BmsBookListBookRelationExample();
        relExample.setOrderByClause("create_time ASC");
        relExample.createCriteria().andBookListIdEqualTo(bookListId);
        List<BmsBookListBookRelation> relations = bmsBookListBookRelationMapper.selectByExample(relExample);
        List<Integer> bookIds = relations.stream().map(BmsBookListBookRelation::getBookId).collect(Collectors.toList());
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
    public List<BmsBook> listBooksByBookListIdPage(Integer bookListId, Integer pageNum, Integer pageSize) {
        if (bookListId == null) {
            return new ArrayList<>();
        }
        PageHelper.startPage(pageNum, pageSize);
        BmsBookListBookRelationExample relExample = new BmsBookListBookRelationExample();
        relExample.setOrderByClause("create_time ASC");
        relExample.createCriteria().andBookListIdEqualTo(bookListId);
        List<BmsBookListBookRelation> relations = bmsBookListBookRelationMapper.selectByExample(relExample);
        List<Integer> bookIds = relations.stream().map(BmsBookListBookRelation::getBookId).collect(Collectors.toList());
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
    public List<UmsMember> listMembersByBookListId(Integer bookListId) {
        if (bookListId == null) {
            return new ArrayList<>();
        }
        BmsBookListMemberRelationExample relExample = new BmsBookListMemberRelationExample();
        relExample.setOrderByClause("create_time ASC");
        relExample.createCriteria().andBookListIdEqualTo(bookListId);
        List<BmsBookListMemberRelation> relations = bmsBookListMemberRelationMapper.selectByExample(relExample);
        List<Integer> memberIds = relations.stream().map(BmsBookListMemberRelation::getMemberId).collect(Collectors.toList());
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
    public List<UmsMember> listMembersByBookListIdPage(Integer bookListId, Integer pageNum, Integer pageSize) {
        if (bookListId == null) {
            return new ArrayList<>();
        }
        PageHelper.startPage(pageNum, pageSize);
        BmsBookListMemberRelationExample relExample = new BmsBookListMemberRelationExample();
        relExample.setOrderByClause("create_time ASC");
        relExample.createCriteria().andBookListIdEqualTo(bookListId);
        List<BmsBookListMemberRelation> relations = bmsBookListMemberRelationMapper.selectByExample(relExample);
        List<Integer> memberIds = relations.stream().map(BmsBookListMemberRelation::getMemberId).collect(Collectors.toList());
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

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    @Override
    public int addMemberPrefer(Integer memberId, Integer bookListId, Integer type) {
        if (memberId == null || bookListId == null || type == null) {
            return 0;
        }
        CmsMemberPreferBookListRelationExample ex = new CmsMemberPreferBookListRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andBookListIdEqualTo(bookListId)
                .andTypeEqualTo(type);
        // 先删除可能存在的重复关系，保证幂等
        cmsMemberPreferBookListRelationMapper.deleteByExample(ex);

        CmsMemberPreferBookListRelation rel = new CmsMemberPreferBookListRelation();
        rel.setMemberId(memberId);
        rel.setBookListId(bookListId);
        rel.setType(type);
        return cmsMemberPreferBookListRelationMapper.insertSelective(rel);
    }

    @Override
    public int removeMemberPrefer(Integer memberId, Integer bookListId, Integer type) {
        if (memberId == null || bookListId == null || type == null) {
            return 0;
        }
        CmsMemberPreferBookListRelationExample ex = new CmsMemberPreferBookListRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andBookListIdEqualTo(bookListId)
                .andTypeEqualTo(type);
        return cmsMemberPreferBookListRelationMapper.deleteByExample(ex);
    }

    @Override
    public long countMemberPreferByBookList(Integer bookListId, Integer type) {
        if (bookListId == null || type == null) {
            return 0L;
        }
        CmsMemberPreferBookListRelationExample ex = new CmsMemberPreferBookListRelationExample();
        ex.createCriteria()
                .andBookListIdEqualTo(bookListId)
                .andTypeEqualTo(type);
        return cmsMemberPreferBookListRelationMapper.countByExample(ex);
    }

    @Override
    public List<UmsMember> listMembersByBookListAndPreferType(Integer bookListId, Integer type) {
        if (bookListId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferBookListRelationExample ex = new CmsMemberPreferBookListRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andBookListIdEqualTo(bookListId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferBookListRelation> relations = cmsMemberPreferBookListRelationMapper.selectByExample(ex);
        List<Integer> memberIds = relations.stream()
                .map(CmsMemberPreferBookListRelation::getMemberId)
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
    public List<BmsBookList> listBookListsByMemberAndPreferType(Integer memberId, Integer type) {
        if (memberId == null || type == null) {
            return new ArrayList<>();
        }
        CmsMemberPreferBookListRelationExample ex = new CmsMemberPreferBookListRelationExample();
        ex.setOrderByClause("create_time ASC");
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andTypeEqualTo(type);
        List<CmsMemberPreferBookListRelation> relations = cmsMemberPreferBookListRelationMapper.selectByExample(ex);
        List<Integer> bookListIds = relations.stream()
                .map(CmsMemberPreferBookListRelation::getBookListId)
                .collect(Collectors.toList());
        if (bookListIds.isEmpty()) {
            return new ArrayList<>();
        }
        BmsBookListExample listExample = new BmsBookListExample();
        listExample.createCriteria().andIdIn(bookListIds);
        List<BmsBookList> bookLists = bmsBookListMapper.selectByExample(listExample);
        Map<Integer, BmsBookList> idToList = new LinkedHashMap<>();
        for (BmsBookList l : bookLists) {
            idToList.put(l.getId(), l);
        }
        List<BmsBookList> result = new ArrayList<>();
        for (Integer id : bookListIds) {
            if (idToList.containsKey(id)) {
                result.add(idToList.get(id));
            }
        }
        return result;
    }

    @Override
    public CmsMemberPreferBookListStatusResult getMemberPreferStatus(Integer memberId, Integer bookListId) {
        CmsMemberPreferBookListStatusResult status = new CmsMemberPreferBookListStatusResult();
        if (memberId == null || bookListId == null) {
            status.setLiked(false);
            status.setFavorited(false);
            status.setDisliked(false);
            return status;
        }
        CmsMemberPreferBookListRelationExample ex = new CmsMemberPreferBookListRelationExample();
        ex.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andBookListIdEqualTo(bookListId);
        List<CmsMemberPreferBookListRelation> relations = cmsMemberPreferBookListRelationMapper.selectByExample(ex);
        boolean liked = false;
        boolean favorited = false;
        boolean disliked = false;
        for (CmsMemberPreferBookListRelation rel : relations) {
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
