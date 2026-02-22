package com.pool.readio.readiombg.mapper;

import com.pool.readio.readiombg.model.SmsFlashPromotion;
import com.pool.readio.readiombg.model.SmsFlashPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsFlashPromotionMapper {
    long countByExample(SmsFlashPromotionExample example);

    int deleteByExample(SmsFlashPromotionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotion row);

    int insertSelective(SmsFlashPromotion row);

    List<SmsFlashPromotion> selectByExample(SmsFlashPromotionExample example);

    SmsFlashPromotion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") SmsFlashPromotion row, @Param("example") SmsFlashPromotionExample example);

    int updateByExample(@Param("row") SmsFlashPromotion row, @Param("example") SmsFlashPromotionExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotion row);

    int updateByPrimaryKey(SmsFlashPromotion row);
}