package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.ApplicableRoles;
import com.pool.readio.mbg.model.ApplicableRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicableRolesMapper {
    long countByExample(ApplicableRolesExample example);

    int deleteByExample(ApplicableRolesExample example);

    int insert(ApplicableRoles row);

    int insertSelective(ApplicableRoles row);

    List<ApplicableRoles> selectByExample(ApplicableRolesExample example);

    int updateByExampleSelective(@Param("row") ApplicableRoles row, @Param("example") ApplicableRolesExample example);

    int updateByExample(@Param("row") ApplicableRoles row, @Param("example") ApplicableRolesExample example);
}