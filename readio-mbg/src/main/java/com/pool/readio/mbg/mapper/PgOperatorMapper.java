package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgOperator;
import com.pool.readio.mbg.model.PgOperatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgOperatorMapper {
    long countByExample(PgOperatorExample example);

    int deleteByExample(PgOperatorExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgOperator row);

    int insertSelective(PgOperator row);

    List<PgOperator> selectByExample(PgOperatorExample example);

    PgOperator selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgOperator row, @Param("example") PgOperatorExample example);

    int updateByExample(@Param("row") PgOperator row, @Param("example") PgOperatorExample example);

    int updateByPrimaryKeySelective(PgOperator row);

    int updateByPrimaryKey(PgOperator row);
}