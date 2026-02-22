package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.SqlFeatures;
import com.pool.readio.mbg.model.SqlFeaturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlFeaturesMapper {
    long countByExample(SqlFeaturesExample example);

    int deleteByExample(SqlFeaturesExample example);

    int insert(SqlFeatures row);

    int insertSelective(SqlFeatures row);

    List<SqlFeatures> selectByExample(SqlFeaturesExample example);

    int updateByExampleSelective(@Param("row") SqlFeatures row, @Param("example") SqlFeaturesExample example);

    int updateByExample(@Param("row") SqlFeatures row, @Param("example") SqlFeaturesExample example);
}