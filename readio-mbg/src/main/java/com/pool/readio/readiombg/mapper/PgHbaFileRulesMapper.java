package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgHbaFileRules;
import com.pool.readio.readiombg.model.PgHbaFileRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgHbaFileRulesMapper {
    long countByExample(PgHbaFileRulesExample example);

    int deleteByExample(PgHbaFileRulesExample example);

    int insert(PgHbaFileRules row);

    int insertSelective(PgHbaFileRules row);

    List<PgHbaFileRules> selectByExample(PgHbaFileRulesExample example);

    int updateByExampleSelective(@Param("row") PgHbaFileRules row, @Param("example") PgHbaFileRulesExample example);

    int updateByExample(@Param("row") PgHbaFileRules row, @Param("example") PgHbaFileRulesExample example);
}