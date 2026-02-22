package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTablespace;
import com.pool.readio.mbg.model.PgTablespaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTablespaceMapper {
    long countByExample(PgTablespaceExample example);

    int deleteByExample(PgTablespaceExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgTablespace row);

    int insertSelective(PgTablespace row);

    List<PgTablespace> selectByExample(PgTablespaceExample example);

    PgTablespace selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgTablespace row, @Param("example") PgTablespaceExample example);

    int updateByExample(@Param("row") PgTablespace row, @Param("example") PgTablespaceExample example);

    int updateByPrimaryKeySelective(PgTablespace row);

    int updateByPrimaryKey(PgTablespace row);
}