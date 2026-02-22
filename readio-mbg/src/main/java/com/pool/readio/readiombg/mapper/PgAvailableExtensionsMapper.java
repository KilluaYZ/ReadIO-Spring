package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgAvailableExtensions;
import com.pool.readio.readiombg.model.PgAvailableExtensionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAvailableExtensionsMapper {
    long countByExample(PgAvailableExtensionsExample example);

    int deleteByExample(PgAvailableExtensionsExample example);

    int insert(PgAvailableExtensions row);

    int insertSelective(PgAvailableExtensions row);

    List<PgAvailableExtensions> selectByExample(PgAvailableExtensionsExample example);

    int updateByExampleSelective(@Param("row") PgAvailableExtensions row, @Param("example") PgAvailableExtensionsExample example);

    int updateByExample(@Param("row") PgAvailableExtensions row, @Param("example") PgAvailableExtensionsExample example);
}