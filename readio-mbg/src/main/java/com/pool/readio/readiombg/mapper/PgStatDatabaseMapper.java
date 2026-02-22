package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatDatabase;
import com.pool.readio.readiombg.model.PgStatDatabaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatDatabaseMapper {
    long countByExample(PgStatDatabaseExample example);

    int deleteByExample(PgStatDatabaseExample example);

    int insert(PgStatDatabase row);

    int insertSelective(PgStatDatabase row);

    List<PgStatDatabase> selectByExample(PgStatDatabaseExample example);

    int updateByExampleSelective(@Param("row") PgStatDatabase row, @Param("example") PgStatDatabaseExample example);

    int updateByExample(@Param("row") PgStatDatabase row, @Param("example") PgStatDatabaseExample example);
}