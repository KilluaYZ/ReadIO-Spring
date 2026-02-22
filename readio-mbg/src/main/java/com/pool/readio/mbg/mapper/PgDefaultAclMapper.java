package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgDefaultAcl;
import com.pool.readio.mbg.model.PgDefaultAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgDefaultAclMapper {
    long countByExample(PgDefaultAclExample example);

    int deleteByExample(PgDefaultAclExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgDefaultAcl row);

    int insertSelective(PgDefaultAcl row);

    List<PgDefaultAcl> selectByExample(PgDefaultAclExample example);

    PgDefaultAcl selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgDefaultAcl row, @Param("example") PgDefaultAclExample example);

    int updateByExample(@Param("row") PgDefaultAcl row, @Param("example") PgDefaultAclExample example);

    int updateByPrimaryKeySelective(PgDefaultAcl row);

    int updateByPrimaryKey(PgDefaultAcl row);
}