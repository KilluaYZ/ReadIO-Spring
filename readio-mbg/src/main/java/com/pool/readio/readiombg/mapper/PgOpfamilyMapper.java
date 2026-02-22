package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgOpfamily;
import com.pool.readio.readiombg.model.PgOpfamilyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgOpfamilyMapper {
    long countByExample(PgOpfamilyExample example);

    int deleteByExample(PgOpfamilyExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgOpfamily row);

    int insertSelective(PgOpfamily row);

    List<PgOpfamily> selectByExample(PgOpfamilyExample example);

    PgOpfamily selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgOpfamily row, @Param("example") PgOpfamilyExample example);

    int updateByExample(@Param("row") PgOpfamily row, @Param("example") PgOpfamilyExample example);

    int updateByPrimaryKeySelective(PgOpfamily row);

    int updateByPrimaryKey(PgOpfamily row);
}