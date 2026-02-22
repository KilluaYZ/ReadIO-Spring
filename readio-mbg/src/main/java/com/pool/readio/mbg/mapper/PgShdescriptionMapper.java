package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgShdescription;
import com.pool.readio.mbg.model.PgShdescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgShdescriptionMapper {
    long countByExample(PgShdescriptionExample example);

    int deleteByExample(PgShdescriptionExample example);

    int deleteByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid);

    int insert(PgShdescription row);

    int insertSelective(PgShdescription row);

    List<PgShdescription> selectByExample(PgShdescriptionExample example);

    PgShdescription selectByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid);

    int updateByExampleSelective(@Param("row") PgShdescription row, @Param("example") PgShdescriptionExample example);

    int updateByExample(@Param("row") PgShdescription row, @Param("example") PgShdescriptionExample example);

    int updateByPrimaryKeySelective(PgShdescription row);

    int updateByPrimaryKey(PgShdescription row);
}