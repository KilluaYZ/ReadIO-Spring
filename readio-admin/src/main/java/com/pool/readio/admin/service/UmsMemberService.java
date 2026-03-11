package com.pool.readio.admin.service;

import com.pool.readio.admin.dto.MemberBookReadPermissionDto;
import com.pool.readio.admin.dto.MemberIntegrationGrowthDto;
import com.pool.readio.admin.dto.UmsMemberVipStatusDto;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberOwnBookRelation;
import com.pool.readio.mbg.model.UmsMemberVipRelation;

import java.util.List;

/**
 * 会员管理 Service，对应 ums_member
 */
public interface UmsMemberService {

    List<UmsMember> listAll();

    /**
     * 分页查询，支持按用户名或昵称模糊搜索
     */
    List<UmsMember> list(String keyword, Integer pageSize, Integer pageNum);

    UmsMember getById(Integer id);

    int create(UmsMember record);

    int updateById(Integer id, UmsMember record);

    int deleteById(Integer id);

    /**
     * 修改会员启用状态
     */
    int updateStatus(Integer id, Integer status);

    /**
     * 查询会员已购/拥有的书籍关系列表（阅读权限）
     */
    List<UmsMemberOwnBookRelation> getOwnedBookRelations(Integer memberId);

    /**
     * 查询会员 VIP 状态（是否有效、到期时间等）
     */
    UmsMemberVipStatusDto getVipStatus(Integer memberId);

    /**
     * 阅读权限校验：判断会员是否有权阅读指定书籍（已购且在有效期内，或为有效 VIP）
     *
     * @param memberId 会员 ID
     * @param bookId   书籍 ID
     * @return 是否有权阅读及来源（OWNED/VIP/NONE）
     */
    MemberBookReadPermissionDto checkBookReadPermission(Integer memberId, Integer bookId);

    /**
     * 后台调整会员积分（增加或扣减）
     *
     * @param memberId 会员 ID
     * @param delta    变化量，正数增加、负数扣减
     * @return 调整后的积分值，失败返回 null
     */
    Integer adjustIntegration(Integer memberId, int delta);

    /**
     * 后台调整会员成长值（增加或扣减）
     *
     * @param memberId 会员 ID
     * @param delta    变化量，正数增加、负数扣减
     * @return 调整后的成长值，失败返回 null
     */
    Integer adjustGrowth(Integer memberId, int delta);

    /**
     * 查询会员积分与成长值汇总（用于后台统计）
     */
    MemberIntegrationGrowthDto getIntegrationGrowth(Integer memberId);
}
