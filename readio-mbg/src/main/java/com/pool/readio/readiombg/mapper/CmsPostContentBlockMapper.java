package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.CmsPostContentBlock;
import com.pool.readio.readiombg.model.CmsPostContentBlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPostContentBlockMapper {
    long countByExample(CmsPostContentBlockExample example);

    int deleteByExample(CmsPostContentBlockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsPostContentBlock row);

    int insertSelective(CmsPostContentBlock row);

    List<CmsPostContentBlock> selectByExample(CmsPostContentBlockExample example);

    CmsPostContentBlock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsPostContentBlock row, @Param("example") CmsPostContentBlockExample example);

    int updateByExample(@Param("row") CmsPostContentBlock row, @Param("example") CmsPostContentBlockExample example);

    int updateByPrimaryKeySelective(CmsPostContentBlock row);

    int updateByPrimaryKey(CmsPostContentBlock row);
}