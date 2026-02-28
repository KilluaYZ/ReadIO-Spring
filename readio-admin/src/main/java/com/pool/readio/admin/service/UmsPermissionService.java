package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.UmsPermissionQueryParam;
import com.pool.readio.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台用户权限 Service，对应 ums_permission
 */
public interface UmsPermissionService {

    List<UmsPermission> listAll();

    /**
     * 分页条件查询权限列表
     */
    List<UmsPermission> list(UmsPermissionQueryParam queryParam, Integer pageNum, Integer pageSize);

    UmsPermission getById(Integer id);

    int create(UmsPermission record);

    int updateById(Integer id, UmsPermission record);

    int deleteById(Integer id);

    /**
     * 批量删除权限
     */
    int deleteByIds(List<Integer> ids);
}
