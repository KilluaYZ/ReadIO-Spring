package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.DomainConstraints;
import com.pool.readio.mbg.model.DomainConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomainConstraintsMapper {
    long countByExample(DomainConstraintsExample example);

    int deleteByExample(DomainConstraintsExample example);

    int insert(DomainConstraints row);

    int insertSelective(DomainConstraints row);

    List<DomainConstraints> selectByExample(DomainConstraintsExample example);

    int updateByExampleSelective(@Param("row") DomainConstraints row, @Param("example") DomainConstraintsExample example);

    int updateByExample(@Param("row") DomainConstraints row, @Param("example") DomainConstraintsExample example);
}