package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.EnabledRoles;
import com.pool.readio.readiombg.model.EnabledRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnabledRolesMapper {
    long countByExample(EnabledRolesExample example);

    int deleteByExample(EnabledRolesExample example);

    int insert(EnabledRoles row);

    int insertSelective(EnabledRoles row);

    List<EnabledRoles> selectByExample(EnabledRolesExample example);

    int updateByExampleSelective(@Param("row") EnabledRoles row, @Param("example") EnabledRolesExample example);

    int updateByExample(@Param("row") EnabledRoles row, @Param("example") EnabledRolesExample example);
}