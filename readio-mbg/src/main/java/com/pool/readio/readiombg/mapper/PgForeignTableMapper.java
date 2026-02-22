package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgForeignTable;
import com.pool.readio.readiombg.model.PgForeignTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgForeignTableMapper {
    long countByExample(PgForeignTableExample example);

    int deleteByExample(PgForeignTableExample example);

    int deleteByPrimaryKey(Long ftrelid);

    int insert(PgForeignTable row);

    int insertSelective(PgForeignTable row);

    List<PgForeignTable> selectByExample(PgForeignTableExample example);

    PgForeignTable selectByPrimaryKey(Long ftrelid);

    int updateByExampleSelective(@Param("row") PgForeignTable row, @Param("example") PgForeignTableExample example);

    int updateByExample(@Param("row") PgForeignTable row, @Param("example") PgForeignTableExample example);

    int updateByPrimaryKeySelective(PgForeignTable row);

    int updateByPrimaryKey(PgForeignTable row);
}