package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsBookContentBlock;
import com.pool.readio.readiombg.model.BmsBookContentBlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookContentBlockMapper {
    long countByExample(BmsBookContentBlockExample example);

    int deleteByExample(BmsBookContentBlockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookContentBlock row);

    int insertSelective(BmsBookContentBlock row);

    List<BmsBookContentBlock> selectByExample(BmsBookContentBlockExample example);

    BmsBookContentBlock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookContentBlock row, @Param("example") BmsBookContentBlockExample example);

    int updateByExample(@Param("row") BmsBookContentBlock row, @Param("example") BmsBookContentBlockExample example);

    int updateByPrimaryKeySelective(BmsBookContentBlock row);

    int updateByPrimaryKey(BmsBookContentBlock row);
}