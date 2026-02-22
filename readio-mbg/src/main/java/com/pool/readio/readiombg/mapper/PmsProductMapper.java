package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PmsProduct;
import com.pool.readio.readiombg.model.PmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductMapper {
    long countByExample(PmsProductExample example);

    int deleteByExample(PmsProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProduct row);

    int insertSelective(PmsProduct row);

    List<PmsProduct> selectByExample(PmsProductExample example);

    PmsProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") PmsProduct row, @Param("example") PmsProductExample example);

    int updateByExample(@Param("row") PmsProduct row, @Param("example") PmsProductExample example);

    int updateByPrimaryKeySelective(PmsProduct row);

    int updateByPrimaryKey(PmsProduct row);
}