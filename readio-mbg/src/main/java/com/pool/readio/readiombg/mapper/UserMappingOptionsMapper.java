package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UserMappingOptions;
import com.pool.readio.readiombg.model.UserMappingOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMappingOptionsMapper {
    long countByExample(UserMappingOptionsExample example);

    int deleteByExample(UserMappingOptionsExample example);

    int insert(UserMappingOptions row);

    int insertSelective(UserMappingOptions row);

    List<UserMappingOptions> selectByExample(UserMappingOptionsExample example);

    int updateByExampleSelective(@Param("row") UserMappingOptions row, @Param("example") UserMappingOptionsExample example);

    int updateByExample(@Param("row") UserMappingOptions row, @Param("example") UserMappingOptionsExample example);
}