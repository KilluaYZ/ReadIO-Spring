package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.DomainUdtUsage;
import com.pool.readio.mbg.model.DomainUdtUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainUdtUsageMapper {
    long countByExample(DomainUdtUsageExample example);

    int deleteByExample(DomainUdtUsageExample example);

    int insert(DomainUdtUsage row);

    int insertSelective(DomainUdtUsage row);

    List<DomainUdtUsage> selectByExample(DomainUdtUsageExample example);

    int updateByExampleSelective(@Param("row") DomainUdtUsage row, @Param("example") DomainUdtUsageExample example);

    int updateByExample(@Param("row") DomainUdtUsage row, @Param("example") DomainUdtUsageExample example);
}