package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStats;
import com.pool.readio.readiombg.model.PgStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatsMapper {
    long countByExample(PgStatsExample example);

    int deleteByExample(PgStatsExample example);

    int insert(PgStats row);

    int insertSelective(PgStats row);

    List<PgStats> selectByExample(PgStatsExample example);

    int updateByExampleSelective(@Param("row") PgStats row, @Param("example") PgStatsExample example);

    int updateByExample(@Param("row") PgStats row, @Param("example") PgStatsExample example);
}