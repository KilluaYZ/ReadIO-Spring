package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsMemberLevel;

import java.util.List;

/**
 * 会员等级管理Service
 * Created by macro on 2018/4/26.
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员等级（可按是否默认筛选）
     * @param defaultStatus 是否为默认等级，null 表示不过滤
     */
    List<UmsMemberLevel> list(Integer defaultStatus);

    /**
     * 获取全部会员等级（不分页、不筛选）
     */
    List<UmsMemberLevel> listAll();

    UmsMemberLevel getById(Integer id);

    int create(UmsMemberLevel record);

    int updateById(Integer id, UmsMemberLevel record);

    int deleteById(Integer id);

    /**
     * 将指定等级设为默认等级（其他等级会取消默认）
     */
    int setDefaultLevel(Integer id);
}
