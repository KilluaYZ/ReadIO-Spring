package com.pool.readio.portal.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Schema(description = "会员个人资料（脱敏，不包含密码）")
public class MemberProfileDto {

    private Integer id;
    private String username;
    private String nickname;
    private String phone;
    private String email;
    private Boolean status;
    private Date createTime;
    private String icon;
    private Integer gender;
    private Date birthday;
    private String city;
    private String personalizedSignature;
    private Integer integration;
    private Integer growth;
}

