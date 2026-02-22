package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgCast;
import com.pool.readio.readiombg.model.PgCastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgCastMapper {
    long countByExample(PgCastExample example);

    int deleteByExample(PgCastExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgCast row);

    int insertSelective(PgCast row);

    List<PgCast> selectByExample(PgCastExample example);

    PgCast selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgCast row, @Param("example") PgCastExample example);

    int updateByExample(@Param("row") PgCast row, @Param("example") PgCastExample example);

    int updateByPrimaryKeySelective(PgCast row);

    int updateByPrimaryKey(PgCast row);
}