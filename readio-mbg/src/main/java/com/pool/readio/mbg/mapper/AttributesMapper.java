package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.Attributes;
import com.pool.readio.mbg.model.AttributesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttributesMapper {
    long countByExample(AttributesExample example);

    int deleteByExample(AttributesExample example);

    int insert(Attributes row);

    int insertSelective(Attributes row);

    List<Attributes> selectByExample(AttributesExample example);

    int updateByExampleSelective(@Param("row") Attributes row, @Param("example") AttributesExample example);

    int updateByExample(@Param("row") Attributes row, @Param("example") AttributesExample example);
}