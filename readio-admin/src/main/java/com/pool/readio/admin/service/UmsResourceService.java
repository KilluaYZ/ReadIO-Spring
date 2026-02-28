package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsResource;

import java.util.List;
import java.util.Map;

/**
 * 后台资源管理 Service，对应 ums_resource
 */
public interface UmsResourceService {
    /**
     * 添加资源
     */
    int create(UmsResource umsResource);

    /**
     * 修改资源
     */
    int update(Integer id, UmsResource umsResource);

    /**
     * 根据ID获取资源详情
     */
    UmsResource getById(Integer id);

    /**
     * 删除资源
     */
    int deleteById(Integer id);

    /**
     * 批量删除资源
     */
    int deleteByIds(List<Integer> ids);

    /**
     * 分页条件查询资源
     */
    List<UmsResource> list(Integer categoryId, String nameKeyword, String urlKeyword, Integer pageNum, Integer pageSize);

    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();

    /**
     * 初始化路径与资源访问规则（写入 Redis）
     */
    Map<String, String> initPathResourceMap();
}
