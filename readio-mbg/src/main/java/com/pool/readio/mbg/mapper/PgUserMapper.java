package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgUser;
import com.pool.readio.mbg.model.PgUserExample;
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