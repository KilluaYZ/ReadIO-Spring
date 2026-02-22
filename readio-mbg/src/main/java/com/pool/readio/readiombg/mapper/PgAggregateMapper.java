package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgAggregate;
import com.pool.readio.readiombg.model.PgAggregateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAggregateMapper {
    long countByExample(PgAggregateExample example);

    int deleteByExample(PgAggregateExample example);

    int deleteByPrimaryKey(Object aggfnoid);

    int insert(PgAggregate row);

    int insertSelective(PgAggregate row);

    List<PgAggregate> selectByExample(PgAggregateExample example);

    PgAggregate selectByPrimaryKey(Object aggfnoid);

    int updateByExampleSelective(@Param("row") PgAggregate row, @Param("example") PgAggregateExample example);

    int updateByExample(@Param("row") PgAggregate row, @Param("example") PgAggregateExample example);

    int updateByPrimaryKeySelective(PgAggregate row);

    int updateByPrimaryKey(PgAggregate row);
}