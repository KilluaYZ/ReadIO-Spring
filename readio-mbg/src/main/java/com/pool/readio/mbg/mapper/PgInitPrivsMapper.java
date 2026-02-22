package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgInitPrivs;
import com.pool.readio.mbg.model.PgInitPrivsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgInitPrivsMapper {
    long countByExample(PgInitPrivsExample example);

    int deleteByExample(PgInitPrivsExample example);

    int deleteByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("objsubid") Integer objsubid);

    int insert(PgInitPrivs row);

    int insertSelective(PgInitPrivs row);

    List<PgInitPrivs> selectByExample(PgInitPrivsExample example);

    PgInitPrivs selectByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("objsubid") Integer objsubid);

    int updateByExampleSelective(@Param("row") PgInitPrivs row, @Param("example") PgInitPrivsExample example);

    int updateByExample(@Param("row") PgInitPrivs row, @Param("example") PgInitPrivsExample example);

    int updateByPrimaryKeySelective(PgInitPrivs row);

    int updateByPrimaryKey(PgInitPrivs row);
}