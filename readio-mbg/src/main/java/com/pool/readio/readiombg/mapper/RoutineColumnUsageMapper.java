package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.RoutineColumnUsage;
import com.pool.readio.readiombg.model.RoutineColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutineColumnUsageMapper {
    long countByExample(RoutineColumnUsageExample example);

    int deleteByExample(RoutineColumnUsageExample example);

    int insert(RoutineColumnUsage row);

    int insertSelective(RoutineColumnUsage row);

    List<RoutineColumnUsage> selectByExample(RoutineColumnUsageExample example);

    int updateByExampleSelective(@Param("row") RoutineColumnUsage row, @Param("example") RoutineColumnUsageExample example);

    int updateByExample(@Param("row") RoutineColumnUsage row, @Param("example") RoutineColumnUsageExample example);
}