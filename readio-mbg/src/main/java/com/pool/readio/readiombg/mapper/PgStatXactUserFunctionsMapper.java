package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatXactUserFunctions;
import com.pool.readio.readiombg.model.PgStatXactUserFunctionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatXactUserFunctionsMapper {
    long countByExample(PgStatXactUserFunctionsExample example);

    int deleteByExample(PgStatXactUserFunctionsExample example);

    int insert(PgStatXactUserFunctions row);

    int insertSelective(PgStatXactUserFunctions row);

    List<PgStatXactUserFunctions> selectByExample(PgStatXactUserFunctionsExample example);

    int updateByExampleSelective(@Param("row") PgStatXactUserFunctions row, @Param("example") PgStatXactUserFunctionsExample example);

    int updateByExample(@Param("row") PgStatXactUserFunctions row, @Param("example") PgStatXactUserFunctionsExample example);
}