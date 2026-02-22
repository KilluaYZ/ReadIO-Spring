package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CheckConstraintRoutineUsage;
import com.pool.readio.mbg.model.CheckConstraintRoutineUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckConstraintRoutineUsageMapper {
    long countByExample(CheckConstraintRoutineUsageExample example);

    int deleteByExample(CheckConstraintRoutineUsageExample example);

    int insert(CheckConstraintRoutineUsage row);

    int insertSelective(CheckConstraintRoutineUsage row);

    List<CheckConstraintRoutineUsage> selectByExample(CheckConstraintRoutineUsageExample example);

    int updateByExampleSelective(@Param("row") CheckConstraintRoutineUsage row, @Param("example") CheckConstraintRoutineUsageExample example);

    int updateByExample(@Param("row") CheckConstraintRoutineUsage row, @Param("example") CheckConstraintRoutineUsageExample example);
}