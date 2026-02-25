package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.BmsBookShelfBookRelationParam;
import com.pool.readio.admin.service.BmsBookShelfService;
import com.pool.readio.mbg.mapper.BmsBookMapper;
import com.pool.readio.mbg.mapper.BmsBookShelfBookRelationMapper;
import com.pool.readio.mbg.mapper.BmsBookShelfMapper;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookExample;
import com.pool.readio.mbg.model.BmsBookShelf;
import com.pool.readio.mbg.model.BmsBookShelfBookRelation;
import com.pool.readio.mbg.model.BmsBookShelfBookRelationExample;
import com.pool.readio.mbg.model.BmsBookShelfExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BmsBookShelfServiceImpl implements BmsBookShelfService {

    @Autowired
    private BmsBookShelfMapper bmsBookShelfMapper;
    @Autowired
    private BmsBookShelfBookRelationMapper bmsBookShelfBookRelationMapper;
    @Autowired
    private BmsBookMapper bmsBookMapper;

    @Override
    public List<BmsBookShelf> listAll() {
        BmsBookShelfExample ex = new BmsBookShelfExample();
        ex.setOrderByClause("create_time DESC");
        return bmsBookShelfMapper.selectByExample(ex);
    }

    @Override
    public List<BmsBookShelf> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookShelfExample ex = new BmsBookShelfExample();
        ex.setOrderByClause("create_time DESC");
        return bmsBookShelfMapper.selectByExample(ex);
    }

    @Override
    public BmsBookShelf getById(Integer id) {
        return bmsBookShelfMapper.selectByPrimaryKey(id);
    }

    @Override
    public BmsBookShelf getByMemberId(Integer memberId) {
        if (memberId == null) return null;
        BmsBookShelfExample ex = new BmsBookShelfExample();
        ex.createCriteria().andMemberIdEqualTo(memberId);
        ex.setOrderByClause("create_time DESC");
        List<BmsBookShelf> list = bmsBookShelfMapper.selectByExample(ex);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BmsBookShelf getOrCreateByMemberId(Integer memberId) {
        BmsBookShelf shelf = getByMemberId(memberId);
        if (shelf != null) return shelf;
        BmsBookShelf newShelf = new BmsBookShelf();
        newShelf.setMemberId(memberId);
        bmsBookShelfMapper.insertSelective(newShelf);
        return newShelf;
    }

    @Override
    public int create(BmsBookShelf record) {
        return bmsBookShelfMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBookShelf record) {
        record.setId(id);
        return bmsBookShelfMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Integer id) {
        BmsBookShelfBookRelationExample ex = new BmsBookShelfBookRelationExample();
        ex.createCriteria().andBookSelfIdEqualTo(id);
        bmsBookShelfBookRelationMapper.deleteByExample(ex);
        return bmsBookShelfMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addBooksToShelf(BmsBookShelfBookRelationParam param) {
        if (param == null || param.getBookShelfId() == null || param.getBookIds() == null || param.getBookIds().isEmpty()) {
            return 0;
        }
        for (Integer bookId : param.getBookIds()) {
            BmsBookShelfBookRelation rel = new BmsBookShelfBookRelation();
            rel.setBookSelfId(param.getBookShelfId());
            rel.setBookId(bookId);
            bmsBookShelfBookRelationMapper.insertSelective(rel);
        }
        return param.getBookIds().size();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int removeBooksFromShelf(BmsBookShelfBookRelationParam param) {
        if (param == null || param.getBookShelfId() == null || param.getBookIds() == null || param.getBookIds().isEmpty()) {
            return 0;
        }
        for (Integer bookId : param.getBookIds()) {
            BmsBookShelfBookRelationExample ex = new BmsBookShelfBookRelationExample();
            ex.createCriteria().andBookSelfIdEqualTo(param.getBookShelfId()).andBookIdEqualTo(bookId);
            bmsBookShelfBookRelationMapper.deleteByExample(ex);
        }
        return param.getBookIds().size();
    }

    @Override
    public List<BmsBook> listBooksByShelfId(Integer shelfId) {
        if (shelfId == null) return new ArrayList<>();
        BmsBookShelfBookRelationExample ex = new BmsBookShelfBookRelationExample();
        ex.createCriteria().andBookSelfIdEqualTo(shelfId);
        ex.setOrderByClause("create_time ASC");
        List<BmsBookShelfBookRelation> relations = bmsBookShelfBookRelationMapper.selectByExample(ex);
        List<Integer> bookIds = relations.stream().map(BmsBookShelfBookRelation::getBookId).distinct().collect(Collectors.toList());
        if (bookIds.isEmpty()) return new ArrayList<>();
        BmsBookExample bookEx = new BmsBookExample();
        bookEx.createCriteria().andIdIn(bookIds);
        List<BmsBook> books = bmsBookMapper.selectByExample(bookEx);
        Map<Integer, BmsBook> idToBook = new LinkedHashMap<>();
        for (BmsBook b : books) idToBook.put(b.getId(), b);
        List<BmsBook> result = new ArrayList<>();
        for (Integer id : bookIds) {
            if (idToBook.containsKey(id)) result.add(idToBook.get(id));
        }
        return result;
    }

    @Override
    public List<BmsBook> listBooksByShelfIdPage(Integer shelfId, Integer pageNum, Integer pageSize) {
        if (shelfId == null) return new ArrayList<>();
        PageHelper.startPage(pageNum, pageSize);
        BmsBookShelfBookRelationExample ex = new BmsBookShelfBookRelationExample();
        ex.createCriteria().andBookSelfIdEqualTo(shelfId);
        ex.setOrderByClause("create_time ASC");
        List<BmsBookShelfBookRelation> relations = bmsBookShelfBookRelationMapper.selectByExample(ex);
        List<Integer> bookIds = relations.stream().map(BmsBookShelfBookRelation::getBookId).distinct().collect(Collectors.toList());
        if (bookIds.isEmpty()) return new ArrayList<>();
        BmsBookExample bookEx = new BmsBookExample();
        bookEx.createCriteria().andIdIn(bookIds);
        List<BmsBook> books = bmsBookMapper.selectByExample(bookEx);
        Map<Integer, BmsBook> idToBook = new LinkedHashMap<>();
        for (BmsBook b : books) idToBook.put(b.getId(), b);
        List<BmsBook> result = new ArrayList<>();
        for (Integer id : bookIds) {
            if (idToBook.containsKey(id)) result.add(idToBook.get(id));
        }
        return result;
    }
}
