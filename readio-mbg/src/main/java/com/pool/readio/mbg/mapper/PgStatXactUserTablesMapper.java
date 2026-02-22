package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatXactUserTables;
import com.pool.readio.mbg.model.PgStatXactUserTablesExample;
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