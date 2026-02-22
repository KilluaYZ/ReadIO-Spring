package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgAvailableExtensionVersions;
import com.pool.readio.readiombg.model.PgAvailableExtensionVersionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgAvailableExtensionVersionsMapper {
    long countByExample(PgAvailableExtensionVersionsExample example);

    int deleteByExample(PgAvailableExtensionVersionsExample example);

    int insert(PgAvailableExtensionVersions row);

    int insertSelective(PgAvailableExtensionVersions row);

    List<PgAvailableExtensionVersions> selectByExample(PgAvailableExtensionVersionsExample example);

    int updateByExampleSelective(@Param("row") PgAvailableExtensionVersions row, @Param("example") PgAvailableExtensionVersionsExample example);

    int updateByExample(@Param("row") PgAvailableExtensionVersions row, @Param("example") PgAvailableExtensionVersionsExample example);
}