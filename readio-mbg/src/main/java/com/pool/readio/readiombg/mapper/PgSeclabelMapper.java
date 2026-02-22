package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.PgSeclabel;
import com.pool.readio.readiombg.model.PgSeclabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgSeclabelMapper {
    long countByExample(PgSeclabelExample example);

    int deleteByExample(PgSeclabelExample example);

    int deleteByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("objsubid") Integer objsubid, @Param("provider") String provider);

    int insert(PgSeclabel row);

    int insertSelective(PgSeclabel row);

    List<PgSeclabel> selectByExample(PgSeclabelExample example);

    PgSeclabel selectByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("objsubid") Integer objsubid, @Param("provider") String provider);

    int updateByExampleSelective(@Param("row") PgSeclabel row, @Param("example") PgSeclabelExample example);

    int updateByExample(@Param("row") PgSeclabel row, @Param("example") PgSeclabelExample example);

    int updateByPrimaryKeySelective(PgSeclabel row);

    int updateByPrimaryKey(PgSeclabel row);
}