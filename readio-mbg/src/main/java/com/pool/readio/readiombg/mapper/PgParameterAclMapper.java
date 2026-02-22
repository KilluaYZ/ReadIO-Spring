package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgParameterAcl;
import com.pool.readio.readiombg.model.PgParameterAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgParameterAclMapper {
    long countByExample(PgParameterAclExample example);

    int deleteByExample(PgParameterAclExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgParameterAcl row);

    int insertSelective(PgParameterAcl row);

    List<PgParameterAcl> selectByExample(PgParameterAclExample example);

    PgParameterAcl selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgParameterAcl row, @Param("example") PgParameterAclExample example);

    int updateByExample(@Param("row") PgParameterAcl row, @Param("example") PgParameterAclExample example);

    int updateByPrimaryKeySelective(PgParameterAcl row);

    int updateByPrimaryKey(PgParameterAcl row);
}