package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.UmsMemberVipRelation;
import com.pool.readio.mbg.model.UmsMemberVipRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberVipRelationMapper {
    long countByExample(UmsMemberVipRelationExample example);

    int deleteByExample(UmsMemberVipRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberVipRelation row);

    int insertSelective(UmsMemberVipRelation row);

    List<UmsMemberVipRelation> selectByExample(UmsMemberVipRelationExample example);

    UmsMemberVipRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsMemberVipRelation row, @Param("example") UmsMemberVipRelationExample example);

    int updateByExample(@Param("row") UmsMemberVipRelation row, @Param("example") UmsMemberVipRelationExample example);

    int updateByPrimaryKeySelective(UmsMemberVipRelation row);

    int updateByPrimaryKey(UmsMemberVipRelation row);
}