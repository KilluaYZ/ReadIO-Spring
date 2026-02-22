package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgAmop;
import com.pool.readio.mbg.model.PgAmopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAmopMapper {
    long countByExample(PgAmopExample example);

    int deleteByExample(PgAmopExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgAmop row);

    int insertSelective(PgAmop row);

    List<PgAmop> selectByExample(PgAmopExample example);

    PgAmop selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgAmop row, @Param("example") PgAmopExample example);

    int updateByExample(@Param("row") PgAmop row, @Param("example") PgAmopExample example);

    int updateByPrimaryKeySelective(PgAmop row);

    int updateByPrimaryKey(PgAmop row);
}