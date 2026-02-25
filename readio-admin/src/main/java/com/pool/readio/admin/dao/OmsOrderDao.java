package com.pool.readio.admin.dao;

import com.pool.readio.admin.dto.OmsOrderDeliveryParam;
import com.pool.readio.admin.dto.OmsOrderDetail;
import com.pool.readio.admin.dto.OmsOrderQueryParam;
import com.pool.readio.mbg.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询 Dao（复杂条件查询、统计、批量操作等）
 * 基础 CRUD 请使用 {@link com.pool.readio.mbg.mapper.OmsOrderMapper}。
 */
public interface OmsOrderDao {

    /**
     * 条件查询订单列表（支持订单号、状态、来源、收货人关键字、创建时间等）
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 按条件统计订单数量（用于分页）
     */
    long countByCondition(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 按订单号查询订单（订单号唯一）
     */
    OmsOrder getByOrderSn(@Param("orderSn") String orderSn);

    /**
     * 按主键获取订单详情（可扩展为联表查询商品等）
     */
    OmsOrderDetail getDetail(@Param("id") Long id);

    /**
     * 按主键 ID 列表批量查询订单
     */
    List<OmsOrder> listByIds(@Param("ids") List<Long> ids);

    /**
     * 按会员 ID 查询订单列表（按创建时间倒序）
     */
    List<OmsOrder> listByMemberId(@Param("memberId") Long memberId);

    /**
     * 批量发货（按传入的订单 ID 更新状态等）
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量更新订单状态
     */
    int updateStatusByIds(@Param("ids") List<Long> ids, @Param("status") Integer status);

    /**
     * 批量更新订单状态并可选更新备注
     */
    int updateStatusAndNoteByIds(@Param("ids") List<Long> ids, @Param("status") Integer status, @Param("note") String note);

    /**
     * 按主键批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);
}
