package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgUserMappings;
import com.pool.readio.mbg.model.PgUserMappingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgUserMappingsMapper {
    long countByExample(PgUserMappingsExample example);

    int deleteByExample(PgUserMappingsExample example);

    int insert(PgUserMappings row);

    int insertSelective(PgUserMappings row);

    List<PgUserMappings> selectByExample(PgUserMappingsExample example);

    int updateByExampleSelective(@Param("row") PgUserMappings row, @Param("example") PgUserMappingsExample example);

    int updateByExample(@Param("row") PgUserMappings row, @Param("example") PgUserMappingsExample example);
}