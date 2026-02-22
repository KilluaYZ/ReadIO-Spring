package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.DataTypePrivileges;
import com.pool.readio.readiombg.model.DataTypePrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataTypePrivilegesMapper {
    long countByExample(DataTypePrivilegesExample example);

    int deleteByExample(DataTypePrivilegesExample example);

    int insert(DataTypePrivileges row);

    int insertSelective(DataTypePrivileges row);

    List<DataTypePrivileges> selectByExample(DataTypePrivilegesExample example);

    int updateByExampleSelective(@Param("row") DataTypePrivileges row, @Param("example") DataTypePrivilegesExample example);

    int updateByExample(@Param("row") DataTypePrivileges row, @Param("example") DataTypePrivilegesExample example);
}