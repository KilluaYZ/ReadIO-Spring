package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgAios;
import com.pool.readio.mbg.model.PgAiosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAiosMapper {
    long countByExample(PgAiosExample example);

    int deleteByExample(PgAiosExample example);

    int insert(PgAios row);

    int insertSelective(PgAios row);

    List<PgAios> selectByExample(PgAiosExample example);

    int updateByExampleSelective(@Param("row") PgAios row, @Param("example") PgAiosExample example);

    int updateByExample(@Param("row") PgAios row, @Param("example") PgAiosExample example);
}