package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.CmsMemberPreferBookRelation;
import com.pool.readio.readiombg.model.CmsMemberPreferBookRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberPreferBookRelationMapper {
    long countByExample(CmsMemberPreferBookRelationExample example);

    int deleteByExample(CmsMemberPreferBookRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsMemberPreferBookRelation row);

    int insertSelective(CmsMemberPreferBookRelation row);

    List<CmsMemberPreferBookRelation> selectByExample(CmsMemberPreferBookRelationExample example);

    CmsMemberPreferBookRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsMemberPreferBookRelation row, @Param("example") CmsMemberPreferBookRelationExample example);

    int updateByExample(@Param("row") CmsMemberPreferBookRelation row, @Param("example") CmsMemberPreferBookRelationExample example);

    int updateByPrimaryKeySelective(CmsMemberPreferBookRelation row);

    int updateByPrimaryKey(CmsMemberPreferBookRelation row);
}