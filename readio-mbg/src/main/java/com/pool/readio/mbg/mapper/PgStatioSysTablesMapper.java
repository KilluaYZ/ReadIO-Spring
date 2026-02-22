package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatioSysTables;
import com.pool.readio.mbg.model.PgStatioSysTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioSysTablesMapper {
    long countByExample(PgStatioSysTablesExample example);

    int deleteByExample(PgStatioSysTablesExample example);

    int insert(PgStatioSysTables row);

    int insertSelective(PgStatioSysTables row);

    List<PgStatioSysTables> selectByExample(PgStatioSysTablesExample example);

    int updateByExampleSelective(@Param("row") PgStatioSysTables row, @Param("example") PgStatioSysTablesExample example);

    int updateByExample(@Param("row") PgStatioSysTables row, @Param("example") PgStatioSysTablesExample example);
}