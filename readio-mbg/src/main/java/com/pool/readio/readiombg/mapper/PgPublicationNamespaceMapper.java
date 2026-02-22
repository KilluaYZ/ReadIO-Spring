package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgPublicationNamespace;
import com.pool.readio.readiombg.model.PgPublicationNamespaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPublicationNamespaceMapper {
    long countByExample(PgPublicationNamespaceExample example);

    int deleteByExample(PgPublicationNamespaceExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgPublicationNamespace row);

    int insertSelective(PgPublicationNamespace row);

    List<PgPublicationNamespace> selectByExample(PgPublicationNamespaceExample example);

    PgPublicationNamespace selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgPublicationNamespace row, @Param("example") PgPublicationNamespaceExample example);

    int updateByExample(@Param("row") PgPublicationNamespace row, @Param("example") PgPublicationNamespaceExample example);

    int updateByPrimaryKeySelective(PgPublicationNamespace row);

    int updateByPrimaryKey(PgPublicationNamespace row);
}