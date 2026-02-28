package com.pool.readio.admin.service;

import com.pool.readio.mbg.model.UmsAdminLoginLog;

import java.util.List;

/**
 * 管理员登录日志 Service
 * 对应表 ums_admin_login_log（id, admin_id, ip, address, user_agent, create_time）
 */
public interface UmsAdminLoginLogService {

    /**
     * 新增登录日志
     */
    int create(UmsAdminLoginLog log);

    /**
     * 更新登录日志
     */
    int update(Long id, UmsAdminLoginLog log);

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
    UmsAdminLoginLog getItem(Long id);

    /**
     * 分页查询登录日志（可按 adminId、ip、address 筛选）
     */
    List<UmsAdminLoginLog> list(Long adminId, String ip, String address, Integer pageSize, Integer pageNum);
}
