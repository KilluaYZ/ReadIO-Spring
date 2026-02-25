package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.CmsMemberPreferOneWordStatusResult;
import com.pool.readio.mbg.model.BmsOneWord;
import com.pool.readio.mbg.model.UmsMember;

import java.util.List;

/**
 * 一言（书中名言）管理 Service
 * 对应数据表 bms_one_word
 */
public interface BmsOneWordService {

    List<BmsOneWord> listAll();

    /** 分页查询，可选 bookId、content 关键字 */
    List<BmsOneWord> list(Integer bookId, String contentKeyword, Integer pageNum, Integer pageSize);

    BmsOneWord getById(Integer id);

    /** 按书籍ID查询该书的一言列表（全部） */
    List<BmsOneWord> listByBookId(Integer bookId);

    /** 按书籍ID分页查询 */
    List<BmsOneWord> listByBookIdPage(Integer bookId, Integer pageNum, Integer pageSize);

    int create(BmsOneWord record);

    int updateById(Integer id, BmsOneWord record);

    int deleteById(Integer id);

    int deleteByIds(List<Integer> ids);

    // ---------------- 用户喜好（喜欢/收藏/不喜欢）相关 ----------------

    /**
     * 增加用户对一言的喜好关系
     *
     * @param memberId   用户ID
     * @param oneWordId  一言ID
     * @param type       喜好类型：0->喜欢；1->收藏；2->不喜欢
     */
    int addMemberPrefer(Integer memberId, Integer oneWordId, Integer type);

    /**
     * 删除用户对一言的喜好关系
     */
    int removeMemberPrefer(Integer memberId, Integer oneWordId, Integer type);

    /**
     * 统计某一言在指定喜好类型下的用户数量
     */
    long countMemberPreferByOneWord(Integer oneWordId, Integer type);

    /**
     * 获取某一言在指定喜好类型下的用户列表
     */
    List<UmsMember> listMembersByOneWordAndPreferType(Integer oneWordId, Integer type);

    /**
     * 获取某个用户在指定喜好类型下的一言列表
     */
    List<BmsOneWord> listOneWordsByMemberAndPreferType(Integer memberId, Integer type);

    /**
     * 获取某个用户对指定一言的喜好状态
     */
    CmsMemberPreferOneWordStatusResult getMemberPreferStatus(Integer memberId, Integer oneWordId);
}
