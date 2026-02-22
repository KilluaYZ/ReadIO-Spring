package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatioAllIndexes;
import com.pool.readio.readiombg.model.PgStatioAllIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioAllIndexesMapper {
    long countByExample(PgStatioAllIndexesExample example);

    int deleteByExample(PgStatioAllIndexesExample example);

    int insert(PgStatioAllIndexes row);

    int insertSelective(PgStatioAllIndexes row);

    List<PgStatioAllIndexes> selectByExample(PgStatioAllIndexesExample example);

    int updateByExampleSelective(@Param("row") PgStatioAllIndexes row, @Param("example") PgStatioAllIndexesExample example);

    int updateByExample(@Param("row") PgStatioAllIndexes row, @Param("example") PgStatioAllIndexesExample example);
}