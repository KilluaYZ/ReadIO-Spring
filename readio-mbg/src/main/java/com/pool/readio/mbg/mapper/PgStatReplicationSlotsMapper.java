package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatReplicationSlots;
import com.pool.readio.mbg.model.PgStatReplicationSlotsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatReplicationSlotsMapper {
    long countByExample(PgStatReplicationSlotsExample example);

    int deleteByExample(PgStatReplicationSlotsExample example);

    int insert(PgStatReplicationSlots row);

    int insertSelective(PgStatReplicationSlots row);

    List<PgStatReplicationSlots> selectByExample(PgStatReplicationSlotsExample example);

    int updateByExampleSelective(@Param("row") PgStatReplicationSlots row, @Param("example") PgStatReplicationSlotsExample example);

    int updateByExample(@Param("row") PgStatReplicationSlots row, @Param("example") PgStatReplicationSlotsExample example);
}