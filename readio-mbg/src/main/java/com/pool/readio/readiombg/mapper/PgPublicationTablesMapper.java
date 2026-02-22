package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgPublicationTables;
import com.pool.readio.readiombg.model.PgPublicationTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPublicationTablesMapper {
    long countByExample(PgPublicationTablesExample example);

    int deleteByExample(PgPublicationTablesExample example);

    int insert(PgPublicationTables row);

    int insertSelective(PgPublicationTables row);

    List<PgPublicationTables> selectByExample(PgPublicationTablesExample example);

    int updateByExampleSelective(@Param("row") PgPublicationTables row, @Param("example") PgPublicationTablesExample example);

    int updateByExample(@Param("row") PgPublicationTables row, @Param("example") PgPublicationTablesExample example);
}