package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.ReferentialConstraints;
import com.pool.readio.readiombg.model.ReferentialConstraintsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferentialConstraintsMapper {
    long countByExample(ReferentialConstraintsExample example);

    int deleteByExample(ReferentialConstraintsExample example);

    int insert(ReferentialConstraints row);

    int insertSelective(ReferentialConstraints row);

    List<ReferentialConstraints> selectByExample(ReferentialConstraintsExample example);

    int updateByExampleSelective(@Param("row") ReferentialConstraints row, @Param("example") ReferentialConstraintsExample example);

    int updateByExample(@Param("row") ReferentialConstraints row, @Param("example") ReferentialConstraintsExample example);
}