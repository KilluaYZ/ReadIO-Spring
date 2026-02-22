package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatUserFunctions;
import com.pool.readio.mbg.model.PgStatUserFunctionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatUserFunctionsMapper {
    long countByExample(PgStatUserFunctionsExample example);

    int deleteByExample(PgStatUserFunctionsExample example);

    int insert(PgStatUserFunctions row);

    int insertSelective(PgStatUserFunctions row);

    List<PgStatUserFunctions> selectByExample(PgStatUserFunctionsExample example);

    int updateByExampleSelective(@Param("row") PgStatUserFunctions row, @Param("example") PgStatUserFunctionsExample example);

    int updateByExample(@Param("row") PgStatUserFunctions row, @Param("example") PgStatUserFunctionsExample example);
}