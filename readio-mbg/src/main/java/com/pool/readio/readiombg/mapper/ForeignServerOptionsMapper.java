package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ForeignServerOptions;
import com.pool.readio.readiombg.model.ForeignServerOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignServerOptionsMapper {
    long countByExample(ForeignServerOptionsExample example);

    int deleteByExample(ForeignServerOptionsExample example);

    int insert(ForeignServerOptions row);

    int insertSelective(ForeignServerOptions row);

    List<ForeignServerOptions> selectByExample(ForeignServerOptionsExample example);

    int updateByExampleSelective(@Param("row") ForeignServerOptions row, @Param("example") ForeignServerOptionsExample example);

    int updateByExample(@Param("row") ForeignServerOptions row, @Param("example") ForeignServerOptionsExample example);
}