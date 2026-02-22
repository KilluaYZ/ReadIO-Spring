package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgPreparedXacts;
import com.pool.readio.mbg.model.PgPreparedXactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPreparedXactsMapper {
    long countByExample(PgPreparedXactsExample example);

    int deleteByExample(PgPreparedXactsExample example);

    int insert(PgPreparedXacts row);

    int insertSelective(PgPreparedXacts row);

    List<PgPreparedXacts> selectByExample(PgPreparedXactsExample example);

    int updateByExampleSelective(@Param("row") PgPreparedXacts row, @Param("example") PgPreparedXactsExample example);

    int updateByExample(@Param("row") PgPreparedXacts row, @Param("example") PgPreparedXactsExample example);
}