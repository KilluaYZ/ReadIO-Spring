package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UmsMemberBookCategoryRelation;
import com.pool.readio.readiombg.model.UmsMemberBookCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberBookCategoryRelationMapper {
    long countByExample(UmsMemberBookCategoryRelationExample example);

    int deleteByExample(UmsMemberBookCategoryRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberBookCategoryRelation row);

    int insertSelective(UmsMemberBookCategoryRelation row);

    List<UmsMemberBookCategoryRelation> selectByExample(UmsMemberBookCategoryRelationExample example);

    UmsMemberBookCategoryRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsMemberBookCategoryRelation row, @Param("example") UmsMemberBookCategoryRelationExample example);

    int updateByExample(@Param("row") UmsMemberBookCategoryRelation row, @Param("example") UmsMemberBookCategoryRelationExample example);

    int updateByPrimaryKeySelective(UmsMemberBookCategoryRelation row);

    int updateByPrimaryKey(UmsMemberBookCategoryRelation row);
}