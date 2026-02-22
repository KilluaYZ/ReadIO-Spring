package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.UmsMemberStatisticsInfo;
import com.pool.readio.readiombg.model.UmsMemberStatisticsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberStatisticsInfoMapper {
    long countByExample(UmsMemberStatisticsInfoExample example);

    int deleteByExample(UmsMemberStatisticsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsMemberStatisticsInfo row);

    int insertSelective(UmsMemberStatisticsInfo row);

    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    UmsMemberStatisticsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UmsMemberStatisticsInfo row, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByExample(@Param("row") UmsMemberStatisticsInfo row, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo row);

    int updateByPrimaryKey(UmsMemberStatisticsInfo row);
}