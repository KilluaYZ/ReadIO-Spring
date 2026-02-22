package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatUserIndexes;
import com.pool.readio.readiombg.model.PgStatUserIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatUserIndexesMapper {
    long countByExample(PgStatUserIndexesExample example);

    int deleteByExample(PgStatUserIndexesExample example);

    int insert(PgStatUserIndexes row);

    int insertSelective(PgStatUserIndexes row);

    List<PgStatUserIndexes> selectByExample(PgStatUserIndexesExample example);

    int updateByExampleSelective(@Param("row") PgStatUserIndexes row, @Param("example") PgStatUserIndexesExample example);

    int updateByExample(@Param("row") PgStatUserIndexes row, @Param("example") PgStatUserIndexesExample example);
}