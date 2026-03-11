package com.pool.readio.portal.controller;

import cn.hutool.crypto.digest.BCrypt;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.mapper.UmsMemberMapper;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberExample;
import com.pool.readio.portal.dto.MemberProfileDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Portal：会员账号与个人资料（最小可用版本）。
 * 注意：生产环境建议从 token 解析当前用户，而不是信任 memberId 参数。
 */
@RestController
@Tag(name = "Portal-会员", description = "业务层-会员登录注册与个人资料")
@RequestMapping("/portal/member")
public class PortalMemberController {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    public record MemberRegisterParam(String username, String password, String nickname) {}

    @Operation(summary = "会员注册（最小字段：用户名/密码）")
    @PostMapping("/register")
    public CommonResult<Integer> register(@RequestBody MemberRegisterParam param) {
        if (param == null || param.username() == null || param.username().isBlank()
                || param.password() == null || param.password().isBlank()) {
            return CommonResult.validateFailed("用户名和密码不能为空");
        }
        UmsMemberExample ex = new UmsMemberExample();
        ex.createCriteria().andUsernameEqualTo(param.username());
        List<UmsMember> existing = umsMemberMapper.selectByExample(ex);
        if (existing != null && !existing.isEmpty()) {
            return CommonResult.failed("用户名已存在");
        }
        UmsMember member = new UmsMember();
        member.setUsername(param.username());
        member.setPassword(BCrypt.hashpw(param.password()));
        member.setNickname(param.nickname());
        member.setStatus(true);
        member.setCreateTime(new Date());
        int n = umsMemberMapper.insertSelective(member);
        return n > 0 ? CommonResult.success(member.getId()) : CommonResult.failed("注册失败");
    }

    @Operation(summary = "获取当前会员个人资料（脱敏）")
    @GetMapping("/me")
    public CommonResult<MemberProfileDto> me(@RequestParam("memberId") Integer memberId) {
        UmsMember member = umsMemberMapper.selectByPrimaryKey(memberId);
        if (member == null) {
            return CommonResult.failed("会员不存在");
        }
        MemberProfileDto dto = MemberProfileDto.builder()
                .id(member.getId())
                .username(member.getUsername())
                .nickname(member.getNickname())
                .phone(member.getPhone())
                .email(member.getEmail())
                .status(member.getStatus())
                .createTime(member.getCreateTime())
                .icon(member.getIcon())
                .gender(member.getGender())
                .birthday(member.getBirthday())
                .city(member.getCity())
                .personalizedSignature(member.getPersonalizedSignature())
                .integration(member.getIntegration())
                .growth(member.getGrowth())
                .build();
        return CommonResult.success(dto);
    }
}

