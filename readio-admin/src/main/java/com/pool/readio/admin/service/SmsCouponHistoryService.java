package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.SmsCouponHistory;

import java.util.List;

/**
 * 优惠券领取记录管理Service
 * Created by macro on 2018/11/6.
 */
public interface SmsCouponHistoryService {
    /**
     * 分页查询优惠券领取记录
     * @param couponId 优惠券id
     * @param memberId 会员id
     * @param useStatus 使用状态：0->未使用；1->已使用；2->已过期
     * @param orderSn 使用订单号码
     */
    List<SmsCouponHistory> list(Long couponId, Long memberId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);

    SmsCouponHistory getById(Integer id);
}
