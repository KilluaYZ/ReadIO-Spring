package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatSsl;
import com.pool.readio.mbg.model.PgStatSslExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatSslMapper {
    long countByExample(PgStatSslExample example);

    int deleteByExample(PgStatSslExample example);

    int insert(PgStatSsl row);

    int insertSelective(PgStatSsl row);

    List<PgStatSsl> selectByExample(PgStatSslExample example);

    int updateByExampleSelective(@Param("row") PgStatSsl row, @Param("example") PgStatSslExample example);

    int updateByExample(@Param("row") PgStatSsl row, @Param("example") PgStatSslExample example);
}