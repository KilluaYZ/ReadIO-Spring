package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgConstraint;
import com.pool.readio.readiombg.model.PgConstraintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgConstraintMapper {
    long countByExample(PgConstraintExample example);

    int deleteByExample(PgConstraintExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgConstraint row);

    int insertSelective(PgConstraint row);

    List<PgConstraint> selectByExample(PgConstraintExample example);

    PgConstraint selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgConstraint row, @Param("example") PgConstraintExample example);

    int updateByExample(@Param("row") PgConstraint row, @Param("example") PgConstraintExample example);

    int updateByPrimaryKeySelective(PgConstraint row);

    int updateByPrimaryKey(PgConstraint row);
}