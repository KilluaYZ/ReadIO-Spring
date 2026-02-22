package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatUserTables;
import com.pool.readio.mbg.model.PgStatUserTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatUserTablesMapper {
    long countByExample(PgStatUserTablesExample example);

    int deleteByExample(PgStatUserTablesExample example);

    int insert(PgStatUserTables row);

    int insertSelective(PgStatUserTables row);

    List<PgStatUserTables> selectByExample(PgStatUserTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatUserTables row, @Param("example") PgStatUserTablesExample example);

    int updateByExample(@Param("row") PgStatUserTables row, @Param("example") PgStatUserTablesExample example);
}