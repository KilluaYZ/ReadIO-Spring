package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgAttribute;
import com.pool.readio.mbg.model.PgAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAttributeMapper {
    long countByExample(PgAttributeExample example);

    int deleteByExample(PgAttributeExample example);

    int deleteByPrimaryKey(@Param("attrelid") Long attrelid, @Param("attnum") Short attnum);

    int insert(PgAttribute row);

    int insertSelective(PgAttribute row);

    List<PgAttribute> selectByExample(PgAttributeExample example);

    PgAttribute selectByPrimaryKey(@Param("attrelid") Long attrelid, @Param("attnum") Short attnum);

    int updateByExampleSelective(@Param("row") PgAttribute row, @Param("example") PgAttributeExample example);

    int updateByExample(@Param("row") PgAttribute row, @Param("example") PgAttributeExample example);

    int updateByPrimaryKeySelective(PgAttribute row);

    int updateByPrimaryKey(PgAttribute row);
}