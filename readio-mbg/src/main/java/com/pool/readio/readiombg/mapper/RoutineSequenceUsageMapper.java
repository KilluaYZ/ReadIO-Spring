package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.RoutineSequenceUsage;
import com.pool.readio.readiombg.model.RoutineSequenceUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutineSequenceUsageMapper {
    long countByExample(RoutineSequenceUsageExample example);

    int deleteByExample(RoutineSequenceUsageExample example);

    int insert(RoutineSequenceUsage row);

    int insertSelective(RoutineSequenceUsage row);

    List<RoutineSequenceUsage> selectByExample(RoutineSequenceUsageExample example);

    int updateByExampleSelective(@Param("row") RoutineSequenceUsage row, @Param("example") RoutineSequenceUsageExample example);

    int updateByExample(@Param("row") RoutineSequenceUsage row, @Param("example") RoutineSequenceUsageExample example);
}