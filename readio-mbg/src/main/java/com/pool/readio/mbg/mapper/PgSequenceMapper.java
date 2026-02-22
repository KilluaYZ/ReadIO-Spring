package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgSequence;
import com.pool.readio.mbg.model.PgSequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgSequenceMapper {
    long countByExample(PgSequenceExample example);

    int deleteByExample(PgSequenceExample example);

    int deleteByPrimaryKey(Long seqrelid);

    int insert(PgSequence row);

    int insertSelective(PgSequence row);

    List<PgSequence> selectByExample(PgSequenceExample example);

    PgSequence selectByPrimaryKey(Long seqrelid);

    int updateByExampleSelective(@Param("row") PgSequence row, @Param("example") PgSequenceExample example);

    int updateByExample(@Param("row") PgSequence row, @Param("example") PgSequenceExample example);

    int updateByPrimaryKeySelective(PgSequence row);

    int updateByPrimaryKey(PgSequence row);
}