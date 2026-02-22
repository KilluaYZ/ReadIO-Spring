package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsBookReadProgress;
import com.pool.readio.readiombg.model.BmsBookReadProgressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookReadProgressMapper {
    long countByExample(BmsBookReadProgressExample example);

    int deleteByExample(BmsBookReadProgressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookReadProgress row);

    int insertSelective(BmsBookReadProgress row);

    List<BmsBookReadProgress> selectByExample(BmsBookReadProgressExample example);

    BmsBookReadProgress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookReadProgress row, @Param("example") BmsBookReadProgressExample example);

    int updateByExample(@Param("row") BmsBookReadProgress row, @Param("example") BmsBookReadProgressExample example);

    int updateByPrimaryKeySelective(BmsBookReadProgress row);

    int updateByPrimaryKey(BmsBookReadProgress row);
}