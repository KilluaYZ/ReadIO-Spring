package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgLanguage;
import com.pool.readio.readiombg.model.PgLanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgLanguageMapper {
    long countByExample(PgLanguageExample example);

    int deleteByExample(PgLanguageExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgLanguage row);

    int insertSelective(PgLanguage row);

    List<PgLanguage> selectByExample(PgLanguageExample example);

    PgLanguage selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgLanguage row, @Param("example") PgLanguageExample example);

    int updateByExample(@Param("row") PgLanguage row, @Param("example") PgLanguageExample example);

    int updateByPrimaryKeySelective(PgLanguage row);

    int updateByPrimaryKey(PgLanguage row);
}