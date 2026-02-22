package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatProgressBasebackup;
import com.pool.readio.readiombg.model.PgStatProgressBasebackupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatProgressBasebackupMapper {
    long countByExample(PgStatProgressBasebackupExample example);

    int deleteByExample(PgStatProgressBasebackupExample example);

    int insert(PgStatProgressBasebackup row);

    int insertSelective(PgStatProgressBasebackup row);

    List<PgStatProgressBasebackup> selectByExample(PgStatProgressBasebackupExample example);

    int updateByExampleSelective(@Param("row") PgStatProgressBasebackup row, @Param("example") PgStatProgressBasebackupExample example);

    int updateByExample(@Param("row") PgStatProgressBasebackup row, @Param("example") PgStatProgressBasebackupExample example);
}