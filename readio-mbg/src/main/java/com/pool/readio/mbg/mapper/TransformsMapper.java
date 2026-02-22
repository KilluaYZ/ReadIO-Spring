package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.Transforms;
import com.pool.readio.mbg.model.TransformsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransformsMapper {
    long countByExample(TransformsExample example);

    int deleteByExample(TransformsExample example);

    int insert(Transforms row);

    int insertSelective(Transforms row);

    List<Transforms> selectByExample(TransformsExample example);

    int updateByExampleSelective(@Param("row") Transforms row, @Param("example") TransformsExample example);

    int updateByExample(@Param("row") Transforms row, @Param("example") TransformsExample example);
}