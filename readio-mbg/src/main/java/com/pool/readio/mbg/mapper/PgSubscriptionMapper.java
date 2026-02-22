package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgSubscription;
import com.pool.readio.mbg.model.PgSubscriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgSubscriptionMapper {
    long countByExample(PgSubscriptionExample example);

    int deleteByExample(PgSubscriptionExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgSubscription row);

    int insertSelective(PgSubscription row);

    List<PgSubscription> selectByExample(PgSubscriptionExample example);

    PgSubscription selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgSubscription row, @Param("example") PgSubscriptionExample example);

    int updateByExample(@Param("row") PgSubscription row, @Param("example") PgSubscriptionExample example);

    int updateByPrimaryKeySelective(PgSubscription row);

    int updateByPrimaryKey(PgSubscription row);
}