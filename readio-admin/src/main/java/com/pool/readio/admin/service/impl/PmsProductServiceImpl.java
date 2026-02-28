package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dto.PmsProductParam;
import com.pool.readio.admin.dto.PmsProductQueryParam;
import com.pool.readio.admin.dto.PmsProductResult;
import com.pool.readio.mbg.mapper.PmsProductCategoryMapper;
import com.pool.readio.mbg.mapper.PmsProductMapper;
import com.pool.readio.mbg.model.PmsProduct;
import com.pool.readio.mbg.model.PmsProductCategory;
import com.pool.readio.mbg.model.PmsProductExample;
import com.pool.readio.admin.service.PmsProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品管理 Service 实现（与当前 PmsProduct 模型一致）
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductMapper productMapper;
    @Autowired
    private PmsProductCategoryMapper productCategoryMapper;

    @Override
    public List<PmsProduct> listAll() {
        PmsProductExample example = new PmsProductExample();
        example.setOrderByClause("create_time DESC");
        return productMapper.selectByExample(example);
    }

    @Override
    public List<PmsProduct> listByCategoryId(Long categoryId) {
        if (categoryId == null) {
            return java.util.Collections.emptyList();
        }
        PmsProductExample example = new PmsProductExample();
        example.setOrderByClause("create_time DESC");
        example.createCriteria().andProductCategoryIdEqualTo(categoryId.intValue());
        return productMapper.selectByExample(example);
    }

    @Override
    public List<PmsProduct> listByCategoryId(Long categoryId, Integer pageSize, Integer pageNum) {
        if (categoryId == null) {
            return java.util.Collections.emptyList();
        }
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample example = new PmsProductExample();
        example.setOrderByClause("create_time DESC");
        example.createCriteria().andProductCategoryIdEqualTo(categoryId.intValue());
        return productMapper.selectByExample(example);
    }

    @Override
    public int create(PmsProductParam productParam) {
        PmsProduct product = new PmsProduct();
        BeanUtils.copyProperties(productParam, product);
        product.setId(null);
        int rows = productMapper.insertSelective(product);
        return rows > 0 && product.getId() != null ? product.getId() : 0;
    }

    @Override
    public PmsProduct getById(Long id) {
        if (id == null) {
            return null;
        }
        return productMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public PmsProductResult getUpdateInfo(Long id) {
        PmsProduct product = productMapper.selectByPrimaryKey(id.intValue());
        if (product == null) {
            return null;
        }
        PmsProductResult result = new PmsProductResult();
        BeanUtils.copyProperties(product, result);
        if (product.getProductCategoryId() != null) {
            PmsProductCategory category = productCategoryMapper.selectByPrimaryKey(product.getProductCategoryId());
            if (category != null) {
                result.setCateParentId(category.getParentId());
            }
        }
        return result;
    }

    @Override
    public int update(Long id, PmsProductParam productParam) {
        PmsProduct product = new PmsProduct();
        BeanUtils.copyProperties(productParam, product);
        product.setId(id.intValue());
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductExample example = new PmsProductExample();
        PmsProductExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(productQueryParam.getKeyword())) {
            criteria.andNameLike("%" + productQueryParam.getKeyword() + "%");
        }
        if (productQueryParam.getProductCategoryId() != null) {
            criteria.andProductCategoryIdEqualTo(productQueryParam.getProductCategoryId());
        }
        if (productQueryParam.getBookId() != null) {
            criteria.andBookIdEqualTo(productQueryParam.getBookId());
        }
        if (productQueryParam.getHidden() != null) {
            criteria.andHiddenEqualTo(productQueryParam.getHidden());
        }
        return productMapper.selectByExample(example);
    }

    @Override
    public int deleteById(Long id) {
        if (id == null) {
            return 0;
        }
        return productMapper.deleteByPrimaryKey(id.intValue());
    }

    @Override
    public int delete(List<Long> ids) {
        if (ids == null || ids.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (Long id : ids) {
            if (id != null) {
                count += productMapper.deleteByPrimaryKey(id.intValue());
            }
        }
        return count;
    }

    @Override
    public List<PmsProduct> list(String keyword) {
        PmsProductExample example = new PmsProductExample();
        PmsProductExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(keyword)) {
            criteria.andNameLike("%" + keyword + "%");
        }
        return productMapper.selectByExample(example);
    }
}
