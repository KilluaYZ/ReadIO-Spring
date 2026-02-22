package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatioUserTables;
import com.pool.readio.readiombg.model.PgStatioUserTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioUserTablesMapper {
    long countByExample(PgStatioUserTablesExample example);

    int deleteByExample(PgStatioUserTablesExample example);

    int insert(PgStatioUserTables row);

    int insertSelective(PgStatioUserTables row);

    List<PgStatioUserTables> selectByExample(PgStatioUserTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatioUserTables row, @Param("example") PgStatioUserTablesExample example);

    int updateByExample(@Param("row") PgStatioUserTables row, @Param("example") PgStatioUserTablesExample example);
}