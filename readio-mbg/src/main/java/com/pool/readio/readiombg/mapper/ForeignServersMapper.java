package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ForeignServers;
import com.pool.readio.readiombg.model.ForeignServersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignServersMapper {
    long countByExample(ForeignServersExample example);

    int deleteByExample(ForeignServersExample example);

    int insert(ForeignServers row);

    int insertSelective(ForeignServers row);

    List<ForeignServers> selectByExample(ForeignServersExample example);

    int updateByExampleSelective(@Param("row") ForeignServers row, @Param("example") ForeignServersExample example);

    int updateByExample(@Param("row") ForeignServers row, @Param("example") ForeignServersExample example);
}