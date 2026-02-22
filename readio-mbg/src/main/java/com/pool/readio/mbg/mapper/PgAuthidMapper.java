package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgAuthid;
import com.pool.readio.mbg.model.PgAuthidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAuthidMapper {
    long countByExample(PgAuthidExample example);

    int deleteByExample(PgAuthidExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgAuthid row);

    int insertSelective(PgAuthid row);

    List<PgAuthid> selectByExample(PgAuthidExample example);

    PgAuthid selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgAuthid row, @Param("example") PgAuthidExample example);

    int updateByExample(@Param("row") PgAuthid row, @Param("example") PgAuthidExample example);

    int updateByPrimaryKeySelective(PgAuthid row);

    int updateByPrimaryKey(PgAuthid row);
}