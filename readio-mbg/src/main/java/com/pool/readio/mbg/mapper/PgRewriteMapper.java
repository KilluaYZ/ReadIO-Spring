package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgRewrite;
import com.pool.readio.mbg.model.PgRewriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgRewriteMapper {
    long countByExample(PgRewriteExample example);

    int deleteByExample(PgRewriteExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgRewrite row);

    int insertSelective(PgRewrite row);

    List<PgRewrite> selectByExample(PgRewriteExample example);

    PgRewrite selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgRewrite row, @Param("example") PgRewriteExample example);

    int updateByExample(@Param("row") PgRewrite row, @Param("example") PgRewriteExample example);

    int updateByPrimaryKeySelective(PgRewrite row);

    int updateByPrimaryKey(PgRewrite row);
}