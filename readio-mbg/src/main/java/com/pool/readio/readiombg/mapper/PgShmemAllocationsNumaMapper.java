package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgShmemAllocationsNuma;
import com.pool.readio.readiombg.model.PgShmemAllocationsNumaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgShmemAllocationsNumaMapper {
    long countByExample(PgShmemAllocationsNumaExample example);

    int deleteByExample(PgShmemAllocationsNumaExample example);

    int insert(PgShmemAllocationsNuma row);

    int insertSelective(PgShmemAllocationsNuma row);

    List<PgShmemAllocationsNuma> selectByExample(PgShmemAllocationsNumaExample example);

    int updateByExampleSelective(@Param("row") PgShmemAllocationsNuma row, @Param("example") PgShmemAllocationsNumaExample example);

    int updateByExample(@Param("row") PgShmemAllocationsNuma row, @Param("example") PgShmemAllocationsNumaExample example);
}