package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatistic;
import com.pool.readio.readiombg.model.PgStatisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatisticMapper {
    long countByExample(PgStatisticExample example);

    int deleteByExample(PgStatisticExample example);

    int deleteByPrimaryKey(@Param("starelid") Long starelid, @Param("staattnum") Short staattnum, @Param("stainherit") Boolean stainherit);

    int insert(PgStatistic row);

    int insertSelective(PgStatistic row);

    List<PgStatistic> selectByExample(PgStatisticExample example);

    PgStatistic selectByPrimaryKey(@Param("starelid") Long starelid, @Param("staattnum") Short staattnum, @Param("stainherit") Boolean stainherit);

    int updateByExampleSelective(@Param("row") PgStatistic row, @Param("example") PgStatisticExample example);

    int updateByExample(@Param("row") PgStatistic row, @Param("example") PgStatisticExample example);

    int updateByPrimaryKeySelective(PgStatistic row);

    int updateByPrimaryKey(PgStatistic row);
}