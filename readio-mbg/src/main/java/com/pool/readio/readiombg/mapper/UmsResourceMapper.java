package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UmsResource;
import com.pool.readio.readiombg.model.UmsResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsResourceMapper {
    long countByExample(UmsResourceExample example);

    int deleteByExample(UmsResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsResource row);

    int insertSelective(UmsResource row);

    List<UmsResource> selectByExample(UmsResourceExample example);

    UmsResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsResource row, @Param("example") UmsResourceExample example);

    int updateByExample(@Param("row") UmsResource row, @Param("example") UmsResourceExample example);

    int updateByPrimaryKeySelective(UmsResource row);

    int updateByPrimaryKey(UmsResource row);
}