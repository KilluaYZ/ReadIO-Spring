package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.UmsAdminPermissionRelation;
import com.pool.readio.mbg.model.UmsAdminPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminPermissionRelationMapper {
    long countByExample(UmsAdminPermissionRelationExample example);

    int deleteByExample(UmsAdminPermissionRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsAdminPermissionRelation row);

    int insertSelective(UmsAdminPermissionRelation row);

    List<UmsAdminPermissionRelation> selectByExample(UmsAdminPermissionRelationExample example);

    UmsAdminPermissionRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsAdminPermissionRelation row, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByExample(@Param("row") UmsAdminPermissionRelation row, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation row);

    int updateByPrimaryKey(UmsAdminPermissionRelation row);
}