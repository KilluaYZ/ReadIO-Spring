package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgCollation;
import com.pool.readio.mbg.model.PgCollationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgCollationMapper {
    long countByExample(PgCollationExample example);

    int deleteByExample(PgCollationExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgCollation row);

    int insertSelective(PgCollation row);

    List<PgCollation> selectByExample(PgCollationExample example);

    PgCollation selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgCollation row, @Param("example") PgCollationExample example);

    int updateByExample(@Param("row") PgCollation row, @Param("example") PgCollationExample example);

    int updateByPrimaryKeySelective(PgCollation row);

    int updateByPrimaryKey(PgCollation row);
}