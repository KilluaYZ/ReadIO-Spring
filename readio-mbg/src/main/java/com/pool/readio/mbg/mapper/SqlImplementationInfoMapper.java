package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.SqlImplementationInfo;
import com.pool.readio.mbg.model.SqlImplementationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlImplementationInfoMapper {
    long countByExample(SqlImplementationInfoExample example);

    int deleteByExample(SqlImplementationInfoExample example);

    int insert(SqlImplementationInfo row);

    int insertSelective(SqlImplementationInfo row);

    List<SqlImplementationInfo> selectByExample(SqlImplementationInfoExample example);

    int updateByExampleSelective(@Param("row") SqlImplementationInfo row, @Param("example") SqlImplementationInfoExample example);

    int updateByExample(@Param("row") SqlImplementationInfo row, @Param("example") SqlImplementationInfoExample example);
}