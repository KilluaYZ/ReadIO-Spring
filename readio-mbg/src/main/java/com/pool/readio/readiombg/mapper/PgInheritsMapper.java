package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgInherits;
import com.pool.readio.readiombg.model.PgInheritsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgInheritsMapper {
    long countByExample(PgInheritsExample example);

    int deleteByExample(PgInheritsExample example);

    int deleteByPrimaryKey(@Param("inhrelid") Long inhrelid, @Param("inhseqno") Integer inhseqno);

    int insert(PgInherits row);

    int insertSelective(PgInherits row);

    List<PgInherits> selectByExample(PgInheritsExample example);

    PgInherits selectByPrimaryKey(@Param("inhrelid") Long inhrelid, @Param("inhseqno") Integer inhseqno);

    int updateByExampleSelective(@Param("row") PgInherits row, @Param("example") PgInheritsExample example);

    int updateByExample(@Param("row") PgInherits row, @Param("example") PgInheritsExample example);

    int updateByPrimaryKeySelective(PgInherits row);

    int updateByPrimaryKey(PgInherits row);
}