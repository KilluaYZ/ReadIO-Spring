package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.Views;
import com.pool.readio.readiombg.model.ViewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewsMapper {
    long countByExample(ViewsExample example);

    int deleteByExample(ViewsExample example);

    int insert(Views row);

    int insertSelective(Views row);

    List<Views> selectByExample(ViewsExample example);

    int updateByExampleSelective(@Param("row") Views row, @Param("example") ViewsExample example);

    int updateByExample(@Param("row") Views row, @Param("example") ViewsExample example);
}