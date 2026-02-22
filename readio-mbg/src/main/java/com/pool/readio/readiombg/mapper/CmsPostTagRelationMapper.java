package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.CmsPostTagRelation;
import com.pool.readio.readiombg.model.CmsPostTagRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPostTagRelationMapper {
    long countByExample(CmsPostTagRelationExample example);

    int deleteByExample(CmsPostTagRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsPostTagRelation row);

    int insertSelective(CmsPostTagRelation row);

    List<CmsPostTagRelation> selectByExample(CmsPostTagRelationExample example);

    CmsPostTagRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsPostTagRelation row, @Param("example") CmsPostTagRelationExample example);

    int updateByExample(@Param("row") CmsPostTagRelation row, @Param("example") CmsPostTagRelationExample example);

    int updateByPrimaryKeySelective(CmsPostTagRelation row);

    int updateByPrimaryKey(CmsPostTagRelation row);
}