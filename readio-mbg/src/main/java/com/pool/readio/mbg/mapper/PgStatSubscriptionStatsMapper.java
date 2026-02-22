package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatSubscriptionStats;
import com.pool.readio.mbg.model.PgStatSubscriptionStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatSubscriptionStatsMapper {
    long countByExample(PgStatSubscriptionStatsExample example);

    int deleteByExample(PgStatSubscriptionStatsExample example);

    int insert(PgStatSubscriptionStats row);

    int insertSelective(PgStatSubscriptionStats row);

    List<PgStatSubscriptionStats> selectByExample(PgStatSubscriptionStatsExample example);

    int updateByExampleSelective(@Param("row") PgStatSubscriptionStats row, @Param("example") PgStatSubscriptionStatsExample example);

    int updateByExample(@Param("row") PgStatSubscriptionStats row, @Param("example") PgStatSubscriptionStatsExample example);
}