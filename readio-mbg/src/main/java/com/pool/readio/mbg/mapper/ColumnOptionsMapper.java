package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.ColumnOptions;
import com.pool.readio.mbg.model.ColumnOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnOptionsMapper {
    long countByExample(ColumnOptionsExample example);

    int deleteByExample(ColumnOptionsExample example);

    int insert(ColumnOptions row);

    int insertSelective(ColumnOptions row);

    List<ColumnOptions> selectByExample(ColumnOptionsExample example);

    int updateByExampleSelective(@Param("row") ColumnOptions row, @Param("example") ColumnOptionsExample example);

    int updateByExample(@Param("row") ColumnOptions row, @Param("example") ColumnOptionsExample example);
}