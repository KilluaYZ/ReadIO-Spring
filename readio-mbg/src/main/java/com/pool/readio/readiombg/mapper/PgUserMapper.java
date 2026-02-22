package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgUser;
import com.pool.readio.readiombg.model.PgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgUserMapper {
    long countByExample(PgUserExample example);

    int deleteByExample(PgUserExample example);

    int insert(PgUser row);

    int insertSelective(PgUser row);

    List<PgUser> selectByExample(PgUserExample example);

    int updateByExampleSelective(@Param("row") PgUser row, @Param("example") PgUserExample example);

    int updateByExample(@Param("row") PgUser row, @Param("example") PgUserExample example);
}