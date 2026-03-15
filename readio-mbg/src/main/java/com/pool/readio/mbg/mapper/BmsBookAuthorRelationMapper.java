package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookAuthorRelation;
import com.pool.readio.mbg.model.BmsBookAuthorRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookAuthorRelationMapper {
    long countByExample(BmsBookAuthorRelationExample example);

    int deleteByExample(BmsBookAuthorRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookAuthorRelation row);

    int insertSelective(BmsBookAuthorRelation row);

    List<BmsBookAuthorRelation> selectByExample(BmsBookAuthorRelationExample example);

    BmsBookAuthorRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookAuthorRelation row, @Param("example") BmsBookAuthorRelationExample example);

    int updateByExample(@Param("row") BmsBookAuthorRelation row, @Param("example") BmsBookAuthorRelationExample example);

    int updateByPrimaryKeySelective(BmsBookAuthorRelation row);

    int updateByPrimaryKey(BmsBookAuthorRelation row);
}