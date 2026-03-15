package com.pool.readio.admin.service.impl;

import com.pool.readio.admin.service.UmsMemberRuleSettingService;
import com.pool.readio.mbg.mapper.UmsMemberRuleSettingMapper;
import com.pool.readio.mbg.model.UmsMemberRuleSetting;
import com.pool.readio.mbg.model.UmsMemberRuleSettingExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberRuleSettingServiceImpl implements UmsMemberRuleSettingService {

    private final UmsMemberRuleSettingMapper ruleSettingMapper;

    public UmsMemberRuleSettingServiceImpl(UmsMemberRuleSettingMapper ruleSettingMapper) {
        this.ruleSettingMapper = ruleSettingMapper;
    }

    @Override
    public List<UmsMemberRuleSetting> listAll() {
        UmsMemberRuleSettingExample example = new UmsMemberRuleSettingExample();
        example.setOrderByClause("type ASC, id ASC");
        return ruleSettingMapper.selectByExample(example);
    }

    @Override
    public List<UmsMemberRuleSetting> listByType(Integer type) {
        UmsMemberRuleSettingExample example = new UmsMemberRuleSettingExample();
        if (type != null) {
            example.createCriteria().andTypeEqualTo(type);
        }
        example.setOrderByClause("type ASC, id ASC");
        return ruleSettingMapper.selectByExample(example);
    }

    @Override
    public UmsMemberRuleSetting getById(Integer id) {
        return id == null ? null : ruleSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int create(UmsMemberRuleSetting record) {
        return ruleSettingMapper.insertSelective(record);
    }

    @Override
    public int updateById(Integer id, UmsMemberRuleSetting record) {
        if (id == null) return 0;
        record.setId(id);
        return ruleSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(Integer id) {
        return id == null ? 0 : ruleSettingMapper.deleteByPrimaryKey(id);
    }
}
