package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatProgressVacuum;
import com.pool.readio.mbg.model.PgStatProgressVacuumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatProgressVacuumMapper {
    long countByExample(PgStatProgressVacuumExample example);

    int deleteByExample(PgStatProgressVacuumExample example);

    int insert(PgStatProgressVacuum row);

    int insertSelective(PgStatProgressVacuum row);

    List<PgStatProgressVacuum> selectByExample(PgStatProgressVacuumExample example);

    int updateByExampleSelective(@Param("row") PgStatProgressVacuum row, @Param("example") PgStatProgressVacuumExample example);

    int updateByExample(@Param("row") PgStatProgressVacuum row, @Param("example") PgStatProgressVacuumExample example);
}