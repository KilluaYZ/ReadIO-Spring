package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.service.BmsPublisherService;
import com.pool.readio.mbg.mapper.BmsPublisherMapper;
import com.pool.readio.mbg.model.BmsPublisher;
import com.pool.readio.mbg.model.BmsPublisherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class BmsPublisherServiceImpl implements BmsPublisherService {

    @Autowired
    private BmsPublisherMapper bmsPublisherMapper;

    @Override
    public List<BmsPublisher> listAll() {
        BmsPublisherExample ex = new BmsPublisherExample();
        ex.setOrderByClause("create_time DESC");
        return bmsPublisherMapper.selectByExample(ex);
    }

    @Override
    public List<BmsPublisher> list(String nameKeyword, String descriptionKeyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        BmsPublisherExample ex = new BmsPublisherExample();
        ex.setOrderByClause("create_time DESC");
        BmsPublisherExample.Criteria c = ex.createCriteria();
        if (StringUtils.hasText(nameKeyword)) {
            c.andNameLike("%" + nameKeyword.trim() + "%");
        }
        if (StringUtils.hasText(descriptionKeyword)) {
            c.andDescriptionLike("%" + descriptionKeyword.trim() + "%");
        }
        return bmsPublisherMapper.selectByExample(ex);
    }

    @Override
    public BmsPublisher getById(Integer id) {
        return bmsPublisherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(BmsPublisher record) {
        return bmsPublisherMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, BmsPublisher record) {
        record.setId(id);
        return bmsPublisherMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return bmsPublisherMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Integer> ids) {
        if (ids == null || ids.isEmpty()) return 0;
        BmsPublisherExample ex = new BmsPublisherExample();
        ex.createCriteria().andIdIn(ids);
        return bmsPublisherMapper.deleteByExample(ex);
    }
}
