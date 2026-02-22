package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgClass;
import com.pool.readio.mbg.model.PgClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgClassMapper {
    long countByExample(PgClassExample example);

    int deleteByExample(PgClassExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgClass row);

    int insertSelective(PgClass row);

    List<PgClass> selectByExample(PgClassExample example);

    PgClass selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgClass row, @Param("example") PgClassExample example);

    int updateByExample(@Param("row") PgClass row, @Param("example") PgClassExample example);

    int updateByPrimaryKeySelective(PgClass row);

    int updateByPrimaryKey(PgClass row);
}