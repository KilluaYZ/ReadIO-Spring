package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatWal;
import com.pool.readio.readiombg.model.PgStatWalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatWalMapper {
    long countByExample(PgStatWalExample example);

    int deleteByExample(PgStatWalExample example);

    int insert(PgStatWal row);

    int insertSelective(PgStatWal row);

    List<PgStatWal> selectByExample(PgStatWalExample example);

    int updateByExampleSelective(@Param("row") PgStatWal row, @Param("example") PgStatWalExample example);

    int updateByExample(@Param("row") PgStatWal row, @Param("example") PgStatWalExample example);
}