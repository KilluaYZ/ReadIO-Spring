package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.RoleUdtGrants;
import com.pool.readio.readiombg.model.RoleUdtGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUdtGrantsMapper {
    long countByExample(RoleUdtGrantsExample example);

    int deleteByExample(RoleUdtGrantsExample example);

    int insert(RoleUdtGrants row);

    int insertSelective(RoleUdtGrants row);

    List<RoleUdtGrants> selectByExample(RoleUdtGrantsExample example);

    int updateByExampleSelective(@Param("row") RoleUdtGrants row, @Param("example") RoleUdtGrantsExample example);

    int updateByExample(@Param("row") RoleUdtGrants row, @Param("example") RoleUdtGrantsExample example);
}