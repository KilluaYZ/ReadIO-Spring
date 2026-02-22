package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgIdentFileMappings;
import com.pool.readio.readiombg.model.PgIdentFileMappingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgIdentFileMappingsMapper {
    long countByExample(PgIdentFileMappingsExample example);

    int deleteByExample(PgIdentFileMappingsExample example);

    int insert(PgIdentFileMappings row);

    int insertSelective(PgIdentFileMappings row);

    List<PgIdentFileMappings> selectByExample(PgIdentFileMappingsExample example);

    int updateByExampleSelective(@Param("row") PgIdentFileMappings row, @Param("example") PgIdentFileMappingsExample example);

    int updateByExample(@Param("row") PgIdentFileMappings row, @Param("example") PgIdentFileMappingsExample example);
}