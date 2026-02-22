package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatCheckpointer;
import com.pool.readio.readiombg.model.PgStatCheckpointerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatCheckpointerMapper {
    long countByExample(PgStatCheckpointerExample example);

    int deleteByExample(PgStatCheckpointerExample example);

    int insert(PgStatCheckpointer row);

    int insertSelective(PgStatCheckpointer row);

    List<PgStatCheckpointer> selectByExample(PgStatCheckpointerExample example);

    int updateByExampleSelective(@Param("row") PgStatCheckpointer row, @Param("example") PgStatCheckpointerExample example);

    int updateByExample(@Param("row") PgStatCheckpointer row, @Param("example") PgStatCheckpointerExample example);
}