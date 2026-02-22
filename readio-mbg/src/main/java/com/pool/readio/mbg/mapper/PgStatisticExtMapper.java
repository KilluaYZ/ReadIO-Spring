package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatisticExt;
import com.pool.readio.mbg.model.PgStatisticExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatisticExtMapper {
    long countByExample(PgStatisticExtExample example);

    int deleteByExample(PgStatisticExtExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgStatisticExt row);

    int insertSelective(PgStatisticExt row);

    List<PgStatisticExt> selectByExample(PgStatisticExtExample example);

    PgStatisticExt selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgStatisticExt row, @Param("example") PgStatisticExtExample example);

    int updateByExample(@Param("row") PgStatisticExt row, @Param("example") PgStatisticExtExample example);

    int updateByPrimaryKeySelective(PgStatisticExt row);

    int updateByPrimaryKey(PgStatisticExt row);
}