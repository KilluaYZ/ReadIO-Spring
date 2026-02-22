package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.TableConstraints;
import com.pool.readio.readiombg.model.TableConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableConstraintsMapper {
    long countByExample(TableConstraintsExample example);

    int deleteByExample(TableConstraintsExample example);

    int insert(TableConstraints row);

    int insertSelective(TableConstraints row);

    List<TableConstraints> selectByExample(TableConstraintsExample example);

    int updateByExampleSelective(@Param("row") TableConstraints row, @Param("example") TableConstraintsExample example);

    int updateByExample(@Param("row") TableConstraints row, @Param("example") TableConstraintsExample example);
}