package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dao.BmsBookSelectContentDao;
import com.pool.readio.admin.dto.BmsBookSelectContentWithItems;
import com.pool.readio.admin.service.BmsBookSelectContentService;
import com.pool.readio.mbg.mapper.BmsBookSelectContentMapper;
import com.pool.readio.mbg.model.BmsBookSelectContent;
import com.pool.readio.mbg.model.BmsBookSelectContentExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BmsBookSelectContentServiceImpl implements BmsBookSelectContentService {

    private final BmsBookSelectContentMapper bmsBookSelectContentMapper;
    private final BmsBookSelectContentDao bmsBookSelectContentDao;

    public BmsBookSelectContentServiceImpl(BmsBookSelectContentMapper bmsBookSelectContentMapper,
                                           BmsBookSelectContentDao bmsBookSelectContentDao) {
        this.bmsBookSelectContentMapper = bmsBookSelectContentMapper;
        this.bmsBookSelectContentDao = bmsBookSelectContentDao;
    }

    private BmsBookSelectContentWithItems toWithItems(BmsBookSelectContent sc) {
        if (sc == null) return null;
        BmsBookSelectContentWithItems dto = new BmsBookSelectContentWithItems();
        dto.setId(sc.getId());
        dto.setMemberId(sc.getMemberId());
        dto.setType(sc.getType());
        dto.setMarkType(sc.getMarkType());
        dto.setMarkColor(sc.getMarkColor());
        dto.setCreateTime(sc.getCreateTime());
        return dto;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer create(BmsBookSelectContentWithItems param) {
        if (param == null || param.getMemberId() == null || param.getType() == null) {
            return null;
        }
        BmsBookSelectContent sc = new BmsBookSelectContent();
        sc.setMemberId(param.getMemberId());
        sc.setType(param.getType());
        sc.setMarkType(param.getMarkType());
        sc.setMarkColor(param.getMarkColor());
        int n = bmsBookSelectContentMapper.insertSelective(sc);
        return n > 0 ? sc.getId() : null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateById(Integer id, BmsBookSelectContentWithItems param) {
        BmsBookSelectContent existing = bmsBookSelectContentMapper.selectByPrimaryKey(id);
        if (existing == null) return 0;
        if (param != null) {
            if (param.getType() != null) existing.setType(param.getType());
            if (param.getMarkType() != null) existing.setMarkType(param.getMarkType());
            if (param.getMarkColor() != null) existing.setMarkColor(param.getMarkColor());
        }
        return bmsBookSelectContentMapper.updateByPrimaryKeySelective(existing);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Integer id) {
        return bmsBookSelectContentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public BmsBookSelectContentWithItems getById(Integer id) {
        BmsBookSelectContent sc = bmsBookSelectContentMapper.selectByPrimaryKey(id);
        return toWithItems(sc);
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberId(Integer memberId) {
        BmsBookSelectContentExample ex = new BmsBookSelectContentExample();
        ex.createCriteria().andMemberIdEqualTo(memberId);
        ex.setOrderByClause("create_time DESC");
        List<BmsBookSelectContent> list = bmsBookSelectContentMapper.selectByExample(ex);
        return list.stream().map(this::toWithItems).collect(Collectors.toList());
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberIdPage(Integer memberId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return listByMemberId(memberId);
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberIdAndBookId(Integer memberId, Integer bookId) {
        List<BmsBookSelectContent> list = bmsBookSelectContentDao.listByMemberIdAndBookId(memberId, bookId);
        return list.stream().map(this::toWithItems).collect(Collectors.toList());
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberIdAndBookIdPage(Integer memberId, Integer bookId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return listByMemberIdAndBookId(memberId, bookId);
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByBookId(Integer bookId) {
        List<BmsBookSelectContent> list = bmsBookSelectContentDao.listByBookId(bookId);
        return list.stream().map(this::toWithItems).collect(Collectors.toList());
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return listByBookId(bookId);
    }

    @Override
    public List<BmsBookSelectContentWithItems> listAll() {
        BmsBookSelectContentExample ex = new BmsBookSelectContentExample();
        ex.setOrderByClause("create_time DESC");
        List<BmsBookSelectContent> list = bmsBookSelectContentMapper.selectByExample(ex);
        return list.stream().map(this::toWithItems).collect(Collectors.toList());
    }

    @Override
    public List<BmsBookSelectContentWithItems> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return listAll();
    }
}
