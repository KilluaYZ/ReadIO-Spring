package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.Routines;
import com.pool.readio.mbg.model.RoutinesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutinesMapper {
    long countByExample(RoutinesExample example);

    int deleteByExample(RoutinesExample example);

    int insert(Routines row);

    int insertSelective(Routines row);

    List<Routines> selectByExample(RoutinesExample example);

    int updateByExampleSelective(@Param("row") Routines row, @Param("example") RoutinesExample example);

    int updateByExample(@Param("row") Routines row, @Param("example") RoutinesExample example);
}