package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.RoleColumnGrants;
import com.pool.readio.mbg.model.RoleColumnGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleColumnGrantsMapper {
    long countByExample(RoleColumnGrantsExample example);

    int deleteByExample(RoleColumnGrantsExample example);

    int insert(RoleColumnGrants row);

    int insertSelective(RoleColumnGrants row);

    List<RoleColumnGrants> selectByExample(RoleColumnGrantsExample example);

    int updateByExampleSelective(@Param("row") RoleColumnGrants row, @Param("example") RoleColumnGrantsExample example);

    int updateByExample(@Param("row") RoleColumnGrants row, @Param("example") RoleColumnGrantsExample example);
}