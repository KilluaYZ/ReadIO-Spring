package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.BmsBookFootnote;
import com.pool.readio.mbg.model.BmsBookFootnoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmsBookFootnoteMapper {
    long countByExample(BmsBookFootnoteExample example);

    int deleteByExample(BmsBookFootnoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BmsBookFootnote row);

    int insertSelective(BmsBookFootnote row);

    List<BmsBookFootnote> selectByExample(BmsBookFootnoteExample example);

    BmsBookFootnote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BmsBookFootnote row, @Param("example") BmsBookFootnoteExample example);

    int updateByExample(@Param("row") BmsBookFootnote row, @Param("example") BmsBookFootnoteExample example);

    int updateByPrimaryKeySelective(BmsBookFootnote row);

    int updateByPrimaryKey(BmsBookFootnote row);
}