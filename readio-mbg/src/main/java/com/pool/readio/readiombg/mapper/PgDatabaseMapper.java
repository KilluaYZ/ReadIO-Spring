package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgDatabase;
import com.pool.readio.readiombg.model.PgDatabaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgDatabaseMapper {
    long countByExample(PgDatabaseExample example);

    int deleteByExample(PgDatabaseExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgDatabase row);

    int insertSelective(PgDatabase row);

    List<PgDatabase> selectByExample(PgDatabaseExample example);

    PgDatabase selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgDatabase row, @Param("example") PgDatabaseExample example);

    int updateByExample(@Param("row") PgDatabase row, @Param("example") PgDatabaseExample example);

    int updateByPrimaryKeySelective(PgDatabase row);

    int updateByPrimaryKey(PgDatabase row);
}