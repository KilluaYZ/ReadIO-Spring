package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgTsParser;
import com.pool.readio.readiombg.model.PgTsParserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTsParserMapper {
    long countByExample(PgTsParserExample example);

    int deleteByExample(PgTsParserExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgTsParser row);

    int insertSelective(PgTsParser row);

    List<PgTsParser> selectByExample(PgTsParserExample example);

    PgTsParser selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgTsParser row, @Param("example") PgTsParserExample example);

    int updateByExample(@Param("row") PgTsParser row, @Param("example") PgTsParserExample example);

    int updateByPrimaryKeySelective(PgTsParser row);

    int updateByPrimaryKey(PgTsParser row);
}