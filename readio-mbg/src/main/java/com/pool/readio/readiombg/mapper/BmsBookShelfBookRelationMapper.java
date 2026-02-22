package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsBookShelfBookRelation;
import com.pool.readio.readiombg.model.BmsBookShelfBookRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookShelfBookRelationMapper {
    long countByExample(BmsBookShelfBookRelationExample example);

    int deleteByExample(BmsBookShelfBookRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookShelfBookRelation row);

    int insertSelective(BmsBookShelfBookRelation row);

    List<BmsBookShelfBookRelation> selectByExample(BmsBookShelfBookRelationExample example);

    BmsBookShelfBookRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookShelfBookRelation row, @Param("example") BmsBookShelfBookRelationExample example);

    int updateByExample(@Param("row") BmsBookShelfBookRelation row, @Param("example") BmsBookShelfBookRelationExample example);

    int updateByPrimaryKeySelective(BmsBookShelfBookRelation row);

    int updateByPrimaryKey(BmsBookShelfBookRelation row);
}