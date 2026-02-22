package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ForeignTableOptions;
import com.pool.readio.readiombg.model.ForeignTableOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignTableOptionsMapper {
    long countByExample(ForeignTableOptionsExample example);

    int deleteByExample(ForeignTableOptionsExample example);

    int insert(ForeignTableOptions row);

    int insertSelective(ForeignTableOptions row);

    List<ForeignTableOptions> selectByExample(ForeignTableOptionsExample example);

    int updateByExampleSelective(@Param("row") ForeignTableOptions row, @Param("example") ForeignTableOptionsExample example);

    int updateByExample(@Param("row") ForeignTableOptions row, @Param("example") ForeignTableOptionsExample example);
}