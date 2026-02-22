package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.ViewTableUsage;
import com.pool.readio.mbg.model.ViewTableUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewTableUsageMapper {
    long countByExample(ViewTableUsageExample example);

    int deleteByExample(ViewTableUsageExample example);

    int insert(ViewTableUsage row);

    int insertSelective(ViewTableUsage row);

    List<ViewTableUsage> selectByExample(ViewTableUsageExample example);

    int updateByExampleSelective(@Param("row") ViewTableUsage row, @Param("example") ViewTableUsageExample example);

    int updateByExample(@Param("row") ViewTableUsage row, @Param("example") ViewTableUsageExample example);
}