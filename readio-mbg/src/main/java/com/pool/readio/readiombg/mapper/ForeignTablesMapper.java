package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ForeignTables;
import com.pool.readio.readiombg.model.ForeignTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignTablesMapper {
    long countByExample(ForeignTablesExample example);

    int deleteByExample(ForeignTablesExample example);

    int insert(ForeignTables row);

    int insertSelective(ForeignTables row);

    List<ForeignTables> selectByExample(ForeignTablesExample example);

    int updateByExampleSelective(@Param("row") ForeignTables row, @Param("example") ForeignTablesExample example);

    int updateByExample(@Param("row") ForeignTables row, @Param("example") ForeignTablesExample example);
}