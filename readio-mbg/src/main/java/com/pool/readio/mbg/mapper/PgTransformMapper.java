package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgTransform;
import com.pool.readio.mbg.model.PgTransformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgTransformMapper {
    long countByExample(PgTransformExample example);

    int deleteByExample(PgTransformExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgTransform row);

    int insertSelective(PgTransform row);

    List<PgTransform> selectByExample(PgTransformExample example);

    PgTransform selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgTransform row, @Param("example") PgTransformExample example);

    int updateByExample(@Param("row") PgTransform row, @Param("example") PgTransformExample example);

    int updateByPrimaryKeySelective(PgTransform row);

    int updateByPrimaryKey(PgTransform row);
}