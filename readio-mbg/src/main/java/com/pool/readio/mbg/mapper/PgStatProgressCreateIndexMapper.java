package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatProgressCreateIndex;
import com.pool.readio.mbg.model.PgStatProgressCreateIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatProgressCreateIndexMapper {
    long countByExample(PgStatProgressCreateIndexExample example);

    int deleteByExample(PgStatProgressCreateIndexExample example);

    int insert(PgStatProgressCreateIndex row);

    int insertSelective(PgStatProgressCreateIndex row);

    List<PgStatProgressCreateIndex> selectByExample(PgStatProgressCreateIndexExample example);

    int updateByExampleSelective(@Param("row") PgStatProgressCreateIndex row, @Param("example") PgStatProgressCreateIndexExample example);

    int updateByExample(@Param("row") PgStatProgressCreateIndex row, @Param("example") PgStatProgressCreateIndexExample example);
}