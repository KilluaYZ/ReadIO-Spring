package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.SmsFlashPromotionProductRelation;
import com.pool.readio.readiombg.model.SmsFlashPromotionProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionProductRelationMapper {
    long countByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionProductRelation row);

    int insertSelective(SmsFlashPromotionProductRelation row);

    List<SmsFlashPromotionProductRelation> selectByExample(SmsFlashPromotionProductRelationExample example);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") SmsFlashPromotionProductRelation row, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByExample(@Param("row") SmsFlashPromotionProductRelation row, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation row);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation row);
}