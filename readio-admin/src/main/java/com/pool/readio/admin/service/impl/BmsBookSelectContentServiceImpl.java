package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dao.BmsBookSelectContentDao;
import com.pool.readio.admin.dto.BmsBookSelectContentWithItems;
import com.pool.readio.admin.service.BmsBookSelectContentService;
import com.pool.readio.mbg.mapper.BmsBookSelectContentItemMapper;
import com.pool.readio.mbg.mapper.BmsBookSelectContentMapper;
import com.pool.readio.mbg.model.BmsBookSelectContent;
import com.pool.readio.mbg.model.BmsBookSelectContentExample;
import com.pool.readio.mbg.model.BmsBookSelectContentItem;
import com.pool.readio.mbg.model.BmsBookSelectContentItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BmsBookSelectContentServiceImpl implements BmsBookSelectContentService {

    @Autowired
    private BmsBookSelectContentMapper bmsBookSelectContentMapper;
    @Autowired
    private BmsBookSelectContentItemMapper bmsBookSelectContentItemMapper;
    @Autowired
    private BmsBookSelectContentDao bmsBookSelectContentDao;

    private BmsBookSelectContentWithItems toWithItems(BmsBookSelectContent sc, List<BmsBookSelectContentItem> items) {
        if (sc == null) return null;
        BmsBookSelectContentWithItems dto = new BmsBookSelectContentWithItems();
        dto.setId(sc.getId());
        dto.setMemberId(sc.getMemberId());
        dto.setType(sc.getType());
        dto.setMarkType(sc.getMarkType());
        dto.setMarkColor(sc.getMarkColor());
        dto.setCreateTime(sc.getCreateTime());
        dto.setItems(items != null ? items : new ArrayList<>());
        return dto;
    }

    private List<BmsBookSelectContentItem> getItemsBySelectId(Integer selectId) {
        if (selectId == null) return new ArrayList<>();
        BmsBookSelectContentItemExample ex = new BmsBookSelectContentItemExample();
        ex.createCriteria().andSelectIdEqualTo(selectId);
        return bmsBookSelectContentItemMapper.selectByExample(ex);
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
        if (n <= 0) return null;
        Integer selectId = sc.getId();
        if (param.getItems() != null && !param.getItems().isEmpty()) {
            for (BmsBookSelectContentItem item : param.getItems()) {
                item.setSelectId(selectId);
                item.setId(null);
                if (item.getOffset() == null) item.setOffset(0);
                if (item.getLength() == null) item.setLength(0);
                bmsBookSelectContentItemMapper.insertSelective(item);
            }
        }
        return selectId;
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
        int n = bmsBookSelectContentMapper.updateByPrimaryKeySelective(existing);
        BmsBookSelectContentItemExample delEx = new BmsBookSelectContentItemExample();
        delEx.createCriteria().andSelectIdEqualTo(id);
        bmsBookSelectContentItemMapper.deleteByExample(delEx);
        if (param != null && param.getItems() != null && !param.getItems().isEmpty()) {
            for (BmsBookSelectContentItem item : param.getItems()) {
                item.setSelectId(id);
                item.setId(null);
                if (item.getOffset() == null) item.setOffset(0);
                if (item.getLength() == null) item.setLength(0);
                bmsBookSelectContentItemMapper.insertSelective(item);
            }
        }
        return n;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(Integer id) {
        BmsBookSelectContentItemExample ex = new BmsBookSelectContentItemExample();
        ex.createCriteria().andSelectIdEqualTo(id);
        bmsBookSelectContentItemMapper.deleteByExample(ex);
        return bmsBookSelectContentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public BmsBookSelectContentWithItems getById(Integer id) {
        BmsBookSelectContent sc = bmsBookSelectContentMapper.selectByPrimaryKey(id);
        List<BmsBookSelectContentItem> items = getItemsBySelectId(id);
        return toWithItems(sc, items);
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberId(Integer memberId) {
        BmsBookSelectContentExample ex = new BmsBookSelectContentExample();
        ex.createCriteria().andMemberIdEqualTo(memberId);
        ex.setOrderByClause("create_time DESC");
        List<BmsBookSelectContent> list = bmsBookSelectContentMapper.selectByExample(ex);
        return list.stream()
                .map(sc -> toWithItems(sc, getItemsBySelectId(sc.getId())))
                .collect(Collectors.toList());
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberIdPage(Integer memberId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return listByMemberId(memberId);
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberIdAndBookId(Integer memberId, Integer bookId) {
        List<BmsBookSelectContent> list = bmsBookSelectContentDao.listByMemberIdAndBookId(memberId, bookId);
        return list.stream()
                .map(sc -> toWithItems(sc, getItemsBySelectId(sc.getId())))
                .collect(Collectors.toList());
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByMemberIdAndBookIdPage(Integer memberId, Integer bookId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return listByMemberIdAndBookId(memberId, bookId);
    }

    @Override
    public List<BmsBookSelectContentWithItems> listByBookId(Integer bookId) {
        List<BmsBookSelectContent> list = bmsBookSelectContentDao.listByBookId(bookId);
        return list.stream()
                .map(sc -> toWithItems(sc, getItemsBySelectId(sc.getId())))
                .collect(Collectors.toList());
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
        return list.stream()
                .map(sc -> toWithItems(sc, getItemsBySelectId(sc.getId())))
                .collect(Collectors.toList());
    }

    @Override
    public List<BmsBookSelectContentWithItems> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return listAll();
    }
}
