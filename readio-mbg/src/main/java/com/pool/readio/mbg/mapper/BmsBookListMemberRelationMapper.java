package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookListMemberRelation;
import com.pool.readio.mbg.model.BmsBookListMemberRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookListMemberRelationMapper {
    long countByExample(BmsBookListMemberRelationExample example);

    int deleteByExample(BmsBookListMemberRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookListMemberRelation row);

    int insertSelective(BmsBookListMemberRelation row);

    List<BmsBookListMemberRelation> selectByExample(BmsBookListMemberRelationExample example);

    BmsBookListMemberRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookListMemberRelation row, @Param("example") BmsBookListMemberRelationExample example);

    int updateByExample(@Param("row") BmsBookListMemberRelation row, @Param("example") BmsBookListMemberRelationExample example);

    int updateByPrimaryKeySelective(BmsBookListMemberRelation row);

    int updateByPrimaryKey(BmsBookListMemberRelation row);
}