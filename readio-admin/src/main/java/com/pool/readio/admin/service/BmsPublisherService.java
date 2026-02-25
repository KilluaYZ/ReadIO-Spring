package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.BmsPublisher;

import java.util.List;

/**
 * 出版社管理 Service
 * 对应数据表 bms_publisher
 */
public interface BmsPublisherService {

    List<BmsPublisher> listAll();

    /** 分页条件查询，可选名称、简介关键字 */
    List<BmsPublisher> list(String nameKeyword, String descriptionKeyword, Integer pageNum, Integer pageSize);

    BmsPublisher getById(Integer id);

    int create(BmsPublisher record);

    int updateById(Integer id, BmsPublisher record);

    int deleteById(Integer id);

    int deleteByIds(List<Integer> ids);
}
