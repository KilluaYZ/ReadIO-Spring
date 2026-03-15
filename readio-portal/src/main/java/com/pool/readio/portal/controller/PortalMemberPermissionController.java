package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.MemberBookReadPermissionDto;
import com.pool.readio.admin.service.UmsMemberService;
import com.pool.readio.common.api.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Portal：阅读权限校验（已购/有效期内 或 有效 VIP）。
 */
@RestController
@Tag(name = "Portal-阅读权限", description = "业务层-阅读权限校验")
@RequestMapping("/portal/member")
public class PortalMemberPermissionController {

    private final UmsMemberService umsMemberService;

    public PortalMemberPermissionController(UmsMemberService umsMemberService) {
        this.umsMemberService = umsMemberService;
    }

    @Operation(summary = "阅读权限校验：当前用户是否可读指定书籍")
    @GetMapping("/readPermission/{bookId}")
    public CommonResult<MemberBookReadPermissionDto> readPermission(@PathVariable Integer bookId,
                                                                    @RequestParam Integer memberId) {
        MemberBookReadPermissionDto dto = umsMemberService.checkBookReadPermission(memberId, bookId);
        return CommonResult.success(dto);
    }
}

