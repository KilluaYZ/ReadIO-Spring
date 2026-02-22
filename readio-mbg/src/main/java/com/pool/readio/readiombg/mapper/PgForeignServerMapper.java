package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgForeignServer;
import com.pool.readio.readiombg.model.PgForeignServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgForeignServerMapper {
    long countByExample(PgForeignServerExample example);

    int deleteByExample(PgForeignServerExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgForeignServer row);

    int insertSelective(PgForeignServer row);

    List<PgForeignServer> selectByExample(PgForeignServerExample example);

    PgForeignServer selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgForeignServer row, @Param("example") PgForeignServerExample example);

    int updateByExample(@Param("row") PgForeignServer row, @Param("example") PgForeignServerExample example);

    int updateByPrimaryKeySelective(PgForeignServer row);

    int updateByPrimaryKey(PgForeignServer row);
}