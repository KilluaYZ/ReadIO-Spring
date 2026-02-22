package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatXactUserTables;
import com.pool.readio.readiombg.model.PgStatXactUserTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatXactUserTablesMapper {
    long countByExample(PgStatXactUserTablesExample example);

    int deleteByExample(PgStatXactUserTablesExample example);

    int insert(PgStatXactUserTables row);

    int insertSelective(PgStatXactUserTables row);

    List<PgStatXactUserTables> selectByExample(PgStatXactUserTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatXactUserTables row, @Param("example") PgStatXactUserTablesExample example);

    int updateByExample(@Param("row") PgStatXactUserTables row, @Param("example") PgStatXactUserTablesExample example);
}