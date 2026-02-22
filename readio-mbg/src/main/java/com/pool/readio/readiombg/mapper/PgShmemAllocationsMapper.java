package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgShmemAllocations;
import com.pool.readio.readiombg.model.PgShmemAllocationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgShmemAllocationsMapper {
    long countByExample(PgShmemAllocationsExample example);

    int deleteByExample(PgShmemAllocationsExample example);

    int insert(PgShmemAllocations row);

    int insertSelective(PgShmemAllocations row);

    List<PgShmemAllocations> selectByExample(PgShmemAllocationsExample example);

    int updateByExampleSelective(@Param("row") PgShmemAllocations row, @Param("example") PgShmemAllocationsExample example);

    int updateByExample(@Param("row") PgShmemAllocations row, @Param("example") PgShmemAllocationsExample example);
}