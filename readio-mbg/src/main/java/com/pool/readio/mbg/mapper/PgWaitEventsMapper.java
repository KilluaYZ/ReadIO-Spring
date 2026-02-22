package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgWaitEvents;
import com.pool.readio.mbg.model.PgWaitEventsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgWaitEventsMapper {
    long countByExample(PgWaitEventsExample example);

    int deleteByExample(PgWaitEventsExample example);

    int insert(PgWaitEvents row);

    int insertSelective(PgWaitEvents row);

    List<PgWaitEvents> selectByExample(PgWaitEventsExample example);

    int updateByExampleSelective(@Param("row") PgWaitEvents row, @Param("example") PgWaitEventsExample example);

    int updateByExample(@Param("row") PgWaitEvents row, @Param("example") PgWaitEventsExample example);
}