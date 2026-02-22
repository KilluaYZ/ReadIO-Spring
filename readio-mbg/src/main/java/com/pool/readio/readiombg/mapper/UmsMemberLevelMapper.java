package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UmsMemberLevel;
import com.pool.readio.readiombg.model.UmsMemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLevelMapper {
    long countByExample(UmsMemberLevelExample example);

    int deleteByExample(UmsMemberLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberLevel row);

    int insertSelective(UmsMemberLevel row);

    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    UmsMemberLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsMemberLevel row, @Param("example") UmsMemberLevelExample example);

    int updateByExample(@Param("row") UmsMemberLevel row, @Param("example") UmsMemberLevelExample example);

    int updateByPrimaryKeySelective(UmsMemberLevel row);

    int updateByPrimaryKey(UmsMemberLevel row);
}