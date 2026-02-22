package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgOpclass;
import com.pool.readio.mbg.model.PgOpclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgOpclassMapper {
    long countByExample(PgOpclassExample example);

    int deleteByExample(PgOpclassExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(PgOpclass row);

    int insertSelective(PgOpclass row);

    List<PgOpclass> selectByExample(PgOpclassExample example);

    PgOpclass selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("row") PgOpclass row, @Param("example") PgOpclassExample example);

    int updateByExample(@Param("row") PgOpclass row, @Param("example") PgOpclassExample example);

    int updateByPrimaryKeySelective(PgOpclass row);

    int updateByPrimaryKey(PgOpclass row);
}