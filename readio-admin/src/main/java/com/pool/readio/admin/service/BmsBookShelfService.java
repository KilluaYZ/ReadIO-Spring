package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookShelfBookRelationParam;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookShelf;

import java.util.List;

/**
 * 用户书架管理 Service
 * 对应 bms_book_shelf、bms_book_shelf_book_relation
 */
public interface BmsBookShelfService {

    List<BmsBookShelf> listAll();

    List<BmsBookShelf> list(Integer pageNum, Integer pageSize);

    BmsBookShelf getById(Integer id);

    /** 根据用户ID获取其书架（取第一个，通常一用户一书架） */
    BmsBookShelf getByMemberId(Integer memberId);

    /** 若用户尚无书架则创建并返回 */
    BmsBookShelf getOrCreateByMemberId(Integer memberId);

    int create(BmsBookShelf record);

    int updateById(Integer id, BmsBookShelf record);

    int deleteById(Integer id);

    /** 批量添加书籍到书架 */
    int addBooksToShelf(BmsBookShelfBookRelationParam param);

    /** 批量从书架移除书籍 */
    int removeBooksFromShelf(BmsBookShelfBookRelationParam param);

    /** 获取书架中的书籍列表（全部） */
    List<BmsBook> listBooksByShelfId(Integer shelfId);

    /** 分页获取书架中的书籍列表 */
    List<BmsBook> listBooksByShelfIdPage(Integer shelfId, Integer pageNum, Integer pageSize);
}
