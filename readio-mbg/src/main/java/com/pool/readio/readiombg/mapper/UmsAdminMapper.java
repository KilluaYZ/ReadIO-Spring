package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UmsAdmin;
import com.pool.readio.readiombg.model.UmsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminMapper {
    long countByExample(UmsAdminExample example);

    int deleteByExample(UmsAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsAdmin row);

    int insertSelective(UmsAdmin row);

    List<UmsAdmin> selectByExample(UmsAdminExample example);

    UmsAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsAdmin row, @Param("example") UmsAdminExample example);

    int updateByExample(@Param("row") UmsAdmin row, @Param("example") UmsAdminExample example);

    int updateByPrimaryKeySelective(UmsAdmin row);

    int updateByPrimaryKey(UmsAdmin row);
}