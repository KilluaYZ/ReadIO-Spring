package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgConfig;
import com.pool.readio.mbg.model.PgConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgConfigMapper {
    long countByExample(PgConfigExample example);

    int deleteByExample(PgConfigExample example);

    int insert(PgConfig row);

    int insertSelective(PgConfig row);

    List<PgConfig> selectByExample(PgConfigExample example);

    int updateByExampleSelective(@Param("row") PgConfig row, @Param("example") PgConfigExample example);

    int updateByExample(@Param("row") PgConfig row, @Param("example") PgConfigExample example);
}