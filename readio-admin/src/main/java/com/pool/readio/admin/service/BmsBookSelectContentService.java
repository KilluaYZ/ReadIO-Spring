package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookSelectContentWithItems;

import java.util.List;

/**
 * 书籍选中段落（划线）管理 Service
 */
public interface BmsBookSelectContentService {

    /** 新增划线（含明细项），返回新记录主键 id */
    Integer create(BmsBookSelectContentWithItems param);

    /** 更新划线（主表 + 先删后插明细） */
    int updateById(Integer id, BmsBookSelectContentWithItems param);

    /** 根据主键删除划线（同时删明细） */
    int deleteById(Integer id);

    /** 根据主键查询划线（含明细项） */
    BmsBookSelectContentWithItems getById(Integer id);

    /** 查询某用户的所有划线（全部） */
    List<BmsBookSelectContentWithItems> listByMemberId(Integer memberId);

    /** 分页查询某用户的所有划线 */
    List<BmsBookSelectContentWithItems> listByMemberIdPage(Integer memberId, Integer pageNum, Integer pageSize);

    /** 查询某用户在某本书上的划线（全部） */
    List<BmsBookSelectContentWithItems> listByMemberIdAndBookId(Integer memberId, Integer bookId);

    /** 分页查询某用户在某本书上的划线 */
    List<BmsBookSelectContentWithItems> listByMemberIdAndBookIdPage(Integer memberId, Integer bookId, Integer pageNum, Integer pageSize);

    /** 查询某本书上所有用户的划线（全部） */
    List<BmsBookSelectContentWithItems> listByBookId(Integer bookId);

    /** 分页查询某本书上所有用户的划线 */
    List<BmsBookSelectContentWithItems> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize);

    /** 全部划线列表（全部） */
    List<BmsBookSelectContentWithItems> listAll();

    /** 分页查询全部划线 */
    List<BmsBookSelectContentWithItems> list(Integer pageNum, Integer pageSize);
}
