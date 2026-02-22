package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatArchiver;
import com.pool.readio.mbg.model.PgStatArchiverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatArchiverMapper {
    long countByExample(PgStatArchiverExample example);

    int deleteByExample(PgStatArchiverExample example);

    int insert(PgStatArchiver row);

    int insertSelective(PgStatArchiver row);

    List<PgStatArchiver> selectByExample(PgStatArchiverExample example);

    int updateByExampleSelective(@Param("row") PgStatArchiver row, @Param("example") PgStatArchiverExample example);

    int updateByExample(@Param("row") PgStatArchiver row, @Param("example") PgStatArchiverExample example);
}