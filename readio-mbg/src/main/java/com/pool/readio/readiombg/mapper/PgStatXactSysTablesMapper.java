package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatXactSysTables;
import com.pool.readio.readiombg.model.PgStatXactSysTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatXactSysTablesMapper {
    long countByExample(PgStatXactSysTablesExample example);

    int deleteByExample(PgStatXactSysTablesExample example);

    int insert(PgStatXactSysTables row);

    int insertSelective(PgStatXactSysTables row);

    List<PgStatXactSysTables> selectByExample(PgStatXactSysTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatXactSysTables row, @Param("example") PgStatXactSysTablesExample example);

    int updateByExample(@Param("row") PgStatXactSysTables row, @Param("example") PgStatXactSysTablesExample example);
}