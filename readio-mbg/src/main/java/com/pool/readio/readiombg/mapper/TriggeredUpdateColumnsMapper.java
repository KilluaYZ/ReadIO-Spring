package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.TriggeredUpdateColumns;
import com.pool.readio.readiombg.model.TriggeredUpdateColumnsExample;
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