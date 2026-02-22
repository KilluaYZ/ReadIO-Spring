package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ElementTypes;
import com.pool.readio.readiombg.model.ElementTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementTypesMapper {
    long countByExample(ElementTypesExample example);

    int deleteByExample(ElementTypesExample example);

    int insert(ElementTypes row);

    int insertSelective(ElementTypes row);

    List<ElementTypes> selectByExample(ElementTypesExample example);

    int updateByExampleSelective(@Param("row") ElementTypes row, @Param("example") ElementTypesExample example);

    int updateByExample(@Param("row") ElementTypes row, @Param("example") ElementTypesExample example);
}