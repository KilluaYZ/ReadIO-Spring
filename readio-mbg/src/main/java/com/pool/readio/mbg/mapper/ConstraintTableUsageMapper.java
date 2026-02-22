package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.ConstraintTableUsage;
import com.pool.readio.mbg.model.ConstraintTableUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstraintTableUsageMapper {
    long countByExample(ConstraintTableUsageExample example);

    int deleteByExample(ConstraintTableUsageExample example);

    int insert(ConstraintTableUsage row);

    int insertSelective(ConstraintTableUsage row);

    List<ConstraintTableUsage> selectByExample(ConstraintTableUsageExample example);

    int updateByExampleSelective(@Param("row") ConstraintTableUsage row, @Param("example") ConstraintTableUsageExample example);

    int updateByExample(@Param("row") ConstraintTableUsage row, @Param("example") ConstraintTableUsageExample example);
}