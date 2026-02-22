package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.RoutineTableUsage;
import com.pool.readio.mbg.model.RoutineTableUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutineTableUsageMapper {
    long countByExample(RoutineTableUsageExample example);

    int deleteByExample(RoutineTableUsageExample example);

    int insert(RoutineTableUsage row);

    int insertSelective(RoutineTableUsage row);

    List<RoutineTableUsage> selectByExample(RoutineTableUsageExample example);

    int updateByExampleSelective(@Param("row") RoutineTableUsage row, @Param("example") RoutineTableUsageExample example);

    int updateByExample(@Param("row") RoutineTableUsage row, @Param("example") RoutineTableUsageExample example);
}