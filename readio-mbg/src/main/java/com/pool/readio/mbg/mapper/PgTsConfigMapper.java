package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTsConfig;
import com.pool.readio.mbg.model.PgTsConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTsConfigMapper {
    long countByExample(PgTsConfigExample example);

    int deleteByExample(PgTsConfigExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgTsConfig row);

    int insertSelective(PgTsConfig row);

    List<PgTsConfig> selectByExample(PgTsConfigExample example);

    PgTsConfig selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgTsConfig row, @Param("example") PgTsConfigExample example);

    int updateByExample(@Param("row") PgTsConfig row, @Param("example") PgTsConfigExample example);

    int updateByPrimaryKeySelective(PgTsConfig row);

    int updateByPrimaryKey(PgTsConfig row);
}