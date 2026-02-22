package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ColumnPrivileges;
import com.pool.readio.readiombg.model.ColumnPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnPrivilegesMapper {
    long countByExample(ColumnPrivilegesExample example);

    int deleteByExample(ColumnPrivilegesExample example);

    int insert(ColumnPrivileges row);

    int insertSelective(ColumnPrivileges row);

    List<ColumnPrivileges> selectByExample(ColumnPrivilegesExample example);

    int updateByExampleSelective(@Param("row") ColumnPrivileges row, @Param("example") ColumnPrivilegesExample example);

    int updateByExample(@Param("row") ColumnPrivileges row, @Param("example") ColumnPrivilegesExample example);
}