package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgLargeobject;
import com.pool.readio.readiombg.model.PgLargeobjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgLargeobjectMapper {
    long countByExample(PgLargeobjectExample example);

    int deleteByExample(PgLargeobjectExample example);

    int deleteByPrimaryKey(@Param("loid") Long loid, @Param("pageno") Integer pageno);

    int insert(PgLargeobject row);

    int insertSelective(PgLargeobject row);

    List<PgLargeobject> selectByExampleWithBLOBs(PgLargeobjectExample example);

    List<PgLargeobject> selectByExample(PgLargeobjectExample example);

    PgLargeobject selectByPrimaryKey(@Param("loid") Long loid, @Param("pageno") Integer pageno);

    int updateByExampleSelective(@Param("row") PgLargeobject row, @Param("example") PgLargeobjectExample example);

    int updateByExampleWithBLOBs(@Param("row") PgLargeobject row, @Param("example") PgLargeobjectExample example);

    int updateByExample(@Param("row") PgLargeobject row, @Param("example") PgLargeobjectExample example);

    int updateByPrimaryKeySelective(PgLargeobject row);

    int updateByPrimaryKeyWithBLOBs(PgLargeobject row);
}