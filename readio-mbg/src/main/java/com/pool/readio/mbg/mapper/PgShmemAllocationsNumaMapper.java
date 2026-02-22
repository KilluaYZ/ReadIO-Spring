package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgShmemAllocationsNuma;
import com.pool.readio.mbg.model.PgShmemAllocationsNumaExample;
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