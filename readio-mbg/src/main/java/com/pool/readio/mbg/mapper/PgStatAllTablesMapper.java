package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatAllTables;
import com.pool.readio.mbg.model.PgStatAllTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatAllTablesMapper {
    long countByExample(PgStatAllTablesExample example);

    int deleteByExample(PgStatAllTablesExample example);

    int insert(PgStatAllTables row);

    int insertSelective(PgStatAllTables row);

    List<PgStatAllTables> selectByExample(PgStatAllTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatAllTables row, @Param("example") PgStatAllTablesExample example);

    int updateByExample(@Param("row") PgStatAllTables row, @Param("example") PgStatAllTablesExample example);
}