package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.SqlSizing;
import com.pool.readio.readiombg.model.SqlSizingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlSizingMapper {
    long countByExample(SqlSizingExample example);

    int deleteByExample(SqlSizingExample example);

    int insert(SqlSizing row);

    int insertSelective(SqlSizing row);

    List<SqlSizing> selectByExample(SqlSizingExample example);

    int updateByExampleSelective(@Param("row") SqlSizing row, @Param("example") SqlSizingExample example);

    int updateByExample(@Param("row") SqlSizing row, @Param("example") SqlSizingExample example);
}