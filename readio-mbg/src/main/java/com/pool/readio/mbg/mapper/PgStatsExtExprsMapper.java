package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatsExtExprs;
import com.pool.readio.mbg.model.PgStatsExtExprsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatsExtExprsMapper {
    long countByExample(PgStatsExtExprsExample example);

    int deleteByExample(PgStatsExtExprsExample example);

    int insert(PgStatsExtExprs row);

    int insertSelective(PgStatsExtExprs row);

    List<PgStatsExtExprs> selectByExample(PgStatsExtExprsExample example);

    int updateByExampleSelective(@Param("row") PgStatsExtExprs row, @Param("example") PgStatsExtExprsExample example);

    int updateByExample(@Param("row") PgStatsExtExprs row, @Param("example") PgStatsExtExprsExample example);
}