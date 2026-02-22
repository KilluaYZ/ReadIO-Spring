package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.ForeignDataWrapperOptions;
import com.pool.readio.mbg.model.ForeignDataWrapperOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignDataWrapperOptionsMapper {
    long countByExample(ForeignDataWrapperOptionsExample example);

    int deleteByExample(ForeignDataWrapperOptionsExample example);

    int insert(ForeignDataWrapperOptions row);

    int insertSelective(ForeignDataWrapperOptions row);

    List<ForeignDataWrapperOptions> selectByExample(ForeignDataWrapperOptionsExample example);

    int updateByExampleSelective(@Param("row") ForeignDataWrapperOptions row, @Param("example") ForeignDataWrapperOptionsExample example);

    int updateByExample(@Param("row") ForeignDataWrapperOptions row, @Param("example") ForeignDataWrapperOptionsExample example);
}