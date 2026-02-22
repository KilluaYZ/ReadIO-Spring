package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgEventTrigger;
import com.pool.readio.readiombg.model.PgEventTriggerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgEventTriggerMapper {
    long countByExample(PgEventTriggerExample example);

    int deleteByExample(PgEventTriggerExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgEventTrigger row);

    int insertSelective(PgEventTrigger row);

    List<PgEventTrigger> selectByExample(PgEventTriggerExample example);

    PgEventTrigger selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgEventTrigger row, @Param("example") PgEventTriggerExample example);

    int updateByExample(@Param("row") PgEventTrigger row, @Param("example") PgEventTriggerExample example);

    int updateByPrimaryKeySelective(PgEventTrigger row);

    int updateByPrimaryKey(PgEventTrigger row);
}