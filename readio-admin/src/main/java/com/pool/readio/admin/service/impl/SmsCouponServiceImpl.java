package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dao.SmsCouponDao;
import com.pool.readio.admin.dao.SmsCouponProductCategoryRelationDao;
import com.pool.readio.admin.dao.SmsCouponProductRelationDao;
import com.pool.readio.admin.dto.SmsCouponParam;
import com.pool.readio.mbg.mapper.PmsProductCategoryMapper;
import com.pool.readio.mbg.mapper.PmsProductMapper;
import com.pool.readio.mbg.mapper.SmsCouponMapper;
import com.pool.readio.mbg.mapper.SmsCouponProductCategoryRelationMapper;
import com.pool.readio.mbg.mapper.SmsCouponProductRelationMapper;
import com.pool.readio.mbg.model.*;
import com.pool.readio.admin.service.SmsCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 优惠券管理Service实现类
 * Created by macro on 2018/8/28.
 */
@Service
public class SmsCouponServiceImpl implements SmsCouponService {
    @Autowired
    private SmsCouponMapper couponMapper;
    @Autowired
    private SmsCouponProductRelationMapper productRelationMapper;
    @Autowired
    private SmsCouponProductCategoryRelationMapper productCategoryRelationMapper;
    @Autowired
    private SmsCouponProductRelationDao productRelationDao;
    @Autowired
    private SmsCouponProductCategoryRelationDao productCategoryRelationDao;
    @Autowired
    private SmsCouponDao couponDao;
    @Autowired
    private PmsProductMapper pmsProductMapper;
    @Autowired
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public int create(SmsCouponParam couponParam) {
        couponParam.setCount(couponParam.getPublishCount());
        couponParam.setUseCount(0);
        couponParam.setReceiveCount(0);
        //插入优惠券表
        int count = couponMapper.insert(couponParam);
        //插入优惠券和商品关系表（use_type=2 指定商品）
        if (couponParam.getUseType() != null && couponParam.getUseType().equals(2)
                && couponParam.getProductRelationList() != null && !couponParam.getProductRelationList().isEmpty()) {
            for (SmsCouponProductRelation productRelation : couponParam.getProductRelationList()) {
                productRelation.setCouponId(couponParam.getId());
            }
            productRelationDao.insertList(couponParam.getProductRelationList());
        }
        //插入优惠券和商品分类关系表（use_type=1 指定分类）
        if (couponParam.getUseType() != null && couponParam.getUseType().equals(1)
                && couponParam.getProductCategoryRelationList() != null && !couponParam.getProductCategoryRelationList().isEmpty()) {
            for (SmsCouponProductCategoryRelation couponProductCategoryRelation : couponParam.getProductCategoryRelationList()) {
                couponProductCategoryRelation.setCouponId(couponParam.getId());
            }
            productCategoryRelationDao.insertList(couponParam.getProductCategoryRelationList());
        }
        return count;
    }

    @Override
    public int delete(Long id) {
        //删除优惠券
        int count = couponMapper.deleteByPrimaryKey(id.intValue());
        //删除商品关联
        deleteProductRelation(id);
        //删除商品分类关联
        deleteProductCategoryRelation(id);
        return count;
    }

    private void deleteProductCategoryRelation(Long id) {
        SmsCouponProductCategoryRelationExample productCategoryRelationExample = new SmsCouponProductCategoryRelationExample();
        productCategoryRelationExample.createCriteria().andCouponIdEqualTo(id.intValue());
        productCategoryRelationMapper.deleteByExample(productCategoryRelationExample);
    }

    private void deleteProductRelation(Long id) {
        SmsCouponProductRelationExample productRelationExample = new SmsCouponProductRelationExample();
        productRelationExample.createCriteria().andCouponIdEqualTo(id.intValue());
        productRelationMapper.deleteByExample(productRelationExample);
    }

    @Override
    public int update(Long id, SmsCouponParam couponParam) {
        couponParam.setId(id.intValue());
        int count =couponMapper.updateByPrimaryKey(couponParam);
        //删除后插入优惠券和商品关系表（use_type=2 指定商品）
        if (couponParam.getUseType() != null && couponParam.getUseType().equals(2)
                && couponParam.getProductRelationList() != null && !couponParam.getProductRelationList().isEmpty()) {
            for (SmsCouponProductRelation productRelation : couponParam.getProductRelationList()) {
                productRelation.setCouponId(couponParam.getId());
            }
            deleteProductRelation(id);
            productRelationDao.insertList(couponParam.getProductRelationList());
        }
        //删除后插入优惠券和商品分类关系表（use_type=1 指定分类）
        if (couponParam.getUseType() != null && couponParam.getUseType().equals(1)
                && couponParam.getProductCategoryRelationList() != null && !couponParam.getProductCategoryRelationList().isEmpty()) {
            for (SmsCouponProductCategoryRelation couponProductCategoryRelation : couponParam.getProductCategoryRelationList()) {
                couponProductCategoryRelation.setCouponId(couponParam.getId());
            }
            deleteProductCategoryRelation(id);
            productCategoryRelationDao.insertList(couponParam.getProductCategoryRelationList());
        }
        return count;
    }

    @Override
    public List<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum) {
        SmsCouponExample example = new SmsCouponExample();
        SmsCouponExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if(type!=null){
            criteria.andTypeEqualTo(type);
        }
        PageHelper.startPage(pageNum,pageSize);
        return couponMapper.selectByExample(example);
    }

    @Override
    public SmsCouponParam getItem(Long id) {
        return couponDao.getItem(id);
    }

    @Override
    public int addCouponProductCategoryBinding(Long couponId, Long productCategoryId) {
        if (couponId == null || productCategoryId == null) return 0;
        SmsCouponProductCategoryRelation rel = new SmsCouponProductCategoryRelation();
        rel.setCouponId(couponId.intValue());
        rel.setProductCategoryId(productCategoryId.intValue());
        return productCategoryRelationMapper.insertSelective(rel);
    }

    @Override
    public int addCouponProductBinding(Long couponId, Long productId) {
        if (couponId == null || productId == null) return 0;
        SmsCouponProductRelation rel = new SmsCouponProductRelation();
        rel.setCouponId(couponId.intValue());
        rel.setProductId(productId.intValue());
        return productRelationMapper.insertSelective(rel);
    }

    @Override
    public int removeCouponProductCategoryBinding(Long couponId, Long productCategoryId) {
        if (couponId == null || productCategoryId == null) return 0;
        SmsCouponProductCategoryRelationExample ex = new SmsCouponProductCategoryRelationExample();
        ex.createCriteria().andCouponIdEqualTo(couponId.intValue()).andProductCategoryIdEqualTo(productCategoryId.intValue());
        return productCategoryRelationMapper.deleteByExample(ex);
    }

    @Override
    public int removeCouponProductBinding(Long couponId, Long productId) {
        if (couponId == null || productId == null) return 0;
        SmsCouponProductRelationExample ex = new SmsCouponProductRelationExample();
        ex.createCriteria().andCouponIdEqualTo(couponId.intValue()).andProductIdEqualTo(productId.intValue());
        return productRelationMapper.deleteByExample(ex);
    }

    @Override
    public List<PmsProduct> listProductsByCouponId(Long couponId) {
        if (couponId == null) return new ArrayList<>();
        SmsCouponProductRelationExample ex = new SmsCouponProductRelationExample();
        ex.createCriteria().andCouponIdEqualTo(couponId.intValue());
        List<SmsCouponProductRelation> relations = productRelationMapper.selectByExample(ex);
        List<Integer> productIds = relations.stream().map(SmsCouponProductRelation::getProductId).distinct().collect(Collectors.toList());
        if (productIds.isEmpty()) return new ArrayList<>();
        PmsProductExample productEx = new PmsProductExample();
        productEx.createCriteria().andIdIn(productIds);
        List<PmsProduct> products = pmsProductMapper.selectByExample(productEx);
        Map<Integer, PmsProduct> idToProduct = new LinkedHashMap<>();
        for (PmsProduct p : products) idToProduct.put(p.getId(), p);
        List<PmsProduct> result = new ArrayList<>();
        for (Integer id : productIds) {
            if (idToProduct.containsKey(id)) result.add(idToProduct.get(id));
        }
        return result;
    }

    @Override
    public List<PmsProductCategory> listProductCategoriesByCouponId(Long couponId) {
        if (couponId == null) return new ArrayList<>();
        SmsCouponProductCategoryRelationExample ex = new SmsCouponProductCategoryRelationExample();
        ex.createCriteria().andCouponIdEqualTo(couponId.intValue());
        List<SmsCouponProductCategoryRelation> relations = productCategoryRelationMapper.selectByExample(ex);
        List<Integer> categoryIds = relations.stream().map(SmsCouponProductCategoryRelation::getProductCategoryId).distinct().collect(Collectors.toList());
        if (categoryIds.isEmpty()) return new ArrayList<>();
        PmsProductCategoryExample categoryEx = new PmsProductCategoryExample();
        categoryEx.createCriteria().andIdIn(categoryIds);
        List<PmsProductCategory> categories = pmsProductCategoryMapper.selectByExample(categoryEx);
        Map<Integer, PmsProductCategory> idToCategory = new LinkedHashMap<>();
        for (PmsProductCategory c : categories) idToCategory.put(c.getId(), c);
        List<PmsProductCategory> result = new ArrayList<>();
        for (Integer id : categoryIds) {
            if (idToCategory.containsKey(id)) result.add(idToCategory.get(id));
        }
        return result;
    }

    @Override
    public List<SmsCoupon> listCouponsByProductId(Long productId) {
        if (productId == null) return new ArrayList<>();
        SmsCouponProductRelationExample ex = new SmsCouponProductRelationExample();
        ex.createCriteria().andProductIdEqualTo(productId.intValue());
        List<SmsCouponProductRelation> relations = productRelationMapper.selectByExample(ex);
        List<Integer> couponIds = relations.stream().map(SmsCouponProductRelation::getCouponId).distinct().collect(Collectors.toList());
        if (couponIds.isEmpty()) return new ArrayList<>();
        SmsCouponExample couponEx = new SmsCouponExample();
        couponEx.createCriteria().andIdIn(couponIds);
        List<SmsCoupon> coupons = couponMapper.selectByExample(couponEx);
        Map<Integer, SmsCoupon> idToCoupon = new LinkedHashMap<>();
        for (SmsCoupon c : coupons) idToCoupon.put(c.getId(), c);
        List<SmsCoupon> result = new ArrayList<>();
        for (Integer id : couponIds) {
            if (idToCoupon.containsKey(id)) result.add(idToCoupon.get(id));
        }
        return result;
    }

    @Override
    public List<SmsCoupon> listCouponsByProductCategoryId(Long productCategoryId) {
        if (productCategoryId == null) return new ArrayList<>();
        SmsCouponProductCategoryRelationExample ex = new SmsCouponProductCategoryRelationExample();
        ex.createCriteria().andProductCategoryIdEqualTo(productCategoryId.intValue());
        List<SmsCouponProductCategoryRelation> relations = productCategoryRelationMapper.selectByExample(ex);
        List<Integer> couponIds = relations.stream().map(SmsCouponProductCategoryRelation::getCouponId).distinct().collect(Collectors.toList());
        if (couponIds.isEmpty()) return new ArrayList<>();
        SmsCouponExample couponEx = new SmsCouponExample();
        couponEx.createCriteria().andIdIn(couponIds);
        List<SmsCoupon> coupons = couponMapper.selectByExample(couponEx);
        Map<Integer, SmsCoupon> idToCoupon = new LinkedHashMap<>();
        for (SmsCoupon c : coupons) idToCoupon.put(c.getId(), c);
        List<SmsCoupon> result = new ArrayList<>();
        for (Integer id : couponIds) {
            if (idToCoupon.containsKey(id)) result.add(idToCoupon.get(id));
        }
        return result;
    }
}
