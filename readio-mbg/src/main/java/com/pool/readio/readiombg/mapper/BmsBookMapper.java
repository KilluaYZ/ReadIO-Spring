package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.BmsBook;
import com.pool.readio.readiombg.model.BmsBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookMapper {
    long countByExample(BmsBookExample example);

    int deleteByExample(BmsBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBook row);

    int insertSelective(BmsBook row);

    List<BmsBook> selectByExample(BmsBookExample example);

    BmsBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBook row, @Param("example") BmsBookExample example);

    int updateByExample(@Param("row") BmsBook row, @Param("example") BmsBookExample example);

    int updateByPrimaryKeySelective(BmsBook row);

    int updateByPrimaryKey(BmsBook row);
}