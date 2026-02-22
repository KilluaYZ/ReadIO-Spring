package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.UmsMemberFollowRelation;
import com.pool.readio.mbg.model.UmsMemberFollowRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberFollowRelationMapper {
    long countByExample(UmsMemberFollowRelationExample example);

    int deleteByExample(UmsMemberFollowRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberFollowRelation row);

    int insertSelective(UmsMemberFollowRelation row);

    List<UmsMemberFollowRelation> selectByExample(UmsMemberFollowRelationExample example);

    UmsMemberFollowRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsMemberFollowRelation row, @Param("example") UmsMemberFollowRelationExample example);

    int updateByExample(@Param("row") UmsMemberFollowRelation row, @Param("example") UmsMemberFollowRelationExample example);

    int updateByPrimaryKeySelective(UmsMemberFollowRelation row);

    int updateByPrimaryKey(UmsMemberFollowRelation row);
}