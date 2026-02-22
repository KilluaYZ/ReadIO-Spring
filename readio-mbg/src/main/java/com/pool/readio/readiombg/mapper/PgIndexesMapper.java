package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgIndexes;
import com.pool.readio.readiombg.model.PgIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgIndexesMapper {
    long countByExample(PgIndexesExample example);

    int deleteByExample(PgIndexesExample example);

    int insert(PgIndexes row);

    int insertSelective(PgIndexes row);

    List<PgIndexes> selectByExample(PgIndexesExample example);

    int updateByExampleSelective(@Param("row") PgIndexes row, @Param("example") PgIndexesExample example);

    int updateByExample(@Param("row") PgIndexes row, @Param("example") PgIndexesExample example);
}