package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.Tables;
import com.pool.readio.mbg.model.TablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesMapper {
    long countByExample(TablesExample example);

    int deleteByExample(TablesExample example);

    int insert(Tables row);

    int insertSelective(Tables row);

    List<Tables> selectByExample(TablesExample example);

    int updateByExampleSelective(@Param("row") Tables row, @Param("example") TablesExample example);

    int updateByExample(@Param("row") Tables row, @Param("example") TablesExample example);
}