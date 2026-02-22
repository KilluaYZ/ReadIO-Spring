package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.Collations;
import com.pool.readio.mbg.model.CollationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationsMapper {
    long countByExample(CollationsExample example);

    int deleteByExample(CollationsExample example);

    int insert(Collations row);

    int insertSelective(Collations row);

    List<Collations> selectByExample(CollationsExample example);

    int updateByExampleSelective(@Param("row") Collations row, @Param("example") CollationsExample example);

    int updateByExample(@Param("row") Collations row, @Param("example") CollationsExample example);
}