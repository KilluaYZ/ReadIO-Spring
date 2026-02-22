package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.RoleUsageGrants;
import com.pool.readio.readiombg.model.RoleUsageGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUsageGrantsMapper {
    long countByExample(RoleUsageGrantsExample example);

    int deleteByExample(RoleUsageGrantsExample example);

    int insert(RoleUsageGrants row);

    int insertSelective(RoleUsageGrants row);

    List<RoleUsageGrants> selectByExample(RoleUsageGrantsExample example);

    int updateByExampleSelective(@Param("row") RoleUsageGrants row, @Param("example") RoleUsageGrantsExample example);

    int updateByExample(@Param("row") RoleUsageGrants row, @Param("example") RoleUsageGrantsExample example);
}