package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgProc;
import com.pool.readio.readiombg.model.PgProcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgProcMapper {
    long countByExample(PgProcExample example);

    int deleteByExample(PgProcExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgProc row);

    int insertSelective(PgProc row);

    List<PgProc> selectByExample(PgProcExample example);

    PgProc selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgProc row, @Param("example") PgProcExample example);

    int updateByExample(@Param("row") PgProc row, @Param("example") PgProcExample example);

    int updateByPrimaryKeySelective(PgProc row);

    int updateByPrimaryKey(PgProc row);
}