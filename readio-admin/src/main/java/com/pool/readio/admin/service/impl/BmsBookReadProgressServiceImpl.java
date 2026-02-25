package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.service.BmsBookReadProgressService;
import com.pool.readio.mbg.mapper.BmsBookReadProgressMapper;
import com.pool.readio.mbg.model.BmsBookReadProgress;
import com.pool.readio.mbg.model.BmsBookReadProgressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 书籍阅读进度管理 Service 实现
 */
@Service
public class BmsBookReadProgressServiceImpl implements BmsBookReadProgressService {

    @Autowired
    private BmsBookReadProgressMapper bmsBookReadProgressMapper;

    @Override
    public List<BmsBookReadProgress> listAll() {
        BmsBookReadProgressExample example = new BmsBookReadProgressExample();
        example.setOrderByClause("update_time DESC");
        return bmsBookReadProgressMapper.selectByExample(example);
    }

    @Override
    public List<BmsBookReadProgress> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookReadProgressExample example = new BmsBookReadProgressExample();
        example.setOrderByClause("update_time DESC");
        return bmsBookReadProgressMapper.selectByExample(example);
    }

    @Override
    public BmsBookReadProgress getById(Integer id) {
        return bmsBookReadProgressMapper.selectByPrimaryKey(id);
    }

    @Override
    public BmsBookReadProgress getByMemberAndBook(Integer memberId, Integer bookId) {
        BmsBookReadProgressExample example = new BmsBookReadProgressExample();
        example.createCriteria()
                .andMemberIdEqualTo(memberId)
                .andBookIdEqualTo(bookId);
        List<BmsBookReadProgress> list = bmsBookReadProgressMapper.selectByExample(example);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<BmsBookReadProgress> listByBookId(Integer bookId) {
        BmsBookReadProgressExample example = new BmsBookReadProgressExample();
        example.createCriteria().andBookIdEqualTo(bookId);
        example.setOrderByClause("update_time DESC");
        return bmsBookReadProgressMapper.selectByExample(example);
    }

    @Override
    public List<BmsBookReadProgress> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookReadProgressExample example = new BmsBookReadProgressExample();
        example.createCriteria().andBookIdEqualTo(bookId);
        example.setOrderByClause("update_time DESC");
        return bmsBookReadProgressMapper.selectByExample(example);
    }

    @Override
    public List<BmsBookReadProgress> listByMemberId(Integer memberId) {
        BmsBookReadProgressExample example = new BmsBookReadProgressExample();
        example.createCriteria().andMemberIdEqualTo(memberId);
        example.setOrderByClause("update_time DESC");
        return bmsBookReadProgressMapper.selectByExample(example);
    }

    @Override
    public List<BmsBookReadProgress> listByMemberIdPage(Integer memberId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsBookReadProgressExample example = new BmsBookReadProgressExample();
        example.createCriteria().andMemberIdEqualTo(memberId);
        example.setOrderByClause("update_time DESC");
        return bmsBookReadProgressMapper.selectByExample(example);
    }

    @Override
    public int create(BmsBookReadProgress record) {
        return bmsBookReadProgressMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsBookReadProgress record) {
        record.setId(id);
        return bmsBookReadProgressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByMemberAndBook(Integer memberId, Integer bookId, BmsBookReadProgress record) {
        BmsBookReadProgress existing = getByMemberAndBook(memberId, bookId);
        if (existing == null) {
            return 0;
        }
        record.setId(existing.getId());
        record.setMemberId(memberId);
        record.setBookId(bookId);
        return bmsBookReadProgressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsBookReadProgressMapper.deleteByPrimaryKey(id);
    }
}
