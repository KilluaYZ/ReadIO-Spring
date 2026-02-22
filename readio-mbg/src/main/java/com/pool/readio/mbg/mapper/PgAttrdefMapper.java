package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgAttrdef;
import com.pool.readio.mbg.model.PgAttrdefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAttrdefMapper {
    long countByExample(PgAttrdefExample example);

    int deleteByExample(PgAttrdefExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgAttrdef row);

    int insertSelective(PgAttrdef row);

    List<PgAttrdef> selectByExample(PgAttrdefExample example);

    PgAttrdef selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgAttrdef row, @Param("example") PgAttrdefExample example);

    int updateByExample(@Param("row") PgAttrdef row, @Param("example") PgAttrdefExample example);

    int updateByPrimaryKeySelective(PgAttrdef row);

    int updateByPrimaryKey(PgAttrdef row);
}