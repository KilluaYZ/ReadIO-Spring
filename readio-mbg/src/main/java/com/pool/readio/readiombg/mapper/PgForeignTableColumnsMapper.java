package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgForeignTableColumns;
import com.pool.readio.readiombg.model.PgForeignTableColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgForeignTableColumnsMapper {
    long countByExample(PgForeignTableColumnsExample example);

    int deleteByExample(PgForeignTableColumnsExample example);

    int insert(PgForeignTableColumns row);

    int insertSelective(PgForeignTableColumns row);

    List<PgForeignTableColumns> selectByExample(PgForeignTableColumnsExample example);

    int updateByExampleSelective(@Param("row") PgForeignTableColumns row, @Param("example") PgForeignTableColumnsExample example);

    int updateByExample(@Param("row") PgForeignTableColumns row, @Param("example") PgForeignTableColumnsExample example);
}