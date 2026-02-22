package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatioSysSequences;
import com.pool.readio.readiombg.model.PgStatioSysSequencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioSysSequencesMapper {
    long countByExample(PgStatioSysSequencesExample example);

    int deleteByExample(PgStatioSysSequencesExample example);

    int insert(PgStatioSysSequences row);

    int insertSelective(PgStatioSysSequences row);

    List<PgStatioSysSequences> selectByExample(PgStatioSysSequencesExample example);

    int updateByExampleSelective(@Param("row") PgStatioSysSequences row, @Param("example") PgStatioSysSequencesExample example);

    int updateByExample(@Param("row") PgStatioSysSequences row, @Param("example") PgStatioSysSequencesExample example);
}