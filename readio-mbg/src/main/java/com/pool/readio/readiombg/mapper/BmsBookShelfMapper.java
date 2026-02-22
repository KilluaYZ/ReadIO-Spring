package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsBookShelf;
import com.pool.readio.readiombg.model.BmsBookShelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookShelfMapper {
    long countByExample(BmsBookShelfExample example);

    int deleteByExample(BmsBookShelfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookShelf row);

    int insertSelective(BmsBookShelf row);

    List<BmsBookShelf> selectByExample(BmsBookShelfExample example);

    BmsBookShelf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookShelf row, @Param("example") BmsBookShelfExample example);

    int updateByExample(@Param("row") BmsBookShelf row, @Param("example") BmsBookShelfExample example);

    int updateByPrimaryKeySelective(BmsBookShelf row);

    int updateByPrimaryKey(BmsBookShelf row);
}