package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgDbRoleSetting;
import com.pool.readio.readiombg.model.PgDbRoleSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgDbRoleSettingMapper {
    long countByExample(PgDbRoleSettingExample example);

    int deleteByExample(PgDbRoleSettingExample example);

    int deleteByPrimaryKey(@Param("setdatabase") Long setdatabase, @Param("setrole") Long setrole);

    int insert(PgDbRoleSetting row);

    int insertSelective(PgDbRoleSetting row);

    List<PgDbRoleSetting> selectByExample(PgDbRoleSettingExample example);

    PgDbRoleSetting selectByPrimaryKey(@Param("setdatabase") Long setdatabase, @Param("setrole") Long setrole);

    int updateByExampleSelective(@Param("row") PgDbRoleSetting row, @Param("example") PgDbRoleSettingExample example);

    int updateByExample(@Param("row") PgDbRoleSetting row, @Param("example") PgDbRoleSettingExample example);

    int updateByPrimaryKeySelective(PgDbRoleSetting row);

    int updateByPrimaryKey(PgDbRoleSetting row);
}