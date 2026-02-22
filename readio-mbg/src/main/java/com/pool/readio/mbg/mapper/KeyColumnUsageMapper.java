package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.KeyColumnUsage;
import com.pool.readio.mbg.model.KeyColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyColumnUsageMapper {
    long countByExample(KeyColumnUsageExample example);

    int deleteByExample(KeyColumnUsageExample example);

    int insert(KeyColumnUsage row);

    int insertSelective(KeyColumnUsage row);

    List<KeyColumnUsage> selectByExample(KeyColumnUsageExample example);

    int updateByExampleSelective(@Param("row") KeyColumnUsage row, @Param("example") KeyColumnUsageExample example);

    int updateByExample(@Param("row") KeyColumnUsage row, @Param("example") KeyColumnUsageExample example);
}