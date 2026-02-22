package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ForeignDataWrappers;
import com.pool.readio.readiombg.model.ForeignDataWrappersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignDataWrappersMapper {
    long countByExample(ForeignDataWrappersExample example);

    int deleteByExample(ForeignDataWrappersExample example);

    int insert(ForeignDataWrappers row);

    int insertSelective(ForeignDataWrappers row);

    List<ForeignDataWrappers> selectByExample(ForeignDataWrappersExample example);

    int updateByExampleSelective(@Param("row") ForeignDataWrappers row, @Param("example") ForeignDataWrappersExample example);

    int updateByExample(@Param("row") ForeignDataWrappers row, @Param("example") ForeignDataWrappersExample example);
}