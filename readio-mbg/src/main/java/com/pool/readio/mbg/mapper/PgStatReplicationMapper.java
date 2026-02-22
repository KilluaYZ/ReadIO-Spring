package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatReplication;
import com.pool.readio.mbg.model.PgStatReplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatReplicationMapper {
    long countByExample(PgStatReplicationExample example);

    int deleteByExample(PgStatReplicationExample example);

    int insert(PgStatReplication row);

    int insertSelective(PgStatReplication row);

    List<PgStatReplication> selectByExample(PgStatReplicationExample example);

    int updateByExampleSelective(@Param("row") PgStatReplication row, @Param("example") PgStatReplicationExample example);

    int updateByExample(@Param("row") PgStatReplication row, @Param("example") PgStatReplicationExample example);
}