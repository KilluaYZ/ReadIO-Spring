package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsMemberRuleSetting;

import java.util.List;

/**
 * 会员积分/成长值规则配置 Service
 * 对应表 ums_member_rule_setting，type：0->积分规则；1->成长值规则
 */
public interface UmsMemberRuleSettingService {

    List<UmsMemberRuleSetting> listAll();

    /**
     * 按类型查询：0 积分规则，1 成长值规则，null 表示不过滤
     */
    List<UmsMemberRuleSetting> listByType(Integer type);

    UmsMemberRuleSetting getById(Integer id);

    int create(UmsMemberRuleSetting record);

    int updateById(Integer id, UmsMemberRuleSetting record);

    int deleteById(Integer id);
}
