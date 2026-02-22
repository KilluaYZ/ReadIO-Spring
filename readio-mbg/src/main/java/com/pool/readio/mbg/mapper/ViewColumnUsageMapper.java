package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.ViewColumnUsage;
import com.pool.readio.mbg.model.ViewColumnUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewColumnUsageMapper {
    long countByExample(ViewColumnUsageExample example);

    int deleteByExample(ViewColumnUsageExample example);

    int insert(ViewColumnUsage row);

    int insertSelective(ViewColumnUsage row);

    List<ViewColumnUsage> selectByExample(ViewColumnUsageExample example);

    int updateByExampleSelective(@Param("row") ViewColumnUsage row, @Param("example") ViewColumnUsageExample example);

    int updateByExample(@Param("row") ViewColumnUsage row, @Param("example") ViewColumnUsageExample example);
}