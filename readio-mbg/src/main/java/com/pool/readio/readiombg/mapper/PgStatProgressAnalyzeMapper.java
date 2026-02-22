package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatProgressAnalyze;
import com.pool.readio.readiombg.model.PgStatProgressAnalyzeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatProgressAnalyzeMapper {
    long countByExample(PgStatProgressAnalyzeExample example);

    int deleteByExample(PgStatProgressAnalyzeExample example);

    int insert(PgStatProgressAnalyze row);

    int insertSelective(PgStatProgressAnalyze row);

    List<PgStatProgressAnalyze> selectByExample(PgStatProgressAnalyzeExample example);

    int updateByExampleSelective(@Param("row") PgStatProgressAnalyze row, @Param("example") PgStatProgressAnalyzeExample example);

    int updateByExample(@Param("row") PgStatProgressAnalyze row, @Param("example") PgStatProgressAnalyzeExample example);
}