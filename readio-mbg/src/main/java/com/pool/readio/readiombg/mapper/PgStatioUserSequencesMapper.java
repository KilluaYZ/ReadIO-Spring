package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatioUserSequences;
import com.pool.readio.readiombg.model.PgStatioUserSequencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioUserSequencesMapper {
    long countByExample(PgStatioUserSequencesExample example);

    int deleteByExample(PgStatioUserSequencesExample example);

    int insert(PgStatioUserSequences row);

    int insertSelective(PgStatioUserSequences row);

    List<PgStatioUserSequences> selectByExample(PgStatioUserSequencesExample example);

    int updateByExampleSelective(@Param("row") PgStatioUserSequences row, @Param("example") PgStatioUserSequencesExample example);

    int updateByExample(@Param("row") PgStatioUserSequences row, @Param("example") PgStatioUserSequencesExample example);
}