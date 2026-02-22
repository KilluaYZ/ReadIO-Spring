package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgForeignDataWrappers;
import com.pool.readio.readiombg.model.PgForeignDataWrappersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgForeignDataWrappersMapper {
    long countByExample(PgForeignDataWrappersExample example);

    int deleteByExample(PgForeignDataWrappersExample example);

    int insert(PgForeignDataWrappers row);

    int insertSelective(PgForeignDataWrappers row);

    List<PgForeignDataWrappers> selectByExample(PgForeignDataWrappersExample example);

    int updateByExampleSelective(@Param("row") PgForeignDataWrappers row, @Param("example") PgForeignDataWrappersExample example);

    int updateByExample(@Param("row") PgForeignDataWrappers row, @Param("example") PgForeignDataWrappersExample example);
}