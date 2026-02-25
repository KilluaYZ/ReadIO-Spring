package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.*;
import com.pool.readio.mbg.mapper.OmsOrderMapper;
import com.pool.readio.mbg.model.OmsOrder;
import com.pool.readio.mbg.model.OmsOrderExample;
import com.pool.readio.admin.service.OmsOrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 订单管理Service实现类
 * Created by macro on 2018/10/11.
 */
@Service
public class OmsOrderServiceImpl implements OmsOrderService {
    @Autowired
    private OmsOrderMapper orderMapper;

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
    public int delivery(List<OmsOrderDeliveryParam> deliveryParamList) {
        int count = 0;
        for (OmsOrderDeliveryParam param : deliveryParamList) {
            OmsOrder order = new OmsOrder();
            order.setId(param.getOrderId().intValue());
            order.setStatus(1); // 1->已完成（当前模型无“已发货”状态）
            count += orderMapper.updateByPrimaryKeySelective(order);
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
    public int updateNote(Long id, String note, Integer status) {
        OmsOrder order = new OmsOrder();
        order.setId(id.intValue());
        order.setNote(note);
        if (status != null) {
            order.setStatus(status);
        }
        return orderMapper.updateByPrimaryKeySelective(order);
    }
}
