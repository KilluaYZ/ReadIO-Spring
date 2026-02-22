package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.TablePrivileges;
import com.pool.readio.mbg.model.TablePrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablePrivilegesMapper {
    long countByExample(TablePrivilegesExample example);

    int deleteByExample(TablePrivilegesExample example);

    int insert(TablePrivileges row);

    int insertSelective(TablePrivileges row);

    List<TablePrivileges> selectByExample(TablePrivilegesExample example);

    int updateByExampleSelective(@Param("row") TablePrivileges row, @Param("example") TablePrivilegesExample example);

    int updateByExample(@Param("row") TablePrivileges row, @Param("example") TablePrivilegesExample example);
}