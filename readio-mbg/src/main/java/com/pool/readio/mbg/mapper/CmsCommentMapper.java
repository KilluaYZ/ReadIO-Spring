package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CmsComment;
import com.pool.readio.mbg.model.CmsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCommentMapper {
    long countByExample(CmsCommentExample example);

    int deleteByExample(CmsCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsComment row);

    int insertSelective(CmsComment row);

    List<CmsComment> selectByExample(CmsCommentExample example);

    CmsComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsComment row, @Param("example") CmsCommentExample example);

    int updateByExample(@Param("row") CmsComment row, @Param("example") CmsCommentExample example);

    int updateByPrimaryKeySelective(CmsComment row);

    int updateByPrimaryKey(CmsComment row);
}