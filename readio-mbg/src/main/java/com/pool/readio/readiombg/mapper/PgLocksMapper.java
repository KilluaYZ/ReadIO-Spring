package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgLocks;
import com.pool.readio.readiombg.model.PgLocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgLocksMapper {
    long countByExample(PgLocksExample example);

    int deleteByExample(PgLocksExample example);

    int insert(PgLocks row);

    int insertSelective(PgLocks row);

    List<PgLocks> selectByExample(PgLocksExample example);

    int updateByExampleSelective(@Param("row") PgLocks row, @Param("example") PgLocksExample example);

    int updateByExample(@Param("row") PgLocks row, @Param("example") PgLocksExample example);
}