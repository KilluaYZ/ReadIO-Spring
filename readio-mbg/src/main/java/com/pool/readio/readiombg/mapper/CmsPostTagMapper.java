package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.CmsPostTag;
import com.pool.readio.readiombg.model.CmsPostTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPostTagMapper {
    long countByExample(CmsPostTagExample example);

    int deleteByExample(CmsPostTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsPostTag row);

    int insertSelective(CmsPostTag row);

    List<CmsPostTag> selectByExample(CmsPostTagExample example);

    CmsPostTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CmsPostTag row, @Param("example") CmsPostTagExample example);

    int updateByExample(@Param("row") CmsPostTag row, @Param("example") CmsPostTagExample example);

    int updateByPrimaryKeySelective(CmsPostTag row);

    int updateByPrimaryKey(CmsPostTag row);
}