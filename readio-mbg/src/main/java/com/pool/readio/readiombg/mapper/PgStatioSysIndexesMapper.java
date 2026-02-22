package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatioSysIndexes;
import com.pool.readio.readiombg.model.PgStatioSysIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatioSysIndexesMapper {
    long countByExample(PgStatioSysIndexesExample example);

    int deleteByExample(PgStatioSysIndexesExample example);

    int insert(PgStatioSysIndexes row);

    int insertSelective(PgStatioSysIndexes row);

    List<PgStatioSysIndexes> selectByExample(PgStatioSysIndexesExample example);

    int updateByExampleSelective(@Param("row") PgStatioSysIndexes row, @Param("example") PgStatioSysIndexesExample example);

    int updateByExample(@Param("row") PgStatioSysIndexes row, @Param("example") PgStatioSysIndexesExample example);
}