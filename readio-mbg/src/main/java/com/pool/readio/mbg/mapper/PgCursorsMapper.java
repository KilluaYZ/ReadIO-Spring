package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgCursors;
import com.pool.readio.mbg.model.PgCursorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgCursorsMapper {
    long countByExample(PgCursorsExample example);

    int deleteByExample(PgCursorsExample example);

    int insert(PgCursors row);

    int insertSelective(PgCursors row);

    List<PgCursors> selectByExample(PgCursorsExample example);

    int updateByExampleSelective(@Param("row") PgCursors row, @Param("example") PgCursorsExample example);

    int updateByExample(@Param("row") PgCursors row, @Param("example") PgCursorsExample example);
}