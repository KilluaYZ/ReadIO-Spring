package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsBookChapter;
import com.pool.readio.readiombg.model.BmsBookChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookChapterMapper {
    long countByExample(BmsBookChapterExample example);

    int deleteByExample(BmsBookChapterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookChapter row);

    int insertSelective(BmsBookChapter row);

    List<BmsBookChapter> selectByExample(BmsBookChapterExample example);

    BmsBookChapter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookChapter row, @Param("example") BmsBookChapterExample example);

    int updateByExample(@Param("row") BmsBookChapter row, @Param("example") BmsBookChapterExample example);

    int updateByPrimaryKeySelective(BmsBookChapter row);

    int updateByPrimaryKey(BmsBookChapter row);
}