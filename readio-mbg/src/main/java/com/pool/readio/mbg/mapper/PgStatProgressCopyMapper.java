package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatProgressCopy;
import com.pool.readio.mbg.model.PgStatProgressCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatProgressCopyMapper {
    long countByExample(PgStatProgressCopyExample example);

    int deleteByExample(PgStatProgressCopyExample example);

    int insert(PgStatProgressCopy row);

    int insertSelective(PgStatProgressCopy row);

    List<PgStatProgressCopy> selectByExample(PgStatProgressCopyExample example);

    int updateByExampleSelective(@Param("row") PgStatProgressCopy row, @Param("example") PgStatProgressCopyExample example);

    int updateByExample(@Param("row") PgStatProgressCopy row, @Param("example") PgStatProgressCopyExample example);
}