package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgViews;
import com.pool.readio.readiombg.model.PgViewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgViewsMapper {
    long countByExample(PgViewsExample example);

    int deleteByExample(PgViewsExample example);

    int insert(PgViews row);

    int insertSelective(PgViews row);

    List<PgViews> selectByExample(PgViewsExample example);

    int updateByExampleSelective(@Param("row") PgViews row, @Param("example") PgViewsExample example);

    int updateByExample(@Param("row") PgViews row, @Param("example") PgViewsExample example);
}