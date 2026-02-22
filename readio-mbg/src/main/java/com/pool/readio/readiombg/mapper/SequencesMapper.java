package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.Sequences;
import com.pool.readio.readiombg.model.SequencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequencesMapper {
    long countByExample(SequencesExample example);

    int deleteByExample(SequencesExample example);

    int insert(Sequences row);

    int insertSelective(Sequences row);

    List<Sequences> selectByExample(SequencesExample example);

    int updateByExampleSelective(@Param("row") Sequences row, @Param("example") SequencesExample example);

    int updateByExample(@Param("row") Sequences row, @Param("example") SequencesExample example);
}