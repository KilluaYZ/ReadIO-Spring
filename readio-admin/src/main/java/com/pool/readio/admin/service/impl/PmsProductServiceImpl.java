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
    public int create(PmsProductParam productParam) {
        PmsProduct product = new PmsProduct();
        BeanUtils.copyProperties(productParam, product);
        product.setId(null);
        return productMapper.insertSelective(product);
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
    public int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail) {
        // 当前模型无审核状态字段，仅做兼容
        return ids.size();
    }

    @Override
    public int updatePublishStatus(List<Long> ids, Integer publishStatus) {
        // 当前模型无上架状态字段，仅做兼容
        return ids.size();
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        // 当前模型无推荐状态字段，仅做兼容
        return ids.size();
    }

    @Override
    public int updateNewStatus(List<Long> ids, Integer newStatus) {
        // 当前模型无新品状态字段，仅做兼容
        return ids.size();
    }

    @Override
    public int updateDeleteStatus(List<Long> ids, Integer deleteStatus) {
        PmsProduct record = new PmsProduct();
        record.setHidden(deleteStatus != null && deleteStatus != 0);
        PmsProductExample example = new PmsProductExample();
        example.createCriteria().andIdIn(ids.stream().map(Long::intValue).toList());
        return productMapper.updateByExampleSelective(record, example);
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
