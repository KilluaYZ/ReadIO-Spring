package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgGroup;
import com.pool.readio.readiombg.model.PgGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgGroupMapper {
    long countByExample(PgGroupExample example);

    int deleteByExample(PgGroupExample example);

    int insert(PgGroup row);

    int insertSelective(PgGroup row);

    List<PgGroup> selectByExample(PgGroupExample example);

    int updateByExampleSelective(@Param("row") PgGroup row, @Param("example") PgGroupExample example);

    int updateByExample(@Param("row") PgGroup row, @Param("example") PgGroupExample example);
}