package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgLargeobjectMetadata;
import com.pool.readio.readiombg.model.PgLargeobjectMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgLargeobjectMetadataMapper {
    long countByExample(PgLargeobjectMetadataExample example);

    int deleteByExample(PgLargeobjectMetadataExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgLargeobjectMetadata row);

    int insertSelective(PgLargeobjectMetadata row);

    List<PgLargeobjectMetadata> selectByExample(PgLargeobjectMetadataExample example);

    PgLargeobjectMetadata selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgLargeobjectMetadata row, @Param("example") PgLargeobjectMetadataExample example);

    int updateByExample(@Param("row") PgLargeobjectMetadata row, @Param("example") PgLargeobjectMetadataExample example);

    int updateByPrimaryKeySelective(PgLargeobjectMetadata row);

    int updateByPrimaryKey(PgLargeobjectMetadata row);
}