package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatSubscription;
import com.pool.readio.mbg.model.PgStatSubscriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatSubscriptionMapper {
    long countByExample(PgStatSubscriptionExample example);

    int deleteByExample(PgStatSubscriptionExample example);

    int insert(PgStatSubscription row);

    int insertSelective(PgStatSubscription row);

    List<PgStatSubscription> selectByExample(PgStatSubscriptionExample example);

    int updateByExampleSelective(@Param("row") PgStatSubscription row, @Param("example") PgStatSubscriptionExample example);

    int updateByExample(@Param("row") PgStatSubscription row, @Param("example") PgStatSubscriptionExample example);
}