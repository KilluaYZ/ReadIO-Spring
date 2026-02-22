package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgForeignDataWrapper;
import com.pool.readio.readiombg.model.PgForeignDataWrapperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgForeignDataWrapperMapper {
    long countByExample(PgForeignDataWrapperExample example);

    int deleteByExample(PgForeignDataWrapperExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgForeignDataWrapper row);

    int insertSelective(PgForeignDataWrapper row);

    List<PgForeignDataWrapper> selectByExample(PgForeignDataWrapperExample example);

    PgForeignDataWrapper selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgForeignDataWrapper row, @Param("example") PgForeignDataWrapperExample example);

    int updateByExample(@Param("row") PgForeignDataWrapper row, @Param("example") PgForeignDataWrapperExample example);

    int updateByPrimaryKeySelective(PgForeignDataWrapper row);

    int updateByPrimaryKey(PgForeignDataWrapper row);
}