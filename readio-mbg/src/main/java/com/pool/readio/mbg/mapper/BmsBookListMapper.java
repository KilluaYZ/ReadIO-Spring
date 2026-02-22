package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookList;
import com.pool.readio.mbg.model.BmsBookListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookListMapper {
    long countByExample(BmsBookListExample example);

    int deleteByExample(BmsBookListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookList row);

    int insertSelective(BmsBookList row);

    List<BmsBookList> selectByExample(BmsBookListExample example);

    BmsBookList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookList row, @Param("example") BmsBookListExample example);

    int updateByExample(@Param("row") BmsBookList row, @Param("example") BmsBookListExample example);

    int updateByPrimaryKeySelective(BmsBookList row);

    int updateByPrimaryKey(BmsBookList row);
}