package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.RoleTableGrants;
import com.pool.readio.mbg.model.RoleTableGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTableGrantsMapper {
    long countByExample(RoleTableGrantsExample example);

    int deleteByExample(RoleTableGrantsExample example);

    int insert(RoleTableGrants row);

    int insertSelective(RoleTableGrants row);

    List<RoleTableGrants> selectByExample(RoleTableGrantsExample example);

    int updateByExampleSelective(@Param("row") RoleTableGrants row, @Param("example") RoleTableGrantsExample example);

    int updateByExample(@Param("row") RoleTableGrants row, @Param("example") RoleTableGrantsExample example);
}