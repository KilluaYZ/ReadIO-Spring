package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgPartitionedTable;
import com.pool.readio.readiombg.model.PgPartitionedTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPartitionedTableMapper {
    long countByExample(PgPartitionedTableExample example);

    int deleteByExample(PgPartitionedTableExample example);

    int deleteByPrimaryKey(Long partrelid);

    int insert(PgPartitionedTable row);

    int insertSelective(PgPartitionedTable row);

    List<PgPartitionedTable> selectByExample(PgPartitionedTableExample example);

    PgPartitionedTable selectByPrimaryKey(Long partrelid);

    int updateByExampleSelective(@Param("row") PgPartitionedTable row, @Param("example") PgPartitionedTableExample example);

    int updateByExample(@Param("row") PgPartitionedTable row, @Param("example") PgPartitionedTableExample example);

    int updateByPrimaryKeySelective(PgPartitionedTable row);

    int updateByPrimaryKey(PgPartitionedTable row);
}