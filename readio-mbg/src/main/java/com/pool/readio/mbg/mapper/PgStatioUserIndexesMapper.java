package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatioUserIndexes;
import com.pool.readio.mbg.model.PgStatioUserIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioUserIndexesMapper {
    long countByExample(PgStatioUserIndexesExample example);

    int deleteByExample(PgStatioUserIndexesExample example);

    int insert(PgStatioUserIndexes row);

    int insertSelective(PgStatioUserIndexes row);

    List<PgStatioUserIndexes> selectByExample(PgStatioUserIndexesExample example);

    int updateByExampleSelective(@Param("row") PgStatioUserIndexes row, @Param("example") PgStatioUserIndexesExample example);

    int updateByExample(@Param("row") PgStatioUserIndexes row, @Param("example") PgStatioUserIndexesExample example);
}