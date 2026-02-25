package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 会员管理 Service，对应 ums_member
 */
public interface UmsMemberService {

    List<UmsMember> listAll();

    UmsMember getById(Integer id);

    int create(UmsMember record);

    int updateById(Integer id, UmsMember record);

    int deleteById(Integer id);
}
