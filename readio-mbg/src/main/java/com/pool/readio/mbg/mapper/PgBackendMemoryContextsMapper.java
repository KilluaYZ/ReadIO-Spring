package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgBackendMemoryContexts;
import com.pool.readio.mbg.model.PgBackendMemoryContextsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgBackendMemoryContextsMapper {
    long countByExample(PgBackendMemoryContextsExample example);

    int deleteByExample(PgBackendMemoryContextsExample example);

    int insert(PgBackendMemoryContexts row);

    int insertSelective(PgBackendMemoryContexts row);

    List<PgBackendMemoryContexts> selectByExample(PgBackendMemoryContextsExample example);

    int updateByExampleSelective(@Param("row") PgBackendMemoryContexts row, @Param("example") PgBackendMemoryContextsExample example);

    int updateByExample(@Param("row") PgBackendMemoryContexts row, @Param("example") PgBackendMemoryContextsExample example);
}