package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatioAllSequences;
import com.pool.readio.mbg.model.PgStatioAllSequencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioAllSequencesMapper {
    long countByExample(PgStatioAllSequencesExample example);

    int deleteByExample(PgStatioAllSequencesExample example);

    int insert(PgStatioAllSequences row);

    int insertSelective(PgStatioAllSequences row);

    List<PgStatioAllSequences> selectByExample(PgStatioAllSequencesExample example);

    int updateByExampleSelective(@Param("row") PgStatioAllSequences row, @Param("example") PgStatioAllSequencesExample example);

    int updateByExample(@Param("row") PgStatioAllSequences row, @Param("example") PgStatioAllSequencesExample example);
}