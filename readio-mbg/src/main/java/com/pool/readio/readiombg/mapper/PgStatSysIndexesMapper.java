package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatSysIndexes;
import com.pool.readio.readiombg.model.PgStatSysIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatSysIndexesMapper {
    long countByExample(PgStatSysIndexesExample example);

    int deleteByExample(PgStatSysIndexesExample example);

    int insert(PgStatSysIndexes row);

    int insertSelective(PgStatSysIndexes row);

    List<PgStatSysIndexes> selectByExample(PgStatSysIndexesExample example);

    int updateByExampleSelective(@Param("row") PgStatSysIndexes row, @Param("example") PgStatSysIndexesExample example);

    int updateByExample(@Param("row") PgStatSysIndexes row, @Param("example") PgStatSysIndexesExample example);
}