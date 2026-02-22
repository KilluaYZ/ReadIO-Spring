package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CollationCharacterSetApplicability;
import com.pool.readio.mbg.model.CollationCharacterSetApplicabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationCharacterSetApplicabilityMapper {
    long countByExample(CollationCharacterSetApplicabilityExample example);

    int deleteByExample(CollationCharacterSetApplicabilityExample example);

    int insert(CollationCharacterSetApplicability row);

    int insertSelective(CollationCharacterSetApplicability row);

    List<CollationCharacterSetApplicability> selectByExample(CollationCharacterSetApplicabilityExample example);

    int updateByExampleSelective(@Param("row") CollationCharacterSetApplicability row, @Param("example") CollationCharacterSetApplicabilityExample example);

    int updateByExample(@Param("row") CollationCharacterSetApplicability row, @Param("example") CollationCharacterSetApplicabilityExample example);
}