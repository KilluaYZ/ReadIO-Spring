package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgReplicationSlots;
import com.pool.readio.readiombg.model.PgReplicationSlotsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgReplicationSlotsMapper {
    long countByExample(PgReplicationSlotsExample example);

    int deleteByExample(PgReplicationSlotsExample example);

    int insert(PgReplicationSlots row);

    int insertSelective(PgReplicationSlots row);

    List<PgReplicationSlots> selectByExample(PgReplicationSlotsExample example);

    int updateByExampleSelective(@Param("row") PgReplicationSlots row, @Param("example") PgReplicationSlotsExample example);

    int updateByExample(@Param("row") PgReplicationSlots row, @Param("example") PgReplicationSlotsExample example);
}