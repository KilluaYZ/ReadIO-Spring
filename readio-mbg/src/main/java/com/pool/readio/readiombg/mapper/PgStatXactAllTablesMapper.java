package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatXactAllTables;
import com.pool.readio.readiombg.model.PgStatXactAllTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatXactAllTablesMapper {
    long countByExample(PgStatXactAllTablesExample example);

    int deleteByExample(PgStatXactAllTablesExample example);

    int insert(PgStatXactAllTables row);

    int insertSelective(PgStatXactAllTables row);

    List<PgStatXactAllTables> selectByExample(PgStatXactAllTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatXactAllTables row, @Param("example") PgStatXactAllTablesExample example);

    int updateByExample(@Param("row") PgStatXactAllTables row, @Param("example") PgStatXactAllTablesExample example);
}