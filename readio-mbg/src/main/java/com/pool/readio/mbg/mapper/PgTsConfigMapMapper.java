package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTsConfigMap;
import com.pool.readio.mbg.model.PgTsConfigMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTsConfigMapMapper {
    long countByExample(PgTsConfigMapExample example);

    int deleteByExample(PgTsConfigMapExample example);

    int deleteByPrimaryKey(@Param("mapcfg") Long mapcfg, @Param("maptokentype") Integer maptokentype, @Param("mapseqno") Integer mapseqno);

    int insert(PgTsConfigMap row);

    int insertSelective(PgTsConfigMap row);

    List<PgTsConfigMap> selectByExample(PgTsConfigMapExample example);

    PgTsConfigMap selectByPrimaryKey(@Param("mapcfg") Long mapcfg, @Param("maptokentype") Integer maptokentype, @Param("mapseqno") Integer mapseqno);

    int updateByExampleSelective(@Param("row") PgTsConfigMap row, @Param("example") PgTsConfigMapExample example);

    int updateByExample(@Param("row") PgTsConfigMap row, @Param("example") PgTsConfigMapExample example);

    int updateByPrimaryKeySelective(PgTsConfigMap row);

    int updateByPrimaryKey(PgTsConfigMap row);
}