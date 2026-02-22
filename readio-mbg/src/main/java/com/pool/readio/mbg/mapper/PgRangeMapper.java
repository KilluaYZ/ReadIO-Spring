package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgRange;
import com.pool.readio.mbg.model.PgRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgRangeMapper {
    long countByExample(PgRangeExample example);

    int deleteByExample(PgRangeExample example);

    int deleteByPrimaryKey(Long rngtypid);

    int insert(PgRange row);

    int insertSelective(PgRange row);

    List<PgRange> selectByExample(PgRangeExample example);

    PgRange selectByPrimaryKey(Long rngtypid);

    int updateByExampleSelective(@Param("row") PgRange row, @Param("example") PgRangeExample example);

    int updateByExample(@Param("row") PgRange row, @Param("example") PgRangeExample example);

    int updateByPrimaryKeySelective(PgRange row);

    int updateByPrimaryKey(PgRange row);
}