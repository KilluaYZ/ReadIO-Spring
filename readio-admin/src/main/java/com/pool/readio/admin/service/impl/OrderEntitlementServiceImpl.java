package com.pool.readio.admin.service.impl;

import com.pool.readio.admin.service.OrderEntitlementService;
import com.pool.readio.mbg.mapper.BmsBookChapterMapper;
import com.pool.readio.mbg.mapper.OmsOrderMapper;
import com.pool.readio.mbg.mapper.PmsProductCategoryMapper;
import com.pool.readio.mbg.mapper.PmsProductMapper;
import com.pool.readio.mbg.mapper.UmsMemberOwnBookRelationMapper;
import com.pool.readio.mbg.mapper.UmsMemberVipRelationMapper;
import com.pool.readio.mbg.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 订单完成后权益下发：根据商品类型写入「已购书籍」或「VIP 时长」
 * 商品类型：0->书籍；1->章节；2->会员
 */
@Service
public class OrderEntitlementServiceImpl implements OrderEntitlementService {

    private static final int ORDER_STATUS_COMPLETED = 1;
    private static final int PRODUCT_TYPE_BOOK = 0;
    private static final int PRODUCT_TYPE_CHAPTER = 1;
    private static final int PRODUCT_TYPE_VIP = 2;
    /** 永久有效 */
    private static final int DURATION_UNLIMITED = -1;

    private final OmsOrderMapper orderMapper;
    private final PmsProductMapper productMapper;
    private final PmsProductCategoryMapper productCategoryMapper;
    private final BmsBookChapterMapper bookChapterMapper;
    private final UmsMemberOwnBookRelationMapper ownBookRelationMapper;
    private final UmsMemberVipRelationMapper vipRelationMapper;

    public OrderEntitlementServiceImpl(OmsOrderMapper orderMapper,
                                       PmsProductMapper productMapper,
                                       PmsProductCategoryMapper productCategoryMapper,
                                       BmsBookChapterMapper bookChapterMapper,
                                       UmsMemberOwnBookRelationMapper ownBookRelationMapper,
                                       UmsMemberVipRelationMapper vipRelationMapper) {
        this.orderMapper = orderMapper;
        this.productMapper = productMapper;
        this.productCategoryMapper = productCategoryMapper;
        this.bookChapterMapper = bookChapterMapper;
        this.ownBookRelationMapper = ownBookRelationMapper;
        this.vipRelationMapper = vipRelationMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean grantEntitlementForCompletedOrder(Long orderId) {
        if (orderId == null) {
            return false;
        }
        OmsOrder order = orderMapper.selectByPrimaryKey(orderId.intValue());
        if (order == null || order.getStatus() == null || order.getStatus() != ORDER_STATUS_COMPLETED) {
            return false;
        }
        Integer productId = order.getProductId();
        Integer memberId = order.getMemberId();
        if (productId == null || memberId == null) {
            return false;
        }
        PmsProduct product = productMapper.selectByPrimaryKey(productId);
        if (product == null) {
            return false;
        }
        Integer categoryId = product.getProductCategoryId();
        if (categoryId == null) {
            return false;
        }
        PmsProductCategory category = productCategoryMapper.selectByPrimaryKey(categoryId);
        if (category == null || category.getType() == null) {
            return false;
        }
        int type = category.getType().intValue();
        if (type == PRODUCT_TYPE_BOOK || type == PRODUCT_TYPE_CHAPTER) {
            return grantBookEntitlement(memberId, product);
        }
        if (type == PRODUCT_TYPE_VIP) {
            return grantVipEntitlement(memberId, product);
        }
        return false;
    }

    /**
     * 下发书籍/章节阅读权限：写入 ums_member_own_book_relation，已存在同 member+book 则不再重复插入
     */
    private boolean grantBookEntitlement(Integer memberId, PmsProduct product) {
        Integer bookId = product.getBookId();
        if (bookId == null && product.getChapterId() != null) {
            BmsBookChapter chapter = bookChapterMapper.selectByPrimaryKey(product.getChapterId());
            if (chapter != null) {
                bookId = chapter.getBookId();
            }
        }
        if (bookId == null) {
            return false;
        }
        UmsMemberOwnBookRelationExample ex = new UmsMemberOwnBookRelationExample();
        ex.createCriteria().andMemberIdEqualTo(memberId).andBookIdEqualTo(bookId);
        if (ownBookRelationMapper.countByExample(ex) > 0) {
            return true; // 已拥有，视为成功
        }
        UmsMemberOwnBookRelation relation = new UmsMemberOwnBookRelation();
        relation.setMemberId(memberId);
        relation.setBookId(bookId);
        relation.setDuration(DURATION_UNLIMITED);
        relation.setCreateTime(new Date());
        return ownBookRelationMapper.insertSelective(relation) > 0;
    }

    /**
     * 下发 VIP 时长：写入 ums_member_vip_relation 一条记录（时长天数）
     */
    private boolean grantVipEntitlement(Integer memberId, PmsProduct product) {
        Integer duration = product.getVipDuration();
        if (duration == null || duration <= 0) {
            return false;
        }
        UmsMemberVipRelation relation = new UmsMemberVipRelation();
        relation.setMemberId(memberId);
        relation.setCreateTime(new Date());
        relation.setDuration(duration);
        return vipRelationMapper.insertSelective(relation) > 0;
    }
}
