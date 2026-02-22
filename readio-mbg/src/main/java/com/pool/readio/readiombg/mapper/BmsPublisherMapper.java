package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsPublisher;
import com.pool.readio.readiombg.model.BmsPublisherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsPublisherMapper {
    long countByExample(BmsPublisherExample example);

    int deleteByExample(BmsPublisherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsPublisher row);

    int insertSelective(BmsPublisher row);

    List<BmsPublisher> selectByExample(BmsPublisherExample example);

    BmsPublisher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsPublisher row, @Param("example") BmsPublisherExample example);

    int updateByExample(@Param("row") BmsPublisher row, @Param("example") BmsPublisherExample example);

    int updateByPrimaryKeySelective(BmsPublisher row);

    int updateByPrimaryKey(BmsPublisher row);
}