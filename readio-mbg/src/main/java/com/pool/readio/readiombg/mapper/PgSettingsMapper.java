package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgSettings;
import com.pool.readio.readiombg.model.PgSettingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgSettingsMapper {
    long countByExample(PgSettingsExample example);

    int deleteByExample(PgSettingsExample example);

    int insert(PgSettings row);

    int insertSelective(PgSettings row);

    List<PgSettings> selectByExample(PgSettingsExample example);

    int updateByExampleSelective(@Param("row") PgSettings row, @Param("example") PgSettingsExample example);

    int updateByExample(@Param("row") PgSettings row, @Param("example") PgSettingsExample example);
}