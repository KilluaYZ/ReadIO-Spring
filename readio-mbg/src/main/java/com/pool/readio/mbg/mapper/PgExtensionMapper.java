package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgExtension;
import com.pool.readio.mbg.model.PgExtensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgExtensionMapper {
    long countByExample(PgExtensionExample example);

    int deleteByExample(PgExtensionExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgExtension row);

    int insertSelective(PgExtension row);

    List<PgExtension> selectByExample(PgExtensionExample example);

    PgExtension selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgExtension row, @Param("example") PgExtensionExample example);

    int updateByExample(@Param("row") PgExtension row, @Param("example") PgExtensionExample example);

    int updateByPrimaryKeySelective(PgExtension row);

    int updateByPrimaryKey(PgExtension row);
}