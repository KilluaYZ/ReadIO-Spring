package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatGssapi;
import com.pool.readio.mbg.model.PgStatGssapiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatGssapiMapper {
    long countByExample(PgStatGssapiExample example);

    int deleteByExample(PgStatGssapiExample example);

    int insert(PgStatGssapi row);

    int insertSelective(PgStatGssapi row);

    List<PgStatGssapi> selectByExample(PgStatGssapiExample example);

    int updateByExampleSelective(@Param("row") PgStatGssapi row, @Param("example") PgStatGssapiExample example);

    int updateByExample(@Param("row") PgStatGssapi row, @Param("example") PgStatGssapiExample example);
}