package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UmsMemberOwnBookRelation;
import com.pool.readio.readiombg.model.UmsMemberOwnBookRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberOwnBookRelationMapper {
    long countByExample(UmsMemberOwnBookRelationExample example);

    int deleteByExample(UmsMemberOwnBookRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberOwnBookRelation row);

    int insertSelective(UmsMemberOwnBookRelation row);

    List<UmsMemberOwnBookRelation> selectByExample(UmsMemberOwnBookRelationExample example);

    UmsMemberOwnBookRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsMemberOwnBookRelation row, @Param("example") UmsMemberOwnBookRelationExample example);

    int updateByExample(@Param("row") UmsMemberOwnBookRelation row, @Param("example") UmsMemberOwnBookRelationExample example);

    int updateByPrimaryKeySelective(UmsMemberOwnBookRelation row);

    int updateByPrimaryKey(UmsMemberOwnBookRelation row);
}