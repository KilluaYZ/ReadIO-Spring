package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.Parameters;
import com.pool.readio.mbg.model.ParametersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParametersMapper {
    long countByExample(ParametersExample example);

    int deleteByExample(ParametersExample example);

    int insert(Parameters row);

    int insertSelective(Parameters row);

    List<Parameters> selectByExample(ParametersExample example);

    int updateByExampleSelective(@Param("row") Parameters row, @Param("example") ParametersExample example);

    int updateByExample(@Param("row") Parameters row, @Param("example") ParametersExample example);
}