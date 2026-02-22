package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ColumnDomainUsage;
import com.pool.readio.readiombg.model.ColumnDomainUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnDomainUsageMapper {
    long countByExample(ColumnDomainUsageExample example);

    int deleteByExample(ColumnDomainUsageExample example);

    int insert(ColumnDomainUsage row);

    int insertSelective(ColumnDomainUsage row);

    List<ColumnDomainUsage> selectByExample(ColumnDomainUsageExample example);

    int updateByExampleSelective(@Param("row") ColumnDomainUsage row, @Param("example") ColumnDomainUsageExample example);

    int updateByExample(@Param("row") ColumnDomainUsage row, @Param("example") ColumnDomainUsageExample example);
}