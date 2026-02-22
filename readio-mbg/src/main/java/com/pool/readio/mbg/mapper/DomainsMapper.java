package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.Domains;
import com.pool.readio.mbg.model.DomainsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainsMapper {
    long countByExample(DomainsExample example);

    int deleteByExample(DomainsExample example);

    int insert(Domains row);

    int insertSelective(Domains row);

    List<Domains> selectByExample(DomainsExample example);

    int updateByExampleSelective(@Param("row") Domains row, @Param("example") DomainsExample example);

    int updateByExample(@Param("row") Domains row, @Param("example") DomainsExample example);
}