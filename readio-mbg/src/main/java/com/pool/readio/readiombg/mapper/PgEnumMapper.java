package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgEnum;
import com.pool.readio.readiombg.model.PgEnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgEnumMapper {
    long countByExample(PgEnumExample example);

    int deleteByExample(PgEnumExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgEnum row);

    int insertSelective(PgEnum row);

    List<PgEnum> selectByExample(PgEnumExample example);

    PgEnum selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgEnum row, @Param("example") PgEnumExample example);

    int updateByExample(@Param("row") PgEnum row, @Param("example") PgEnumExample example);

    int updateByPrimaryKeySelective(PgEnum row);

    int updateByPrimaryKey(PgEnum row);
}