package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.MemberBookReadPermissionDto;
import com.pool.readio.admin.dto.MemberIntegrationGrowthDto;
import com.pool.readio.admin.dto.UmsMemberVipStatusDto;
import com.pool.readio.admin.service.UmsMemberService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.UmsMember;
import com.pool.readio.mbg.model.UmsMemberOwnBookRelation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "UmsMemberController", description = "会员管理")
@RequestMapping("/member")
public class UmsMemberController {

    @Autowired
    private UmsMemberService umsMemberService;

    @Operation(summary = "获取所有会员")
    @GetMapping("/listAll")
    public CommonResult<List<UmsMember>> listAll() {
        return CommonResult.success(umsMemberService.listAll());
    }

    @Operation(summary = "分页查询会员（支持按用户名或昵称模糊搜索）")
    @GetMapping("/list")
    public CommonResult<CommonPage<UmsMember>> list(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMember> list = umsMemberService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取会员")
    @GetMapping("/{id}")
    public CommonResult<UmsMember> getById(@PathVariable Integer id) {
        UmsMember item = umsMemberService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("会员不存在");
    }

    @Operation(summary = "新增会员")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UmsMember record) {
        try {
            int n = umsMemberService.create(record);
            return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
        } catch (DuplicateKeyException e) {
            return CommonResult.failed("用户名已存在");
        }
    }

    @Operation(summary = "更新会员")
    @PostMapping("/update/{id}")
    public CommonResult<Integer> update(@PathVariable Integer id, @RequestBody UmsMember record) {
        int n = umsMemberService.updateById(id, record);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "修改会员启用状态")
    @PostMapping("/updateStatus/{id}")
    public CommonResult<Integer> updateStatus(@PathVariable Integer id, @RequestParam("status") Integer status) {
        int n = umsMemberService.updateStatus(id, status);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除会员")
    @PostMapping("/delete/{id}")
    public CommonResult<Integer> delete(@PathVariable Integer id) {
        int n = umsMemberService.deleteById(id);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "获取会员已购/拥有的书籍列表（阅读权限）")
    @GetMapping("/{id}/ownedBooks")
    public CommonResult<List<UmsMemberOwnBookRelation>> getOwnedBooks(@PathVariable Integer id) {
        List<UmsMemberOwnBookRelation> list = umsMemberService.getOwnedBookRelations(id);
        return CommonResult.success(list);
    }

    @Operation(summary = "获取会员 VIP 状态（是否有效、到期时间、剩余天数）")
    @GetMapping("/{id}/vipStatus")
    public CommonResult<UmsMemberVipStatusDto> getVipStatus(@PathVariable Integer id) {
        UmsMemberVipStatusDto status = umsMemberService.getVipStatus(id);
        return CommonResult.success(status);
    }

    @Operation(summary = "阅读权限校验：判断会员是否有权阅读指定书籍（已购/有效期内或有效 VIP）")
    @GetMapping("/{memberId}/readPermission/{bookId}")
    public CommonResult<MemberBookReadPermissionDto> checkBookReadPermission(
            @PathVariable Integer memberId,
            @PathVariable Integer bookId) {
        MemberBookReadPermissionDto result = umsMemberService.checkBookReadPermission(memberId, bookId);
        return CommonResult.success(result);
    }

    @Operation(summary = "查询会员积分与成长值汇总（统计用）")
    @GetMapping("/{id}/integrationGrowth")
    public CommonResult<MemberIntegrationGrowthDto> getIntegrationGrowth(@PathVariable Integer id) {
        MemberIntegrationGrowthDto dto = umsMemberService.getIntegrationGrowth(id);
        return CommonResult.success(dto);
    }

    @Operation(summary = "后台调整会员积分（正数增加、负数扣减）")
    @PostMapping("/{id}/adjustIntegration")
    public CommonResult<Integer> adjustIntegration(
            @PathVariable Integer id,
            @RequestParam("delta") int delta) {
        Integer result = umsMemberService.adjustIntegration(id, delta);
        return result != null ? CommonResult.success(result) : CommonResult.failed("调整失败或会员不存在");
    }

    @Operation(summary = "后台调整会员成长值（正数增加、负数扣减）")
    @PostMapping("/{id}/adjustGrowth")
    public CommonResult<Integer> adjustGrowth(
            @PathVariable Integer id,
            @RequestParam("delta") int delta) {
        Integer result = umsMemberService.adjustGrowth(id, delta);
        return result != null ? CommonResult.success(result) : CommonResult.failed("调整失败或会员不存在");
    }
}
