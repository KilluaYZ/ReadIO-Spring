package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatProgressCluster;
import com.pool.readio.mbg.model.PgStatProgressClusterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatProgressClusterMapper {
    long countByExample(PgStatProgressClusterExample example);

    int deleteByExample(PgStatProgressClusterExample example);

    int insert(PgStatProgressCluster row);

    int insertSelective(PgStatProgressCluster row);

    List<PgStatProgressCluster> selectByExample(PgStatProgressClusterExample example);

    int updateByExampleSelective(@Param("row") PgStatProgressCluster row, @Param("example") PgStatProgressClusterExample example);

    int updateByExample(@Param("row") PgStatProgressCluster row, @Param("example") PgStatProgressClusterExample example);
}