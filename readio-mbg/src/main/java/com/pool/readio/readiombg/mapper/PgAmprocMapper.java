package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgAmproc;
import com.pool.readio.readiombg.model.PgAmprocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAmprocMapper {
    long countByExample(PgAmprocExample example);

    int deleteByExample(PgAmprocExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgAmproc row);

    int insertSelective(PgAmproc row);

    List<PgAmproc> selectByExample(PgAmprocExample example);

    PgAmproc selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgAmproc row, @Param("example") PgAmprocExample example);

    int updateByExample(@Param("row") PgAmproc row, @Param("example") PgAmprocExample example);

    int updateByPrimaryKeySelective(PgAmproc row);

    int updateByPrimaryKey(PgAmproc row);
}