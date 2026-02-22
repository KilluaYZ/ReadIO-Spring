package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.CmsMemberPreferCommentRelation;
import com.pool.readio.readiombg.model.CmsMemberPreferCommentRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberPreferCommentRelationMapper {
    long countByExample(CmsMemberPreferCommentRelationExample example);

    int deleteByExample(CmsMemberPreferCommentRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsMemberPreferCommentRelation row);

    int insertSelective(CmsMemberPreferCommentRelation row);

    List<CmsMemberPreferCommentRelation> selectByExample(CmsMemberPreferCommentRelationExample example);

    CmsMemberPreferCommentRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsMemberPreferCommentRelation row, @Param("example") CmsMemberPreferCommentRelationExample example);

    int updateByExample(@Param("row") CmsMemberPreferCommentRelation row, @Param("example") CmsMemberPreferCommentRelationExample example);

    int updateByPrimaryKeySelective(CmsMemberPreferCommentRelation row);

    int updateByPrimaryKey(CmsMemberPreferCommentRelation row);
}