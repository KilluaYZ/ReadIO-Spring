package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatSysTables;
import com.pool.readio.readiombg.model.PgStatSysTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatSysTablesMapper {
    long countByExample(PgStatSysTablesExample example);

    int deleteByExample(PgStatSysTablesExample example);

    int insert(PgStatSysTables row);

    int insertSelective(PgStatSysTables row);

    List<PgStatSysTables> selectByExample(PgStatSysTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatSysTables row, @Param("example") PgStatSysTablesExample example);

    int updateByExample(@Param("row") PgStatSysTables row, @Param("example") PgStatSysTablesExample example);
}