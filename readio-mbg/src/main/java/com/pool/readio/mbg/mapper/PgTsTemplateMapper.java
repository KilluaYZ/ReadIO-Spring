package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTsTemplate;
import com.pool.readio.mbg.model.PgTsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTsTemplateMapper {
    long countByExample(PgTsTemplateExample example);

    int deleteByExample(PgTsTemplateExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgTsTemplate row);

    int insertSelective(PgTsTemplate row);

    List<PgTsTemplate> selectByExample(PgTsTemplateExample example);

    PgTsTemplate selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgTsTemplate row, @Param("example") PgTsTemplateExample example);

    int updateByExample(@Param("row") PgTsTemplate row, @Param("example") PgTsTemplateExample example);

    int updateByPrimaryKeySelective(PgTsTemplate row);

    int updateByPrimaryKey(PgTsTemplate row);
}