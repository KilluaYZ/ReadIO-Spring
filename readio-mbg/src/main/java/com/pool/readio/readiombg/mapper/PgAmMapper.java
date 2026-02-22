package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgAm;
import com.pool.readio.readiombg.model.PgAmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAmMapper {
    long countByExample(PgAmExample example);

    int deleteByExample(PgAmExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgAm row);

    int insertSelective(PgAm row);

    List<PgAm> selectByExample(PgAmExample example);

    PgAm selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgAm row, @Param("example") PgAmExample example);

    int updateByExample(@Param("row") PgAm row, @Param("example") PgAmExample example);

    int updateByPrimaryKeySelective(PgAm row);

    int updateByPrimaryKey(PgAm row);
}