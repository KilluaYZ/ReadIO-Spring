package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgSubscriptionRel;
import com.pool.readio.readiombg.model.PgSubscriptionRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgSubscriptionRelMapper {
    long countByExample(PgSubscriptionRelExample example);

    int deleteByExample(PgSubscriptionRelExample example);

    int deleteByPrimaryKey(@Param("srrelid") Long srrelid, @Param("srsubid") Long srsubid);

    int insert(PgSubscriptionRel row);

    int insertSelective(PgSubscriptionRel row);

    List<PgSubscriptionRel> selectByExample(PgSubscriptionRelExample example);

    PgSubscriptionRel selectByPrimaryKey(@Param("srrelid") Long srrelid, @Param("srsubid") Long srsubid);

    int updateByExampleSelective(@Param("row") PgSubscriptionRel row, @Param("example") PgSubscriptionRelExample example);

    int updateByExample(@Param("row") PgSubscriptionRel row, @Param("example") PgSubscriptionRelExample example);

    int updateByPrimaryKeySelective(PgSubscriptionRel row);

    int updateByPrimaryKey(PgSubscriptionRel row);
}