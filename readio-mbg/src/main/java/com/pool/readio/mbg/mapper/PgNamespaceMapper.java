package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgNamespace;
import com.pool.readio.mbg.model.PgNamespaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgNamespaceMapper {
    long countByExample(PgNamespaceExample example);

    int deleteByExample(PgNamespaceExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgNamespace row);

    int insertSelective(PgNamespace row);

    List<PgNamespace> selectByExample(PgNamespaceExample example);

    PgNamespace selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgNamespace row, @Param("example") PgNamespaceExample example);

    int updateByExample(@Param("row") PgNamespace row, @Param("example") PgNamespaceExample example);

    int updateByPrimaryKeySelective(PgNamespace row);

    int updateByPrimaryKey(PgNamespace row);
}