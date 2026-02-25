package com.pool.readio.admin.service.impl;

import com.pool.readio.mbg.mapper.UmsMemberLevelMapper;
import com.pool.readio.mbg.model.UmsMemberLevel;
import com.pool.readio.mbg.model.UmsMemberLevelExample;
import com.pool.readio.admin.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员等级管理Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus != null && defaultStatus != 0);
        return memberLevelMapper.selectByExample(example);
    }
}
