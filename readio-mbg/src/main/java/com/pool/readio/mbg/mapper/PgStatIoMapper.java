package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatIo;
import com.pool.readio.mbg.model.PgStatIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatIoMapper {
    long countByExample(PgStatIoExample example);

    int deleteByExample(PgStatIoExample example);

    int insert(PgStatIo row);

    int insertSelective(PgStatIo row);

    List<PgStatIo> selectByExample(PgStatIoExample example);

    int updateByExampleSelective(@Param("row") PgStatIo row, @Param("example") PgStatIoExample example);

    int updateByExample(@Param("row") PgStatIo row, @Param("example") PgStatIoExample example);
}