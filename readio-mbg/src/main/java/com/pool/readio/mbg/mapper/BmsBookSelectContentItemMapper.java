package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookSelectContentItem;
import com.pool.readio.mbg.model.BmsBookSelectContentItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookSelectContentItemMapper {
    long countByExample(BmsBookSelectContentItemExample example);

    int deleteByExample(BmsBookSelectContentItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookSelectContentItem row);

    int insertSelective(BmsBookSelectContentItem row);

    List<BmsBookSelectContentItem> selectByExample(BmsBookSelectContentItemExample example);

    BmsBookSelectContentItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookSelectContentItem row, @Param("example") BmsBookSelectContentItemExample example);

    int updateByExample(@Param("row") BmsBookSelectContentItem row, @Param("example") BmsBookSelectContentItemExample example);

    int updateByPrimaryKeySelective(BmsBookSelectContentItem row);

    int updateByPrimaryKey(BmsBookSelectContentItem row);
}