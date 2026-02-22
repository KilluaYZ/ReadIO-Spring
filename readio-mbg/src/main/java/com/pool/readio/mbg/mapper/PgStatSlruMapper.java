package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatSlru;
import com.pool.readio.mbg.model.PgStatSlruExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatSlruMapper {
    long countByExample(PgStatSlruExample example);

    int deleteByExample(PgStatSlruExample example);

    int insert(PgStatSlru row);

    int insertSelective(PgStatSlru row);

    List<PgStatSlru> selectByExample(PgStatSlruExample example);

    int updateByExampleSelective(@Param("row") PgStatSlru row, @Param("example") PgStatSlruExample example);

    int updateByExample(@Param("row") PgStatSlru row, @Param("example") PgStatSlruExample example);
}