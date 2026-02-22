package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.CmsPost;
import com.pool.readio.readiombg.model.CmsPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPostMapper {
    long countByExample(CmsPostExample example);

    int deleteByExample(CmsPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsPost row);

    int insertSelective(CmsPost row);

    List<CmsPost> selectByExample(CmsPostExample example);

    CmsPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsPost row, @Param("example") CmsPostExample example);

    int updateByExample(@Param("row") CmsPost row, @Param("example") CmsPostExample example);

    int updateByPrimaryKeySelective(CmsPost row);

    int updateByPrimaryKey(CmsPost row);
}