package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.SqlParts;
import com.pool.readio.mbg.model.SqlPartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlPartsMapper {
    long countByExample(SqlPartsExample example);

    int deleteByExample(SqlPartsExample example);

    int insert(SqlParts row);

    int insertSelective(SqlParts row);

    List<SqlParts> selectByExample(SqlPartsExample example);

    int updateByExampleSelective(@Param("row") SqlParts row, @Param("example") SqlPartsExample example);

    int updateByExample(@Param("row") SqlParts row, @Param("example") SqlPartsExample example);
}