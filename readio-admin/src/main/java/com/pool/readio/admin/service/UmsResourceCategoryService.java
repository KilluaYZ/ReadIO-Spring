package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsResourceCategory;

import java.util.List;

/**
 * 后台资源分类管理 Service，对应 ums_resource_category
 */
public interface UmsResourceCategoryService {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 根据ID获取资源分类
     */
    UmsResourceCategory getById(Integer id);

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Integer id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int deleteById(Integer id);

    /**
     * 批量删除资源分类
     */
    int deleteByIds(List<Integer> ids);
}
