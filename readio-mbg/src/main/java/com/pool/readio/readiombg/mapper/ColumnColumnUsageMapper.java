package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ColumnColumnUsage;
import com.pool.readio.readiombg.model.ColumnColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnColumnUsageMapper {
    long countByExample(ColumnColumnUsageExample example);

    int deleteByExample(ColumnColumnUsageExample example);

    int insert(ColumnColumnUsage row);

    int insertSelective(ColumnColumnUsage row);

    List<ColumnColumnUsage> selectByExample(ColumnColumnUsageExample example);

    int updateByExampleSelective(@Param("row") ColumnColumnUsage row, @Param("example") ColumnColumnUsageExample example);

    int updateByExample(@Param("row") ColumnColumnUsage row, @Param("example") ColumnColumnUsageExample example);
}