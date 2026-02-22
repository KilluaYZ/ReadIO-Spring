package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatsExt;
import com.pool.readio.readiombg.model.PgStatsExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatsExtMapper {
    long countByExample(PgStatsExtExample example);

    int deleteByExample(PgStatsExtExample example);

    int insert(PgStatsExt row);

    int insertSelective(PgStatsExt row);

    List<PgStatsExt> selectByExample(PgStatsExtExample example);

    int updateByExampleSelective(@Param("row") PgStatsExt row, @Param("example") PgStatsExtExample example);

    int updateByExample(@Param("row") PgStatsExt row, @Param("example") PgStatsExtExample example);
}