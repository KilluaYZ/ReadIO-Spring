package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsOneWord;
import com.pool.readio.mbg.model.BmsOneWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsOneWordMapper {
    long countByExample(BmsOneWordExample example);

    int deleteByExample(BmsOneWordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsOneWord row);

    int insertSelective(BmsOneWord row);

    List<BmsOneWord> selectByExample(BmsOneWordExample example);

    BmsOneWord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsOneWord row, @Param("example") BmsOneWordExample example);

    int updateByExample(@Param("row") BmsOneWord row, @Param("example") BmsOneWordExample example);

    int updateByPrimaryKeySelective(BmsOneWord row);

    int updateByPrimaryKey(BmsOneWord row);
}