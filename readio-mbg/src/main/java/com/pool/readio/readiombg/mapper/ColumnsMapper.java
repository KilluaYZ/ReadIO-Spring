package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.Columns;
import com.pool.readio.readiombg.model.ColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsMapper {
    long countByExample(ColumnsExample example);

    int deleteByExample(ColumnsExample example);

    int insert(Columns row);

    int insertSelective(Columns row);

    List<Columns> selectByExample(ColumnsExample example);

    int updateByExampleSelective(@Param("row") Columns row, @Param("example") ColumnsExample example);

    int updateByExample(@Param("row") Columns row, @Param("example") ColumnsExample example);
}