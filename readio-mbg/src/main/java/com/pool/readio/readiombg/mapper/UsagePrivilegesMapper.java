package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UsagePrivileges;
import com.pool.readio.readiombg.model.UsagePrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsagePrivilegesMapper {
    long countByExample(UsagePrivilegesExample example);

    int deleteByExample(UsagePrivilegesExample example);

    int insert(UsagePrivileges row);

    int insertSelective(UsagePrivileges row);

    List<UsagePrivileges> selectByExample(UsagePrivilegesExample example);

    int updateByExampleSelective(@Param("row") UsagePrivileges row, @Param("example") UsagePrivilegesExample example);

    int updateByExample(@Param("row") UsagePrivileges row, @Param("example") UsagePrivilegesExample example);
}