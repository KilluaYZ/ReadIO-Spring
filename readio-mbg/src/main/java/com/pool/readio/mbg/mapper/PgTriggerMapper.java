package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTrigger;
import com.pool.readio.mbg.model.PgTriggerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTriggerMapper {
    long countByExample(PgTriggerExample example);

    int deleteByExample(PgTriggerExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgTrigger row);

    int insertSelective(PgTrigger row);

    List<PgTrigger> selectByExampleWithBLOBs(PgTriggerExample example);

    List<PgTrigger> selectByExample(PgTriggerExample example);

    PgTrigger selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgTrigger row, @Param("example") PgTriggerExample example);

    int updateByExampleWithBLOBs(@Param("row") PgTrigger row, @Param("example") PgTriggerExample example);

    int updateByExample(@Param("row") PgTrigger row, @Param("example") PgTriggerExample example);

    int updateByPrimaryKeySelective(PgTrigger row);

    int updateByPrimaryKeyWithBLOBs(PgTrigger row);

    int updateByPrimaryKey(PgTrigger row);
}