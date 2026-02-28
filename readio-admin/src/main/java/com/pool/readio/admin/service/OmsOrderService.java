package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.*;
import com.pool.readio.mbg.model.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 订单管理Service
 * Created by macro on 2018/10/11.
 */
public interface OmsOrderService {
    /**
     * 订单查询（分页）
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 列出所有订单（不分页）
     */
    List<OmsOrder> listAll();

    /**
     * 根据会员 ID 列出该用户的所有订单（不分页）
     */
    List<OmsOrder> listByMemberId(Long memberId);

    /**
     * 根据会员 ID 分页列出订单
     */
    List<OmsOrder> listByMemberId(Long memberId, Integer pageSize, Integer pageNum);

    /**
     * 新增订单
     */
    int create(OmsOrder order);

    /**
     * 修改订单
     */
    int update(Long id, OmsOrder order);

    /**
     * 删除单个订单
     */
    int deleteById(Long id);

    /**
     * 批量发货
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量关闭订单
     */
    @Transactional
    int close(List<Long> ids, String note);

    /**
     * 批量删除订单
     */
    int delete(List<Long> ids);

    /**
     * 获取指定订单详情
     */
    OmsOrderDetail detail(Long id);

    /**
     * 修改订单收货人信息
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改订单费用信息
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改订单备注
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}
