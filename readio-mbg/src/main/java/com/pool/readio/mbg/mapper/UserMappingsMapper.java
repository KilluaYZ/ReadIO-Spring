package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.UserMappings;
import com.pool.readio.mbg.model.UserMappingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMappingsMapper {
    long countByExample(UserMappingsExample example);

    int deleteByExample(UserMappingsExample example);

    int insert(UserMappings row);

    int insertSelective(UserMappings row);

    List<UserMappings> selectByExample(UserMappingsExample example);

    int updateByExampleSelective(@Param("row") UserMappings row, @Param("example") UserMappingsExample example);

    int updateByExample(@Param("row") UserMappings row, @Param("example") UserMappingsExample example);
}