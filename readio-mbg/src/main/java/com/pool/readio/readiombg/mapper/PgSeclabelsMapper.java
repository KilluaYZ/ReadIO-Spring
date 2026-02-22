package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgSeclabels;
import com.pool.readio.readiombg.model.PgSeclabelsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgSeclabelsMapper {
    long countByExample(PgSeclabelsExample example);

    int deleteByExample(PgSeclabelsExample example);

    int insert(PgSeclabels row);

    int insertSelective(PgSeclabels row);

    List<PgSeclabels> selectByExample(PgSeclabelsExample example);

    int updateByExampleSelective(@Param("row") PgSeclabels row, @Param("example") PgSeclabelsExample example);

    int updateByExample(@Param("row") PgSeclabels row, @Param("example") PgSeclabelsExample example);
}