package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgUserMapping;
import com.pool.readio.mbg.model.PgUserMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgUserMappingMapper {
    long countByExample(PgUserMappingExample example);

    int deleteByExample(PgUserMappingExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgUserMapping row);

    int insertSelective(PgUserMapping row);

    List<PgUserMapping> selectByExample(PgUserMappingExample example);

    PgUserMapping selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgUserMapping row, @Param("example") PgUserMappingExample example);

    int updateByExample(@Param("row") PgUserMapping row, @Param("example") PgUserMappingExample example);

    int updateByPrimaryKeySelective(PgUserMapping row);

    int updateByPrimaryKey(PgUserMapping row);
}