package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgReplicationOriginStatus;
import com.pool.readio.readiombg.model.PgReplicationOriginStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgReplicationOriginStatusMapper {
    long countByExample(PgReplicationOriginStatusExample example);

    int deleteByExample(PgReplicationOriginStatusExample example);

    int insert(PgReplicationOriginStatus row);

    int insertSelective(PgReplicationOriginStatus row);

    List<PgReplicationOriginStatus> selectByExample(PgReplicationOriginStatusExample example);

    int updateByExampleSelective(@Param("row") PgReplicationOriginStatus row, @Param("example") PgReplicationOriginStatusExample example);

    int updateByExample(@Param("row") PgReplicationOriginStatus row, @Param("example") PgReplicationOriginStatusExample example);
}