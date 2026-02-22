package com.pool.readio.mbg.mapper;

import com.pool.readio.mbg.model.PgStatWalReceiver;
import com.pool.readio.mbg.model.PgStatWalReceiverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgStatWalReceiverMapper {
    long countByExample(PgStatWalReceiverExample example);

    int deleteByExample(PgStatWalReceiverExample example);

    int insert(PgStatWalReceiver row);

    int insertSelective(PgStatWalReceiver row);

    List<PgStatWalReceiver> selectByExample(PgStatWalReceiverExample example);

    int updateByExampleSelective(@Param("row") PgStatWalReceiver row, @Param("example") PgStatWalReceiverExample example);

    int updateByExample(@Param("row") PgStatWalReceiver row, @Param("example") PgStatWalReceiverExample example);
}