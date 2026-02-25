package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.BmsBookQueryParam;
import com.pool.readio.admin.dto.CmsMemberPreferBookStatusResult;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 书籍管理 Service，对应 bms_book
 */
public interface BmsBookService {

    List<BmsBook> listAll();

    /**
     * 分页条件查询书籍列表
     */
    List<BmsBook> list(BmsBookQueryParam queryParam, Integer pageNum, Integer pageSize);

    BmsBook getById(Integer id);

    int create(BmsBook record);

    int updateById(Integer id, BmsBook record);

    int deleteById(Integer id);

    /**
     * 批量删除书籍
     */
    int deleteByIds(List<Integer> ids);

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    /**
     * 增加用户对书籍的喜好关系
     *
     * @param memberId 用户ID
     * @param bookId   书籍ID
     * @param type     喜好类型：0->喜欢；1->收藏；2->不喜欢
     */
    int addMemberPrefer(Integer memberId, Integer bookId, Integer type);

    /**
     * 删除用户对书籍的喜好关系
     */
    int removeMemberPrefer(Integer memberId, Integer bookId, Integer type);

    /**
     * 统计某书籍在指定喜好类型下的用户数量
     */
    long countMemberPreferByBook(Integer bookId, Integer type);

    /**
     * 获取某书籍在指定喜好类型下的用户列表
     */
    List<UmsMember> listMembersByBookAndPreferType(Integer bookId, Integer type);

    /**
     * 获取某个用户在指定喜好类型下的书籍列表
     */
    List<BmsBook> listBooksByMemberAndPreferType(Integer memberId, Integer type);

    /**
     * 获取某个用户对指定书籍的喜好状态
     *
     * @param memberId 用户ID
     * @param bookId   书籍ID
     * @return 包含是否喜欢/收藏/不喜欢的状态
     */
    CmsMemberPreferBookStatusResult getMemberPreferStatus(Integer memberId, Integer bookId);
}

