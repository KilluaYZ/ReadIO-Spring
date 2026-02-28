package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.SmsFlashPromotionLog;

import java.util.List;

/**
 * 限时购通知记录 Service
 */
public interface SmsFlashPromotionLogService {

    /**
     * 新增限时购通知记录
     */
    int create(SmsFlashPromotionLog log);

    /**
     * 更新限时购通知记录
     */
    int update(Long id, SmsFlashPromotionLog log);

    /**
     * 删除单条记录
     */
    int delete(Long id);

    /**
     * 批量删除记录
     */
    int delete(List<Long> ids);

    /**
     * 根据ID获取记录详情
     */
    SmsFlashPromotionLog getItem(Long id);

    /**
     * 分页查询通知记录
     */
    List<SmsFlashPromotionLog> list(Long memberId,
                                    Long productId,
                                    String memberUsername,
                                    String productName,
                                    Integer pageSize,
                                    Integer pageNum);
}

