package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgDepend;
import com.pool.readio.readiombg.model.PgDependExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgDependMapper {
    long countByExample(PgDependExample example);

    int deleteByExample(PgDependExample example);

    int insert(PgDepend row);

    int insertSelective(PgDepend row);

    List<PgDepend> selectByExample(PgDependExample example);

    int updateByExampleSelective(@Param("row") PgDepend row, @Param("example") PgDependExample example);

    int updateByExample(@Param("row") PgDepend row, @Param("example") PgDependExample example);
}