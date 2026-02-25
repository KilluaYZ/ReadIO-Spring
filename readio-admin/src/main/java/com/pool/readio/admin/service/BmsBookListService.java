package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookListBookRelationParam;
import com.pool.readio.admin.dto.BmsBookListMemberRelationParam;
import com.pool.readio.admin.dto.BmsBookListQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookListStatusResult;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookList;
import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 书单管理 Service
 * 对应数据表 bms_book_list
 */
public interface BmsBookListService {

    /**
     * 获取所有书单（含隐藏）
     */
    List<BmsBookList> listAll();

    /**
     * 仅获取未隐藏的书单（如前台展示用）
     */
    List<BmsBookList> listVisible();

    /**
     * 分页条件查询书单列表
     */
    List<BmsBookList> list(BmsBookListQueryParam queryParam, Integer pageNum, Integer pageSize);

    BmsBookList getById(Integer id);

    int create(BmsBookList record);

    int updateById(Integer id, BmsBookList record);

    int deleteById(Integer id);

    /**
     * 批量删除书单
     */
    int deleteByIds(List<Integer> ids);

    /**
     * 批量从书单中添加书籍
     */
    int addBooksToList(BmsBookListBookRelationParam record);

    /**
     * 批量从书单中移除书籍
     */
    int removeBooksFromList(BmsBookListBookRelationParam record);

    /**
     * 批量添加成员到书单
     */
    int addMembersToList(BmsBookListMemberRelationParam record);

    /**
     * 批量从书单中移除成员
     */
    int removeMembersFromList(BmsBookListMemberRelationParam record);

    /**
     * 返回该书单下的所有书籍（按加入书单顺序）
     */
    List<BmsBook> listBooksByBookListId(Integer bookListId);

    /**
     * 分页返回该书单下的书籍
     */
    List<BmsBook> listBooksByBookListIdPage(Integer bookListId, Integer pageNum, Integer pageSize);

    /**
     * 返回该书单下的所有成员（按加入书单顺序）
     */
    List<UmsMember> listMembersByBookListId(Integer bookListId);

    /**
     * 分页返回该书单下的成员
     */
    List<UmsMember> listMembersByBookListIdPage(Integer bookListId, Integer pageNum, Integer pageSize);

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    /**
     * 增加用户对书单的喜好关系
     *
     * @param memberId   用户ID
     * @param bookListId 书单ID
     * @param type       喜好类型：0->喜欢；1->收藏；2->不喜欢
     */
    int addMemberPrefer(Integer memberId, Integer bookListId, Integer type);

    /**
     * 删除用户对书单的喜好关系
     */
    int removeMemberPrefer(Integer memberId, Integer bookListId, Integer type);

    /**
     * 统计某书单在指定喜好类型下的用户数量
     */
    long countMemberPreferByBookList(Integer bookListId, Integer type);

    /**
     * 获取某书单在指定喜好类型下的用户列表
     */
    List<UmsMember> listMembersByBookListAndPreferType(Integer bookListId, Integer type);

    /**
     * 获取某个用户在指定喜好类型下的书单列表
     */
    List<BmsBookList> listBookListsByMemberAndPreferType(Integer memberId, Integer type);

    /**
     * 获取某个用户对指定书单的喜好状态
     *
     * @param memberId   用户ID
     * @param bookListId 书单ID
     * @return 包含是否喜欢/收藏/不喜欢的状态
     */
    CmsMemberPreferBookListStatusResult getMemberPreferStatus(Integer memberId, Integer bookListId);
}

