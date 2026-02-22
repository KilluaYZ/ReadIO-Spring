package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.RoutineRoutineUsage;
import com.pool.readio.mbg.model.RoutineRoutineUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutineRoutineUsageMapper {
    long countByExample(RoutineRoutineUsageExample example);

    int deleteByExample(RoutineRoutineUsageExample example);

    int insert(RoutineRoutineUsage row);

    int insertSelective(RoutineRoutineUsage row);

    List<RoutineRoutineUsage> selectByExample(RoutineRoutineUsageExample example);

    int updateByExampleSelective(@Param("row") RoutineRoutineUsage row, @Param("example") RoutineRoutineUsageExample example);

    int updateByExample(@Param("row") RoutineRoutineUsage row, @Param("example") RoutineRoutineUsageExample example);
}