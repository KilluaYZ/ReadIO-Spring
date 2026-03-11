package com.pool.readio.portal.service;

import cn.hutool.crypto.digest.BCrypt;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class PortalMemberAuthService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    public UmsMember getEnabledMemberByUsername(String username) {
        if (!StringUtils.hasText(username)) {
            return null;
        }
        UmsMemberExample ex = new UmsMemberExample();
        ex.createCriteria().andUsernameEqualTo(username).andStatusEqualTo(true);
        List<UmsMember> list = umsMemberMapper.selectByExample(ex);
        return (list != null && !list.isEmpty()) ? list.get(0) : null;
    }

    public boolean verifyPassword(String rawPassword, String storedPassword) {
        if (!StringUtils.hasText(rawPassword) || !StringUtils.hasText(storedPassword)) {
            return false;
        }
        // 兼容两种存储：BCrypt 哈希 或 明文（历史数据/开发环境）
        if (storedPassword.startsWith("$2a$") || storedPassword.startsWith("$2b$") || storedPassword.startsWith("$2y$")) {
            try {
                return BCrypt.checkpw(rawPassword, storedPassword);
            } catch (Exception ignored) {
                return false;
            }
        }
        return rawPassword.equals(storedPassword);
    }
}

