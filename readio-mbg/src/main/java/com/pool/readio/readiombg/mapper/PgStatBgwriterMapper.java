package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatBgwriter;
import com.pool.readio.readiombg.model.PgStatBgwriterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatBgwriterMapper {
    long countByExample(PgStatBgwriterExample example);

    int deleteByExample(PgStatBgwriterExample example);

    int insert(PgStatBgwriter row);

    int insertSelective(PgStatBgwriter row);

    List<PgStatBgwriter> selectByExample(PgStatBgwriterExample example);

    int updateByExampleSelective(@Param("row") PgStatBgwriter row, @Param("example") PgStatBgwriterExample example);

    int updateByExample(@Param("row") PgStatBgwriter row, @Param("example") PgStatBgwriterExample example);
}