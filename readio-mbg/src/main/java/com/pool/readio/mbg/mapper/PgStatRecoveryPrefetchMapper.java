package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatRecoveryPrefetch;
import com.pool.readio.mbg.model.PgStatRecoveryPrefetchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatRecoveryPrefetchMapper {
    long countByExample(PgStatRecoveryPrefetchExample example);

    int deleteByExample(PgStatRecoveryPrefetchExample example);

    int insert(PgStatRecoveryPrefetch row);

    int insertSelective(PgStatRecoveryPrefetch row);

    List<PgStatRecoveryPrefetch> selectByExample(PgStatRecoveryPrefetchExample example);

    int updateByExampleSelective(@Param("row") PgStatRecoveryPrefetch row, @Param("example") PgStatRecoveryPrefetchExample example);

    int updateByExample(@Param("row") PgStatRecoveryPrefetch row, @Param("example") PgStatRecoveryPrefetchExample example);
}