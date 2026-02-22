package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgShdepend;
import com.pool.readio.readiombg.model.PgShdependExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgShdependMapper {
    long countByExample(PgShdependExample example);

    int deleteByExample(PgShdependExample example);

    int insert(PgShdepend row);

    int insertSelective(PgShdepend row);

    List<PgShdepend> selectByExample(PgShdependExample example);

    int updateByExampleSelective(@Param("row") PgShdepend row, @Param("example") PgShdependExample example);

    int updateByExample(@Param("row") PgShdepend row, @Param("example") PgShdependExample example);
}