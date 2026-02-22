package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatioAllTables;
import com.pool.readio.mbg.model.PgStatioAllTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioAllTablesMapper {
    long countByExample(PgStatioAllTablesExample example);

    int deleteByExample(PgStatioAllTablesExample example);

    int insert(PgStatioAllTables row);

    int insertSelective(PgStatioAllTables row);

    List<PgStatioAllTables> selectByExample(PgStatioAllTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatioAllTables row, @Param("example") PgStatioAllTablesExample example);

    int updateByExample(@Param("row") PgStatioAllTables row, @Param("example") PgStatioAllTablesExample example);
}