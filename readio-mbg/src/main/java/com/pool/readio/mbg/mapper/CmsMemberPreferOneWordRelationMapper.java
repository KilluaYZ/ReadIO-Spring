package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CmsMemberPreferOneWordRelation;
import com.pool.readio.mbg.model.CmsMemberPreferOneWordRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMemberPreferOneWordRelationMapper {
    long countByExample(CmsMemberPreferOneWordRelationExample example);

    int deleteByExample(CmsMemberPreferOneWordRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsMemberPreferOneWordRelation row);

    int insertSelective(CmsMemberPreferOneWordRelation row);

    List<CmsMemberPreferOneWordRelation> selectByExample(CmsMemberPreferOneWordRelationExample example);

    CmsMemberPreferOneWordRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsMemberPreferOneWordRelation row, @Param("example") CmsMemberPreferOneWordRelationExample example);

    int updateByExample(@Param("row") CmsMemberPreferOneWordRelation row, @Param("example") CmsMemberPreferOneWordRelationExample example);

    int updateByPrimaryKeySelective(CmsMemberPreferOneWordRelation row);

    int updateByPrimaryKey(CmsMemberPreferOneWordRelation row);
}