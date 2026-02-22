package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgWaitEvents;
import com.pool.readio.readiombg.model.PgWaitEventsExample;
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