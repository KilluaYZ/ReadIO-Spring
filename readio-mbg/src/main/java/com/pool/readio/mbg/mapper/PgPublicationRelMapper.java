package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgPublicationRel;
import com.pool.readio.mbg.model.PgPublicationRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgPublicationRelMapper {
    long countByExample(PgPublicationRelExample example);

    int deleteByExample(PgPublicationRelExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgPublicationRel row);

    int insertSelective(PgPublicationRel row);

    List<PgPublicationRel> selectByExample(PgPublicationRelExample example);

    PgPublicationRel selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgPublicationRel row, @Param("example") PgPublicationRelExample example);

    int updateByExample(@Param("row") PgPublicationRel row, @Param("example") PgPublicationRelExample example);

    int updateByPrimaryKeySelective(PgPublicationRel row);

    int updateByPrimaryKey(PgPublicationRel row);
}