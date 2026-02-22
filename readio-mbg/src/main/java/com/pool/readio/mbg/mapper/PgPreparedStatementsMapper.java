package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgPreparedStatements;
import com.pool.readio.mbg.model.PgPreparedStatementsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPreparedStatementsMapper {
    long countByExample(PgPreparedStatementsExample example);

    int deleteByExample(PgPreparedStatementsExample example);

    int insert(PgPreparedStatements row);

    int insertSelective(PgPreparedStatements row);

    List<PgPreparedStatements> selectByExample(PgPreparedStatementsExample example);

    int updateByExampleSelective(@Param("row") PgPreparedStatements row, @Param("example") PgPreparedStatementsExample example);

    int updateByExample(@Param("row") PgPreparedStatements row, @Param("example") PgPreparedStatementsExample example);
}