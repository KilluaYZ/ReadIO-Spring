package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgPolicy;
import com.pool.readio.mbg.model.PgPolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPolicyMapper {
    long countByExample(PgPolicyExample example);

    int deleteByExample(PgPolicyExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgPolicy row);

    int insertSelective(PgPolicy row);

    List<PgPolicy> selectByExample(PgPolicyExample example);

    PgPolicy selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgPolicy row, @Param("example") PgPolicyExample example);

    int updateByExample(@Param("row") PgPolicy row, @Param("example") PgPolicyExample example);

    int updateByPrimaryKeySelective(PgPolicy row);

    int updateByPrimaryKey(PgPolicy row);
}