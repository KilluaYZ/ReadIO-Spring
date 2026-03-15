package com.pool.readio.admin.service.impl;

import com.pool.readio.mbg.mapper.UmsMemberLevelMapper;
import com.pool.readio.mbg.model.UmsMemberLevel;
import com.pool.readio.mbg.model.UmsMemberLevelExample;
import com.pool.readio.admin.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 会员等级管理Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {

    private final UmsMemberLevelMapper memberLevelMapper;

    public UmsMemberLevelServiceImpl(UmsMemberLevelMapper memberLevelMapper) {
        this.memberLevelMapper = memberLevelMapper;
    }

    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        if (defaultStatus != null) {
            example.createCriteria().andDefaultStatusEqualTo(defaultStatus != 0);
        }
        example.setOrderByClause("growth_point ASC");
        return memberLevelMapper.selectByExample(example);
    }

    @Override
    public List<UmsMemberLevel> listAll() {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.setOrderByClause("growth_point ASC");
        return memberLevelMapper.selectByExample(example);
    }

    @Override
    public UmsMemberLevel getById(Integer id) {
        return memberLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(UmsMemberLevel record) {
        return memberLevelMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, UmsMemberLevel record) {
        record.setId(id);
        return memberLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return memberLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int setDefaultLevel(Integer id) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andIdIsNotNull();
        UmsMemberLevel allFalse = new UmsMemberLevel();
        allFalse.setDefaultStatus(false);
        memberLevelMapper.updateByExampleSelective(allFalse, example);
        UmsMemberLevel setTrue = new UmsMemberLevel();
        setTrue.setId(id);
        setTrue.setDefaultStatus(true);
        return memberLevelMapper.updateByPrimaryKeySelective(setTrue);
    }
}
