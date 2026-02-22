package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.Triggers;
import com.pool.readio.readiombg.model.TriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggersMapper {
    long countByExample(TriggersExample example);

    int deleteByExample(TriggersExample example);

    int insert(Triggers row);

    int insertSelective(Triggers row);

    List<Triggers> selectByExample(TriggersExample example);

    int updateByExampleSelective(@Param("row") Triggers row, @Param("example") TriggersExample example);

    int updateByExample(@Param("row") Triggers row, @Param("example") TriggersExample example);
}