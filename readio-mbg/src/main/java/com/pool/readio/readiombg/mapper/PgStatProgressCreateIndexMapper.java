package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatProgressCreateIndex;
import com.pool.readio.readiombg.model.PgStatProgressCreateIndexExample;
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