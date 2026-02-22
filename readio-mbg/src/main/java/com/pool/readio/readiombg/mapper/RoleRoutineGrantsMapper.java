package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.RoleRoutineGrants;
import com.pool.readio.readiombg.model.RoleRoutineGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleRoutineGrantsMapper {
    long countByExample(RoleRoutineGrantsExample example);

    int deleteByExample(RoleRoutineGrantsExample example);

    int insert(RoleRoutineGrants row);

    int insertSelective(RoleRoutineGrants row);

    List<RoleRoutineGrants> selectByExample(RoleRoutineGrantsExample example);

    int updateByExampleSelective(@Param("row") RoleRoutineGrants row, @Param("example") RoleRoutineGrantsExample example);

    int updateByExample(@Param("row") RoleRoutineGrants row, @Param("example") RoleRoutineGrantsExample example);
}