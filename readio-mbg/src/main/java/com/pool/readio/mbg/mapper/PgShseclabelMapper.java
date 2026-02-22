package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgShseclabel;
import com.pool.readio.mbg.model.PgShseclabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgShseclabelMapper {
    long countByExample(PgShseclabelExample example);

    int deleteByExample(PgShseclabelExample example);

    int deleteByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("provider") String provider);

    int insert(PgShseclabel row);

    int insertSelective(PgShseclabel row);

    List<PgShseclabel> selectByExample(PgShseclabelExample example);

    PgShseclabel selectByPrimaryKey(@Param("objoid") Long objoid, @Param("classoid") Long classoid, @Param("provider") String provider);

    int updateByExampleSelective(@Param("row") PgShseclabel row, @Param("example") PgShseclabelExample example);

    int updateByExample(@Param("row") PgShseclabel row, @Param("example") PgShseclabelExample example);

    int updateByPrimaryKeySelective(PgShseclabel row);

    int updateByPrimaryKey(PgShseclabel row);
}