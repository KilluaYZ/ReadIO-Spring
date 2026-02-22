package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgPublication;
import com.pool.readio.readiombg.model.PgPublicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPublicationMapper {
    long countByExample(PgPublicationExample example);

    int deleteByExample(PgPublicationExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgPublication row);

    int insertSelective(PgPublication row);

    List<PgPublication> selectByExample(PgPublicationExample example);

    PgPublication selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgPublication row, @Param("example") PgPublicationExample example);

    int updateByExample(@Param("row") PgPublication row, @Param("example") PgPublicationExample example);

    int updateByPrimaryKeySelective(PgPublication row);

    int updateByPrimaryKey(PgPublication row);
}