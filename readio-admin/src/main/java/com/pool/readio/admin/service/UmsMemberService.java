package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 会员管理 Service，对应 ums_member
 */
public interface UmsMemberService {

    List<UmsMember> listAll();

    /**
     * 分页查询，支持按用户名或昵称模糊搜索
     */
    List<UmsMember> list(String keyword, Integer pageSize, Integer pageNum);

    UmsMember getById(Integer id);

    int create(UmsMember record);

    int updateById(Integer id, UmsMember record);

    int deleteById(Integer id);

    /**
     * 修改会员启用状态
     */
    int updateStatus(Integer id, Integer status);
}
