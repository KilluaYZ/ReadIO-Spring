package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatDatabaseConflicts;
import com.pool.readio.readiombg.model.PgStatDatabaseConflictsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatDatabaseConflictsMapper {
    long countByExample(PgStatDatabaseConflictsExample example);

    int deleteByExample(PgStatDatabaseConflictsExample example);

    int insert(PgStatDatabaseConflicts row);

    int insertSelective(PgStatDatabaseConflicts row);

    List<PgStatDatabaseConflicts> selectByExample(PgStatDatabaseConflictsExample example);

    int updateByExampleSelective(@Param("row") PgStatDatabaseConflicts row, @Param("example") PgStatDatabaseConflictsExample example);

    int updateByExample(@Param("row") PgStatDatabaseConflicts row, @Param("example") PgStatDatabaseConflictsExample example);
}