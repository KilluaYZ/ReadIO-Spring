package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgIndex;
import com.pool.readio.mbg.model.PgIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgIndexMapper {
    long countByExample(PgIndexExample example);

    int deleteByExample(PgIndexExample example);

    int deleteByPrimaryKey(Long indexrelid);

    int insert(PgIndex row);

    int insertSelective(PgIndex row);

    List<PgIndex> selectByExample(PgIndexExample example);

    PgIndex selectByPrimaryKey(Long indexrelid);

    int updateByExampleSelective(@Param("row") PgIndex row, @Param("example") PgIndexExample example);

    int updateByExample(@Param("row") PgIndex row, @Param("example") PgIndexExample example);

    int updateByPrimaryKeySelective(PgIndex row);

    int updateByPrimaryKey(PgIndex row);
}