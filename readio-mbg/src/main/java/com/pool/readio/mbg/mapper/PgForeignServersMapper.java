package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgForeignServers;
import com.pool.readio.mbg.model.PgForeignServersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgForeignServersMapper {
    long countByExample(PgForeignServersExample example);

    int deleteByExample(PgForeignServersExample example);

    int insert(PgForeignServers row);

    int insertSelective(PgForeignServers row);

    List<PgForeignServers> selectByExample(PgForeignServersExample example);

    int updateByExampleSelective(@Param("row") PgForeignServers row, @Param("example") PgForeignServersExample example);

    int updateByExample(@Param("row") PgForeignServers row, @Param("example") PgForeignServersExample example);
}