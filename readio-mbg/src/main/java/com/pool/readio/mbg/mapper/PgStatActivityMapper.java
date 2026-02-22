package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatActivity;
import com.pool.readio.mbg.model.PgStatActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatActivityMapper {
    long countByExample(PgStatActivityExample example);

    int deleteByExample(PgStatActivityExample example);

    int insert(PgStatActivity row);

    int insertSelective(PgStatActivity row);

    List<PgStatActivity> selectByExample(PgStatActivityExample example);

    int updateByExampleSelective(@Param("row") PgStatActivity row, @Param("example") PgStatActivityExample example);

    int updateByExample(@Param("row") PgStatActivity row, @Param("example") PgStatActivityExample example);
}