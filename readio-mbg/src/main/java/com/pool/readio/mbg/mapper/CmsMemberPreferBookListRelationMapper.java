package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CmsMemberPreferBookListRelation;
import com.pool.readio.mbg.model.CmsMemberPreferBookListRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberPreferBookListRelationMapper {
    long countByExample(CmsMemberPreferBookListRelationExample example);

    int deleteByExample(CmsMemberPreferBookListRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsMemberPreferBookListRelation row);

    int insertSelective(CmsMemberPreferBookListRelation row);

    List<CmsMemberPreferBookListRelation> selectByExample(CmsMemberPreferBookListRelationExample example);

    CmsMemberPreferBookListRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsMemberPreferBookListRelation row, @Param("example") CmsMemberPreferBookListRelationExample example);

    int updateByExample(@Param("row") CmsMemberPreferBookListRelation row, @Param("example") CmsMemberPreferBookListRelationExample example);

    int updateByPrimaryKeySelective(CmsMemberPreferBookListRelation row);

    int updateByPrimaryKey(CmsMemberPreferBookListRelation row);
}