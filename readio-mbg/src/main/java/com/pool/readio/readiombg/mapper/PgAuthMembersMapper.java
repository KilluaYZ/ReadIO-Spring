package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgAuthMembers;
import com.pool.readio.readiombg.model.PgAuthMembersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAuthMembersMapper {
    long countByExample(PgAuthMembersExample example);

    int deleteByExample(PgAuthMembersExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgAuthMembers row);

    int insertSelective(PgAuthMembers row);

    List<PgAuthMembers> selectByExample(PgAuthMembersExample example);

    PgAuthMembers selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgAuthMembers row, @Param("example") PgAuthMembersExample example);

    int updateByExample(@Param("row") PgAuthMembers row, @Param("example") PgAuthMembersExample example);

    int updateByPrimaryKeySelective(PgAuthMembers row);

    int updateByPrimaryKey(PgAuthMembers row);
}