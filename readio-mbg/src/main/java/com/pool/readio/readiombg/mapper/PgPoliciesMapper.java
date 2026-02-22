package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgPolicies;
import com.pool.readio.readiombg.model.PgPoliciesExample;
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