package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.PmsProductParam;
import com.pool.readio.admin.dto.PmsProductQueryParam;
import com.pool.readio.admin.dto.PmsProductResult;
import com.pool.readio.mbg.model.PmsProduct;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品管理Service
 */
public interface PmsProductService {
    /**
     * 列出所有商品（不分页）
     */
    List<PmsProduct> listAll();

    /**
     * 分页查询商品
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    /**
     * 根据分类ID列出该分类下所有商品（不分页）
     */
    List<PmsProduct> listByCategoryId(Long categoryId);

    /**
     * 根据分类ID分页列出商品
     */
    List<PmsProduct> listByCategoryId(Long categoryId, Integer pageSize, Integer pageNum);

    /**
     * 创建商品
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(PmsProductParam productParam);

    /**
     * 根据商品ID获取详情
     */
    PmsProduct getById(Long id);

    /**
     * 根据商品编号获取更新信息
     */
    PmsProductResult getUpdateInfo(Long id);

    /**
     * 更新商品
     */
    @Transactional
    int update(Long id, PmsProductParam productParam);

    /**
     * 删除单个商品
     */
    int deleteById(Long id);

    /**
     * 批量删除商品
     */
    int delete(List<Long> ids);

    /**
     * 根据商品名称模糊查询
     */
    List<PmsProduct> list(String keyword);
}
