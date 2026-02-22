package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgRules;
import com.pool.readio.readiombg.model.PgRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgRulesMapper {
    long countByExample(PgRulesExample example);

    int deleteByExample(PgRulesExample example);

    int insert(PgRules row);

    int insertSelective(PgRules row);

    List<PgRules> selectByExample(PgRulesExample example);

    int updateByExampleSelective(@Param("row") PgRules row, @Param("example") PgRulesExample example);

    int updateByExample(@Param("row") PgRules row, @Param("example") PgRulesExample example);
}