package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgType;
import com.pool.readio.mbg.model.PgTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTypeMapper {
    long countByExample(PgTypeExample example);

    int deleteByExample(PgTypeExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgType row);

    int insertSelective(PgType row);

    List<PgType> selectByExample(PgTypeExample example);

    PgType selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgType row, @Param("example") PgTypeExample example);

    int updateByExample(@Param("row") PgType row, @Param("example") PgTypeExample example);

    int updateByPrimaryKeySelective(PgType row);

    int updateByPrimaryKey(PgType row);
}