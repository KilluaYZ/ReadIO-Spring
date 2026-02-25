package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.BmsBookReadProgress;

import java.util.List;

/**
 * 书籍阅读进度管理 Service
 * 对应数据表 bms_book_read_progress
 */
public interface BmsBookReadProgressService {

    /**
     * 获取所有阅读进度记录
     */
    List<BmsBookReadProgress> listAll();

    /**
     * 分页查询阅读进度列表
     */
    List<BmsBookReadProgress> list(Integer pageNum, Integer pageSize);

    /**
     * 根据主键ID获取阅读进度
     */
    BmsBookReadProgress getById(Integer id);

    /**
     * 根据用户ID和书籍ID查询该用户对某本书的阅读进度
     */
    BmsBookReadProgress getByMemberAndBook(Integer memberId, Integer bookId);

    /**
     * 根据书籍ID获取阅读过该书的用户进度列表（全部）
     */
    List<BmsBookReadProgress> listByBookId(Integer bookId);

    /**
     * 根据书籍ID分页获取阅读过该书的用户进度列表
     */
    List<BmsBookReadProgress> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize);

    /**
     * 根据用户ID获取该用户阅读的书籍进度列表（全部）
     */
    List<BmsBookReadProgress> listByMemberId(Integer memberId);

    /**
     * 根据用户ID分页获取该用户阅读的书籍进度列表
     */
    List<BmsBookReadProgress> listByMemberIdPage(Integer memberId, Integer pageNum, Integer pageSize);

    /**
     * 新增阅读进度
     */
    int create(BmsBookReadProgress record);

    /**
     * 根据主键更新阅读进度
     */
    int updateById(Integer id, BmsBookReadProgress record);

    /**
     * 根据用户ID和书籍ID更新该用户对某本书的阅读进度
     */
    int updateByMemberAndBook(Integer memberId, Integer bookId, BmsBookReadProgress record);

    /**
     * 根据主键删除阅读进度
     */
    int deleteById(Integer id);
}
