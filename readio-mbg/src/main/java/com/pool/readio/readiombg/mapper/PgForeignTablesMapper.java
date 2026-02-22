package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgForeignTables;
import com.pool.readio.readiombg.model.PgForeignTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgForeignTablesMapper {
    long countByExample(PgForeignTablesExample example);

    int deleteByExample(PgForeignTablesExample example);

    int insert(PgForeignTables row);

    int insertSelective(PgForeignTables row);

    List<PgForeignTables> selectByExample(PgForeignTablesExample example);

    int updateByExampleSelective(@Param("row") PgForeignTables row, @Param("example") PgForeignTablesExample example);

    int updateByExample(@Param("row") PgForeignTables row, @Param("example") PgForeignTablesExample example);
}