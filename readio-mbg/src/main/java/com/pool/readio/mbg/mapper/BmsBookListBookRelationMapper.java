package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookListBookRelation;
import com.pool.readio.mbg.model.BmsBookListBookRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookListBookRelationMapper {
    long countByExample(BmsBookListBookRelationExample example);

    int deleteByExample(BmsBookListBookRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookListBookRelation row);

    int insertSelective(BmsBookListBookRelation row);

    List<BmsBookListBookRelation> selectByExample(BmsBookListBookRelationExample example);

    BmsBookListBookRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookListBookRelation row, @Param("example") BmsBookListBookRelationExample example);

    int updateByExample(@Param("row") BmsBookListBookRelation row, @Param("example") BmsBookListBookRelationExample example);

    int updateByPrimaryKeySelective(BmsBookListBookRelation row);

    int updateByPrimaryKey(BmsBookListBookRelation row);
}