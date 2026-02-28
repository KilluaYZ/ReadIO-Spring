package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.SmsCouponParam;
import com.pool.readio.mbg.model.PmsProduct;
import com.pool.readio.mbg.model.PmsProductCategory;
import com.pool.readio.mbg.model.SmsCoupon;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 优惠券管理Service
 */
public interface SmsCouponService {
    /**
     * 添加优惠券
     */
    @Transactional
    int create(SmsCouponParam couponParam);

    /**
     * 根据优惠券id删除优惠券
     */
    @Transactional
    int delete(Long id);

    /**
     * 根据优惠券id更新优惠券信息
     */
    @Transactional
    int update(Long id, SmsCouponParam couponParam);

    /**
     * 分页获取优惠券列表
     */
    List<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 获取优惠券详情
     */
    SmsCouponParam getItem(Long id);

    // --------------- 优惠券与商品/商品类型绑定 ---------------

    /** (1) 增加优惠券与某一个商品类型的绑定 */
    int addCouponProductCategoryBinding(Long couponId, Long productCategoryId);

    /** (2) 增加优惠券与某一个商品的绑定 */
    int addCouponProductBinding(Long couponId, Long productId);

    /** (3) 删除优惠券与某一个商品类型的绑定 */
    int removeCouponProductCategoryBinding(Long couponId, Long productCategoryId);

    /** (4) 删除优惠券与某一个商品的绑定 */
    int removeCouponProductBinding(Long couponId, Long productId);

    /** (5) 查看某一个优惠券适用于哪些商品 */
    List<PmsProduct> listProductsByCouponId(Long couponId);

    /** (6) 查看某一个优惠券适用于哪些商品类型 */
    List<PmsProductCategory> listProductCategoriesByCouponId(Long couponId);

    /** (7) 查看一个商品上可以使用哪些优惠券 */
    List<SmsCoupon> listCouponsByProductId(Long productId);

    /** (8) 查看一个商品类型上可以使用哪些优惠券 */
    List<SmsCoupon> listCouponsByProductCategoryId(Long productCategoryId);
}
