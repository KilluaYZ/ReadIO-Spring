package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgFileSettings;
import com.pool.readio.readiombg.model.PgFileSettingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgFileSettingsMapper {
    long countByExample(PgFileSettingsExample example);

    int deleteByExample(PgFileSettingsExample example);

    int insert(PgFileSettings row);

    int insertSelective(PgFileSettings row);

    List<PgFileSettings> selectByExample(PgFileSettingsExample example);

    int updateByExampleSelective(@Param("row") PgFileSettings row, @Param("example") PgFileSettingsExample example);

    int updateByExample(@Param("row") PgFileSettings row, @Param("example") PgFileSettingsExample example);
}