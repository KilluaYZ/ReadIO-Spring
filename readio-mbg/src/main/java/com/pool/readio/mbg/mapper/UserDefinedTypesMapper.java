package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.UserDefinedTypes;
import com.pool.readio.mbg.model.UserDefinedTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDefinedTypesMapper {
    long countByExample(UserDefinedTypesExample example);

    int deleteByExample(UserDefinedTypesExample example);

    int insert(UserDefinedTypes row);

    int insertSelective(UserDefinedTypes row);

    List<UserDefinedTypes> selectByExample(UserDefinedTypesExample example);

    int updateByExampleSelective(@Param("row") UserDefinedTypes row, @Param("example") UserDefinedTypesExample example);

    int updateByExample(@Param("row") UserDefinedTypes row, @Param("example") UserDefinedTypesExample example);
}