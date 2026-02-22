package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgStatProgressCopy;
import com.pool.readio.readiombg.model.PgStatProgressCopyExample;
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