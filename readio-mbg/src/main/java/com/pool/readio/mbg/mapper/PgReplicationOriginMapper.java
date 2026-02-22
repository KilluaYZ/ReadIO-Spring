package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgReplicationOrigin;
import com.pool.readio.mbg.model.PgReplicationOriginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgReplicationOriginMapper {
    long countByExample(PgReplicationOriginExample example);

    int deleteByExample(PgReplicationOriginExample example);

    int deleteByPrimaryKey(Long roident);

    int insert(PgReplicationOrigin row);

    int insertSelective(PgReplicationOrigin row);

    List<PgReplicationOrigin> selectByExample(PgReplicationOriginExample example);

    PgReplicationOrigin selectByPrimaryKey(Long roident);

    int updateByExampleSelective(@Param("row") PgReplicationOrigin row, @Param("example") PgReplicationOriginExample example);

    int updateByExample(@Param("row") PgReplicationOrigin row, @Param("example") PgReplicationOriginExample example);

    int updateByPrimaryKeySelective(PgReplicationOrigin row);

    int updateByPrimaryKey(PgReplicationOrigin row);
}