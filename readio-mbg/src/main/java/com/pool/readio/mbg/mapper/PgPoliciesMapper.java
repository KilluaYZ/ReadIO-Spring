package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgPolicies;
import com.pool.readio.mbg.model.PgPoliciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPoliciesMapper {
    long countByExample(PgPoliciesExample example);

    int deleteByExample(PgPoliciesExample example);

    int insert(PgPolicies row);

    int insertSelective(PgPolicies row);

    List<PgPolicies> selectByExample(PgPoliciesExample example);

    int updateByExampleSelective(@Param("row") PgPolicies row, @Param("example") PgPoliciesExample example);

    int updateByExample(@Param("row") PgPolicies row, @Param("example") PgPoliciesExample example);
}