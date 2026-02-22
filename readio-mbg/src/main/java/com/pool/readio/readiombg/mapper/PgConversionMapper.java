package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgConversion;
import com.pool.readio.readiombg.model.PgConversionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgConversionMapper {
    long countByExample(PgConversionExample example);

    int deleteByExample(PgConversionExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgConversion row);

    int insertSelective(PgConversion row);

    List<PgConversion> selectByExample(PgConversionExample example);

    PgConversion selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgConversion row, @Param("example") PgConversionExample example);

    int updateByExample(@Param("row") PgConversion row, @Param("example") PgConversionExample example);

    int updateByPrimaryKeySelective(PgConversion row);

    int updateByPrimaryKey(PgConversion row);
}