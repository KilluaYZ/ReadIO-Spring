package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgSequences;
import com.pool.readio.readiombg.model.PgSequencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgSequencesMapper {
    long countByExample(PgSequencesExample example);

    int deleteByExample(PgSequencesExample example);

    int insert(PgSequences row);

    int insertSelective(PgSequences row);

    List<PgSequences> selectByExample(PgSequencesExample example);

    int updateByExampleSelective(@Param("row") PgSequences row, @Param("example") PgSequencesExample example);

    int updateByExample(@Param("row") PgSequences row, @Param("example") PgSequencesExample example);
}