package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsAuthor;
import com.pool.readio.readiombg.model.BmsAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsAuthorMapper {
    long countByExample(BmsAuthorExample example);

    int deleteByExample(BmsAuthorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsAuthor row);

    int insertSelective(BmsAuthor row);

    List<BmsAuthor> selectByExample(BmsAuthorExample example);

    BmsAuthor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsAuthor row, @Param("example") BmsAuthorExample example);

    int updateByExample(@Param("row") BmsAuthor row, @Param("example") BmsAuthorExample example);

    int updateByPrimaryKeySelective(BmsAuthor row);

    int updateByPrimaryKey(BmsAuthor row);
}