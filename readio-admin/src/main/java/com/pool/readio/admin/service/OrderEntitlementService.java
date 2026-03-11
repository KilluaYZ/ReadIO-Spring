package com.pool.readio.admin.service;

/**
 * 订单完成后权益下发（已购书籍、VIP 等）
 * 在后台将订单置为「已完成」时，根据商品类型写入 ums_member_own_book_relation / ums_member_vip_relation
 */
public interface OrderEntitlementService {

    /**
     * 对已完成的订单下发权益（书籍阅读权限或 VIP 时长）
     * 仅当订单状态为 1（已完成）时执行；按商品类型：书籍/章节 -> 写入已购书；会员 -> 写入 VIP
     *
     * @param orderId 订单 ID
     * @return 是否执行了下发（未下发时返回 false，如订单非已完成、商品不存在等）
     */
    boolean grantEntitlementForCompletedOrder(Long orderId);
}
