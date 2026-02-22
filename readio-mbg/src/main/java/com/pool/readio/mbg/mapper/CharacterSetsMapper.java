package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CharacterSets;
import com.pool.readio.mbg.model.CharacterSetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharacterSetsMapper {
    long countByExample(CharacterSetsExample example);

    int deleteByExample(CharacterSetsExample example);

    int insert(CharacterSets row);

    int insertSelective(CharacterSets row);

    List<CharacterSets> selectByExample(CharacterSetsExample example);

    int updateByExampleSelective(@Param("row") CharacterSets row, @Param("example") CharacterSetsExample example);

    int updateByExample(@Param("row") CharacterSets row, @Param("example") CharacterSetsExample example);
}