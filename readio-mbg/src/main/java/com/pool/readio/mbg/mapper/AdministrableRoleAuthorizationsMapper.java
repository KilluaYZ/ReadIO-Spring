package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.AdministrableRoleAuthorizations;
import com.pool.readio.mbg.model.AdministrableRoleAuthorizationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministrableRoleAuthorizationsMapper {
    long countByExample(AdministrableRoleAuthorizationsExample example);

    int deleteByExample(AdministrableRoleAuthorizationsExample example);

    int insert(AdministrableRoleAuthorizations row);

    int insertSelective(AdministrableRoleAuthorizations row);

    List<AdministrableRoleAuthorizations> selectByExample(AdministrableRoleAuthorizationsExample example);

    int updateByExampleSelective(@Param("row") AdministrableRoleAuthorizations row, @Param("example") AdministrableRoleAuthorizationsExample example);

    int updateByExample(@Param("row") AdministrableRoleAuthorizations row, @Param("example") AdministrableRoleAuthorizationsExample example);
}