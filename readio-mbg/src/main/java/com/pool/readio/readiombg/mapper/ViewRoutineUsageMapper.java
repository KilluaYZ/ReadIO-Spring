package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ViewRoutineUsage;
import com.pool.readio.readiombg.model.ViewRoutineUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewRoutineUsageMapper {
    long countByExample(ViewRoutineUsageExample example);

    int deleteByExample(ViewRoutineUsageExample example);

    int insert(ViewRoutineUsage row);

    int insertSelective(ViewRoutineUsage row);

    List<ViewRoutineUsage> selectByExample(ViewRoutineUsageExample example);

    int updateByExampleSelective(@Param("row") ViewRoutineUsage row, @Param("example") ViewRoutineUsageExample example);

    int updateByExample(@Param("row") ViewRoutineUsage row, @Param("example") ViewRoutineUsageExample example);
}