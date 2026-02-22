package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTimezoneNames;
import com.pool.readio.mbg.model.PgTimezoneNamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTimezoneNamesMapper {
    long countByExample(PgTimezoneNamesExample example);

    int deleteByExample(PgTimezoneNamesExample example);

    int insert(PgTimezoneNames row);

    int insertSelective(PgTimezoneNames row);

    List<PgTimezoneNames> selectByExample(PgTimezoneNamesExample example);

    int updateByExampleSelective(@Param("row") PgTimezoneNames row, @Param("example") PgTimezoneNamesExample example);

    int updateByExample(@Param("row") PgTimezoneNames row, @Param("example") PgTimezoneNamesExample example);
}