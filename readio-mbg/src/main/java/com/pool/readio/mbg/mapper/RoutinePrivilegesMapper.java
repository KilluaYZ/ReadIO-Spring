package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.RoutinePrivileges;
import com.pool.readio.mbg.model.RoutinePrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutinePrivilegesMapper {
    long countByExample(RoutinePrivilegesExample example);

    int deleteByExample(RoutinePrivilegesExample example);

    int insert(RoutinePrivileges row);

    int insertSelective(RoutinePrivileges row);

    List<RoutinePrivileges> selectByExample(RoutinePrivilegesExample example);

    int updateByExampleSelective(@Param("row") RoutinePrivileges row, @Param("example") RoutinePrivilegesExample example);

    int updateByExample(@Param("row") RoutinePrivileges row, @Param("example") RoutinePrivilegesExample example);
}