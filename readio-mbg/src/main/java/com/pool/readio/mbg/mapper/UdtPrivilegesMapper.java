package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.UdtPrivileges;
import com.pool.readio.mbg.model.UdtPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UdtPrivilegesMapper {
    long countByExample(UdtPrivilegesExample example);

    int deleteByExample(UdtPrivilegesExample example);

    int insert(UdtPrivileges row);

    int insertSelective(UdtPrivileges row);

    List<UdtPrivileges> selectByExample(UdtPrivilegesExample example);

    int updateByExampleSelective(@Param("row") UdtPrivileges row, @Param("example") UdtPrivilegesExample example);

    int updateByExample(@Param("row") UdtPrivileges row, @Param("example") UdtPrivilegesExample example);
}