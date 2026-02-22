package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgTsDict;
import com.pool.readio.readiombg.model.PgTsDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTsDictMapper {
    long countByExample(PgTsDictExample example);

    int deleteByExample(PgTsDictExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgTsDict row);

    int insertSelective(PgTsDict row);

    List<PgTsDict> selectByExample(PgTsDictExample example);

    PgTsDict selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgTsDict row, @Param("example") PgTsDictExample example);

    int updateByExample(@Param("row") PgTsDict row, @Param("example") PgTsDictExample example);

    int updateByPrimaryKeySelective(PgTsDict row);

    int updateByPrimaryKey(PgTsDict row);
}