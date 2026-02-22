package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CmsMemberPreferPostRelation;
import com.pool.readio.mbg.model.CmsMemberPreferPostRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberPreferPostRelationMapper {
    long countByExample(CmsMemberPreferPostRelationExample example);

    int deleteByExample(CmsMemberPreferPostRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsMemberPreferPostRelation row);

    int insertSelective(CmsMemberPreferPostRelation row);

    List<CmsMemberPreferPostRelation> selectByExample(CmsMemberPreferPostRelationExample example);

    CmsMemberPreferPostRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsMemberPreferPostRelation row, @Param("example") CmsMemberPreferPostRelationExample example);

    int updateByExample(@Param("row") CmsMemberPreferPostRelation row, @Param("example") CmsMemberPreferPostRelationExample example);

    int updateByPrimaryKeySelective(CmsMemberPreferPostRelation row);

    int updateByPrimaryKey(CmsMemberPreferPostRelation row);
}