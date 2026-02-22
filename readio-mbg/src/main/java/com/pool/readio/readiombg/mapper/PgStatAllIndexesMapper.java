package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatAllIndexes;
import com.pool.readio.readiombg.model.PgStatAllIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatAllIndexesMapper {
    long countByExample(PgStatAllIndexesExample example);

    int deleteByExample(PgStatAllIndexesExample example);

    int insert(PgStatAllIndexes row);

    int insertSelective(PgStatAllIndexes row);

    List<PgStatAllIndexes> selectByExample(PgStatAllIndexesExample example);

    int updateByExampleSelective(@Param("row") PgStatAllIndexes row, @Param("example") PgStatAllIndexesExample example);

    int updateByExample(@Param("row") PgStatAllIndexes row, @Param("example") PgStatAllIndexesExample example);
}