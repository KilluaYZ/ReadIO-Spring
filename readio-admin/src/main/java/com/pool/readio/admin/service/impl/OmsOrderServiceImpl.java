package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.*;
import com.pool.readio.mbg.mapper.OmsOrderMapper;
import com.pool.readio.mbg.model.OmsOrder;
import com.pool.readio.mbg.model.OmsOrderExample;
import com.pool.readio.admin.service.OmsOrderService;
import com.pool.readio.admin.service.OrderEntitlementService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 订单管理Service实现类
 * 订单状态变为「已完成」(status=1) 时，会触发权益下发（已购书籍 / VIP 时长）
 */
@Service
public class OmsOrderServiceImpl implements OmsOrderService {
    private static final int ORDER_STATUS_COMPLETED = 1;

    private final OmsOrderMapper orderMapper;
    private final OrderEntitlementService orderEntitlementService;

    public OmsOrderServiceImpl(OmsOrderMapper orderMapper, OrderEntitlementService orderEntitlementService) {
        this.orderMapper = orderMapper;
        this.orderEntitlementService = orderEntitlementService;
    }

    @Override
    public List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        OmsOrderExample example = new OmsOrderExample();
        OmsOrderExample.Criteria c = example.createCriteria();
        if (StringUtils.hasText(queryParam.getOrderSn())) {
            c.andOrderSnLike("%" + queryParam.getOrderSn() + "%");
        }
        if (queryParam.getStatus() != null) {
            c.andStatusEqualTo(queryParam.getStatus());
        }
        if (queryParam.getSourceType() != null) {
            c.andSourceTypeEqualTo(queryParam.getSourceType());
        }
        if (StringUtils.hasText(queryParam.getReceiverKeyword())) {
            c.andMemberUsernameLike("%" + queryParam.getReceiverKeyword() + "%");
        }
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<OmsOrder> listAll() {
        OmsOrderExample example = new OmsOrderExample();
        example.setOrderByClause("create_time DESC");
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<OmsOrder> listByMemberId(Long memberId) {
        if (memberId == null) {
            return java.util.Collections.emptyList();
        }
        OmsOrderExample example = new OmsOrderExample();
        example.setOrderByClause("create_time DESC");
        example.createCriteria().andMemberIdEqualTo(memberId.intValue());
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<OmsOrder> listByMemberId(Long memberId, Integer pageSize, Integer pageNum) {
        if (memberId == null) {
            return java.util.Collections.emptyList();
        }
        PageHelper.startPage(pageNum, pageSize);
        OmsOrderExample example = new OmsOrderExample();
        example.setOrderByClause("create_time DESC");
        example.createCriteria().andMemberIdEqualTo(memberId.intValue());
        return orderMapper.selectByExample(example);
    }

    @Override
    public int create(OmsOrder order) {
        return orderMapper.insertSelective(order);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(Long id, OmsOrder order) {
        if (id == null) {
            return 0;
        }
        OmsOrder existing = orderMapper.selectByPrimaryKey(id.intValue());
        order.setId(id.intValue());
        int updated = orderMapper.updateByPrimaryKeySelective(order);
        if (updated > 0 && order.getStatus() != null && order.getStatus() == ORDER_STATUS_COMPLETED
                && (existing == null || existing.getStatus() == null || existing.getStatus() != ORDER_STATUS_COMPLETED)) {
            orderEntitlementService.grantEntitlementForCompletedOrder(id);
        }
        return updated;
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return orderMapper.deleteByPrimaryKey(id.intValue());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delivery(List<OmsOrderDeliveryParam> deliveryParamList) {
        int count = 0;
        for (OmsOrderDeliveryParam param : deliveryParamList) {
            Long orderId = param.getOrderId();
            OmsOrder existing = orderMapper.selectByPrimaryKey(orderId.intValue());
            if (existing != null && (existing.getStatus() == null || existing.getStatus() != ORDER_STATUS_COMPLETED)) {
                OmsOrder order = new OmsOrder();
                order.setId(orderId.intValue());
                order.setStatus(ORDER_STATUS_COMPLETED);
                count += orderMapper.updateByPrimaryKeySelective(order);
                orderEntitlementService.grantEntitlementForCompletedOrder(orderId);
            }
        }
        return count;
    }

    @Override
    public int close(List<Long> ids, String note) {
        OmsOrder record = new OmsOrder();
        record.setStatus(2); // 2->已关闭
        OmsOrderExample example = new OmsOrderExample();
        List<Integer> idList = ids.stream().map(Long::intValue).toList();
        example.createCriteria().andIdIn(idList);
        return orderMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int delete(List<Long> ids) {
        int count = 0;
        for (Long id : ids) {
            count += orderMapper.deleteByPrimaryKey(id.intValue());
        }
        return count;
    }

    @Override
    public OmsOrderDetail detail(Long id) {
        OmsOrder order = orderMapper.selectByPrimaryKey(id.intValue());
        if (order == null) {
            return null;
        }
        OmsOrderDetail detail = new OmsOrderDetail();
        BeanUtils.copyProperties(order, detail);
        return detail;
    }

    @Override
    public int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam) {
        OmsOrder order = new OmsOrder();
        order.setId(receiverInfoParam.getOrderId().intValue());
        // OmsOrder 无收货人字段时仅更新备注
        order.setNote(receiverInfoParam.getReceiverName() != null ? receiverInfoParam.getReceiverName() : "");
        return orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    public int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam) {
        OmsOrder order = new OmsOrder();
        order.setId(moneyInfoParam.getOrderId().intValue());
        if (moneyInfoParam.getFreightAmount() != null) {
            order.setTotalAmount(moneyInfoParam.getFreightAmount().shortValue());
        }
        if (moneyInfoParam.getDiscountAmount() != null) {
            order.setPayAmount(moneyInfoParam.getDiscountAmount().shortValue());
        }
        return orderMapper.updateByPrimaryKeySelective(order);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateNote(Long id, String note, Integer status) {
        OmsOrder existing = orderMapper.selectByPrimaryKey(id.intValue());
        OmsOrder order = new OmsOrder();
        order.setId(id.intValue());
        order.setNote(note);
        if (status != null) {
            order.setStatus(status);
        }
        int updated = orderMapper.updateByPrimaryKeySelective(order);
        if (updated > 0 && status != null && status == ORDER_STATUS_COMPLETED
                && (existing == null || existing.getStatus() == null || existing.getStatus() != ORDER_STATUS_COMPLETED)) {
            orderEntitlementService.grantEntitlementForCompletedOrder(id);
        }
        return updated;
    }
}
