package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.TriggeredUpdateColumns;
import com.pool.readio.mbg.model.TriggeredUpdateColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggeredUpdateColumnsMapper {
    long countByExample(TriggeredUpdateColumnsExample example);

    int deleteByExample(TriggeredUpdateColumnsExample example);

    int insert(TriggeredUpdateColumns row);

    int insertSelective(TriggeredUpdateColumns row);

    List<TriggeredUpdateColumns> selectByExample(TriggeredUpdateColumnsExample example);

    int updateByExampleSelective(@Param("row") TriggeredUpdateColumns row, @Param("example") TriggeredUpdateColumnsExample example);

    int updateByExample(@Param("row") TriggeredUpdateColumns row, @Param("example") TriggeredUpdateColumnsExample example);
}