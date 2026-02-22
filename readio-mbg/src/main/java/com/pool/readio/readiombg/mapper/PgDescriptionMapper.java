package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgDescription;
import com.pool.readio.readiombg.model.PgDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgDescriptionMapper {
    long countByExample(PgDescriptionExample example);

    int deleteByExample(PgDescriptionExample example);

    int deleteByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("objsubid") Integer objsubid);

    int insert(PgDescription row);

    int insertSelective(PgDescription row);

    List<PgDescription> selectByExample(PgDescriptionExample example);

    PgDescription selectByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("objsubid") Integer objsubid);

    int updateByExampleSelective(@Param("row") PgDescription row, @Param("example") PgDescriptionExample example);

    int updateByExample(@Param("row") PgDescription row, @Param("example") PgDescriptionExample example);

    int updateByPrimaryKeySelective(PgDescription row);

    int updateByPrimaryKey(PgDescription row);
}