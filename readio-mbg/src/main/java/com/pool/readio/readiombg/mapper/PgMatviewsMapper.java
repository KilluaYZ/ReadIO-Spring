package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgMatviews;
import com.pool.readio.readiombg.model.PgMatviewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgMatviewsMapper {
    long countByExample(PgMatviewsExample example);

    int deleteByExample(PgMatviewsExample example);

    int insert(PgMatviews row);

    int insertSelective(PgMatviews row);

    List<PgMatviews> selectByExample(PgMatviewsExample example);

    int updateByExampleSelective(@Param("row") PgMatviews row, @Param("example") PgMatviewsExample example);

    int updateByExample(@Param("row") PgMatviews row, @Param("example") PgMatviewsExample example);
}