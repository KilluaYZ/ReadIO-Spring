package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgRoles;
import com.pool.readio.readiombg.model.PgRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgRolesMapper {
    long countByExample(PgRolesExample example);

    int deleteByExample(PgRolesExample example);

    int insert(PgRoles row);

    int insertSelective(PgRoles row);

    List<PgRoles> selectByExample(PgRolesExample example);

    int updateByExampleSelective(@Param("row") PgRoles row, @Param("example") PgRolesExample example);

    int updateByExample(@Param("row") PgRoles row, @Param("example") PgRolesExample example);
}