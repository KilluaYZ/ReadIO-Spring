package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.ConstraintColumnUsage;
import com.pool.readio.mbg.model.ConstraintColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstraintColumnUsageMapper {
    long countByExample(ConstraintColumnUsageExample example);

    int deleteByExample(ConstraintColumnUsageExample example);

    int insert(ConstraintColumnUsage row);

    int insertSelective(ConstraintColumnUsage row);

    List<ConstraintColumnUsage> selectByExample(ConstraintColumnUsageExample example);

    int updateByExampleSelective(@Param("row") ConstraintColumnUsage row, @Param("example") ConstraintColumnUsageExample example);

    int updateByExample(@Param("row") ConstraintColumnUsage row, @Param("example") ConstraintColumnUsageExample example);
}