package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgTables;
import com.pool.readio.readiombg.model.PgTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTablesMapper {
    long countByExample(PgTablesExample example);

    int deleteByExample(PgTablesExample example);

    int insert(PgTables row);

    int insertSelective(PgTables row);

    List<PgTables> selectByExample(PgTablesExample example);

    int updateByExampleSelective(@Param("row") PgTables row, @Param("example") PgTablesExample example);

    int updateByExample(@Param("row") PgTables row, @Param("example") PgTablesExample example);
}