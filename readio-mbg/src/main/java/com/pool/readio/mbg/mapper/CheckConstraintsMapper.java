package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.CheckConstraints;
import com.pool.readio.mbg.model.CheckConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckConstraintsMapper {
    long countByExample(CheckConstraintsExample example);

    int deleteByExample(CheckConstraintsExample example);

    int insert(CheckConstraints row);

    int insertSelective(CheckConstraints row);

    List<CheckConstraints> selectByExample(CheckConstraintsExample example);

    int updateByExampleSelective(@Param("row") CheckConstraints row, @Param("example") CheckConstraintsExample example);

    int updateByExample(@Param("row") CheckConstraints row, @Param("example") CheckConstraintsExample example);
}