package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatisticExtData;
import com.pool.readio.readiombg.model.PgStatisticExtDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatisticExtDataMapper {
    long countByExample(PgStatisticExtDataExample example);

    int deleteByExample(PgStatisticExtDataExample example);

    int deleteByPrimaryKey(@Param("stxoid") Long stxoid, @Param("stxdinherit") Boolean stxdinherit);

    int insert(PgStatisticExtData row);

    int insertSelective(PgStatisticExtData row);

    List<PgStatisticExtData> selectByExample(PgStatisticExtDataExample example);

    PgStatisticExtData selectByPrimaryKey(@Param("stxoid") Long stxoid, @Param("stxdinherit") Boolean stxdinherit);

    int updateByExampleSelective(@Param("row") PgStatisticExtData row, @Param("example") PgStatisticExtDataExample example);

    int updateByExample(@Param("row") PgStatisticExtData row, @Param("example") PgStatisticExtDataExample example);

    int updateByPrimaryKeySelective(PgStatisticExtData row);

    int updateByPrimaryKey(PgStatisticExtData row);
}