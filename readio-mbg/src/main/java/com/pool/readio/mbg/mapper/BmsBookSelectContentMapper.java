package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookSelectContent;
import com.pool.readio.mbg.model.BmsBookSelectContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookSelectContentMapper {
    long countByExample(BmsBookSelectContentExample example);

    int deleteByExample(BmsBookSelectContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookSelectContent row);

    int insertSelective(BmsBookSelectContent row);

    List<BmsBookSelectContent> selectByExample(BmsBookSelectContentExample example);

    BmsBookSelectContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookSelectContent row, @Param("example") BmsBookSelectContentExample example);

    int updateByExample(@Param("row") BmsBookSelectContent row, @Param("example") BmsBookSelectContentExample example);

    int updateByPrimaryKeySelective(BmsBookSelectContent row);

    int updateByPrimaryKey(BmsBookSelectContent row);
}