package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookCategory;
import com.pool.readio.mbg.model.BmsBookCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookCategoryMapper {
    long countByExample(BmsBookCategoryExample example);

    int deleteByExample(BmsBookCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookCategory row);

    int insertSelective(BmsBookCategory row);

    List<BmsBookCategory> selectByExample(BmsBookCategoryExample example);

    BmsBookCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookCategory row, @Param("example") BmsBookCategoryExample example);

    int updateByExample(@Param("row") BmsBookCategory row, @Param("example") BmsBookCategoryExample example);

    int updateByPrimaryKeySelective(BmsBookCategory row);

    int updateByPrimaryKey(BmsBookCategory row);
}