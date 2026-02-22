package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgShadow;
import com.pool.readio.mbg.model.PgShadowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgShadowMapper {
    long countByExample(PgShadowExample example);

    int deleteByExample(PgShadowExample example);

    int insert(PgShadow row);

    int insertSelective(PgShadow row);

    List<PgShadow> selectByExample(PgShadowExample example);

    int updateByExampleSelective(@Param("row") PgShadow row, @Param("example") PgShadowExample example);

    int updateByExample(@Param("row") PgShadow row, @Param("example") PgShadowExample example);
}