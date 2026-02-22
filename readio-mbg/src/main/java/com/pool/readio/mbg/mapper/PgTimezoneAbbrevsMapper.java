package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTimezoneAbbrevs;
import com.pool.readio.mbg.model.PgTimezoneAbbrevsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTimezoneAbbrevsMapper {
    long countByExample(PgTimezoneAbbrevsExample example);

    int deleteByExample(PgTimezoneAbbrevsExample example);

    int insert(PgTimezoneAbbrevs row);

    int insertSelective(PgTimezoneAbbrevs row);

    List<PgTimezoneAbbrevs> selectByExample(PgTimezoneAbbrevsExample example);

    int updateByExampleSelective(@Param("row") PgTimezoneAbbrevs row, @Param("example") PgTimezoneAbbrevsExample example);

    int updateByExample(@Param("row") PgTimezoneAbbrevs row, @Param("example") PgTimezoneAbbrevsExample example);
}