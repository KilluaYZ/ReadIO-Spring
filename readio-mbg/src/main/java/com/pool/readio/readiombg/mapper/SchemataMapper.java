package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.Schemata;
import com.pool.readio.readiombg.model.SchemataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemataMapper {
    long countByExample(SchemataExample example);

    int deleteByExample(SchemataExample example);

    int insert(Schemata row);

    int insertSelective(Schemata row);

    List<Schemata> selectByExample(SchemataExample example);

    int updateByExampleSelective(@Param("row") Schemata row, @Param("example") SchemataExample example);

    int updateByExample(@Param("row") Schemata row, @Param("example") SchemataExample example);
}