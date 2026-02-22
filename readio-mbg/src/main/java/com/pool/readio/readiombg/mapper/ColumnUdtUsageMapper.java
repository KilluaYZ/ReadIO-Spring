package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ColumnUdtUsage;
import com.pool.readio.readiombg.model.ColumnUdtUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnUdtUsageMapper {
    long countByExample(ColumnUdtUsageExample example);

    int deleteByExample(ColumnUdtUsageExample example);

    int insert(ColumnUdtUsage row);

    int insertSelective(ColumnUdtUsage row);

    List<ColumnUdtUsage> selectByExample(ColumnUdtUsageExample example);

    int updateByExampleSelective(@Param("row") ColumnUdtUsage row, @Param("example") ColumnUdtUsageExample example);

    int updateByExample(@Param("row") ColumnUdtUsage row, @Param("example") ColumnUdtUsageExample example);
}