package com.pool.readio.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.pool.readio.admin.dao.SmsFlashPromotionProductRelationDao;
import com.pool.readio.admin.dto.SmsFlashPromotionProduct;
import com.pool.readio.mbg.mapper.PmsProductMapper;
import com.pool.readio.mbg.mapper.SmsFlashPromotionProductRelationMapper;
import com.pool.readio.mbg.model.PmsProduct;
import com.pool.readio.mbg.model.SmsFlashPromotionProductRelation;
import com.pool.readio.mbg.model.SmsFlashPromotionProductRelationExample;
import com.pool.readio.admin.service.SmsFlashPromotionProductRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 限时购商品关联管理Service实现类
 * Created by macro on 2018/11/16.
 */
@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService {
    @Autowired
    private SmsFlashPromotionProductRelationMapper relationMapper;
    @Autowired
    private SmsFlashPromotionProductRelationDao relationDao;
    @Autowired
    private PmsProductMapper pmsProductMapper;
    @Override
    public int create(List<SmsFlashPromotionProductRelation> relationList) {
        for (SmsFlashPromotionProductRelation relation : relationList) {
            relationMapper.insert(relation);
        }
        return relationList.size();
    }

    @Override
    public int update(Long id, SmsFlashPromotionProductRelation relation) {
        relation.setId(id.intValue());
        return relationMapper.updateByPrimaryKey(relation);
    }

    @Override
    public int delete(Long id) {
        return relationMapper.deleteByPrimaryKey(id.intValue());
    }

    @Override
    public SmsFlashPromotionProductRelation getItem(Long id) {
        return relationMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return relationDao.getList(flashPromotionId,flashPromotionSessionId);
    }

    @Override
    public long getCount(Long flashPromotionId, Long flashPromotionSessionId) {
        SmsFlashPromotionProductRelationExample example = new SmsFlashPromotionProductRelationExample();
        example.createCriteria()
                .andFlashPromotionIdEqualTo(flashPromotionId.intValue())
                .andFlashPromotionSessionIdEqualTo(flashPromotionSessionId.intValue());
        return relationMapper.countByExample(example);
    }

    @Override
    public List<SmsFlashPromotionProduct> listByPromotionId(Long flashPromotionId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsFlashPromotionProductRelationExample example = new SmsFlashPromotionProductRelationExample();
        example.createCriteria().andFlashPromotionIdEqualTo(flashPromotionId.intValue());
        example.setOrderByClause("create_time DESC");
        List<SmsFlashPromotionProductRelation> relations = relationMapper.selectByExample(example);
        List<SmsFlashPromotionProduct> result = new ArrayList<>();
        for (SmsFlashPromotionProductRelation relation : relations) {
            SmsFlashPromotionProduct item = new SmsFlashPromotionProduct();
            item.setId(relation.getId());
            item.setFlashPromotionId(relation.getFlashPromotionId());
            item.setFlashPromotionSessionId(relation.getFlashPromotionSessionId());
            item.setProductId(relation.getProductId());
            item.setFlashPromotionPrice(relation.getFlashPromotionPrice());
            item.setFlashPromotionCount(relation.getFlashPromotionCount());
            item.setFlashPromotionLimit(relation.getFlashPromotionLimit());
            item.setCreateTime(relation.getCreateTime());
            if (relation.getProductId() != null) {
                PmsProduct product = pmsProductMapper.selectByPrimaryKey(relation.getProductId());
                item.setProduct(product);
            }
            result.add(item);
        }
        return result;
    }
}
