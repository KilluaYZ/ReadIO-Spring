package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.InformationSchemaCatalogName;
import com.pool.readio.readiombg.model.InformationSchemaCatalogNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformationSchemaCatalogNameMapper {
    long countByExample(InformationSchemaCatalogNameExample example);

    int deleteByExample(InformationSchemaCatalogNameExample example);

    int insert(InformationSchemaCatalogName row);

    int insertSelective(InformationSchemaCatalogName row);

    List<InformationSchemaCatalogName> selectByExample(InformationSchemaCatalogNameExample example);

    int updateByExampleSelective(@Param("row") InformationSchemaCatalogName row, @Param("example") InformationSchemaCatalogNameExample example);

    int updateByExample(@Param("row") InformationSchemaCatalogName row, @Param("example") InformationSchemaCatalogNameExample example);
}