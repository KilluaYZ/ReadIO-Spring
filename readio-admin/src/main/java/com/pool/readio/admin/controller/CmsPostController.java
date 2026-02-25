package com.pool.readio.admin.controller;

import com.pool.readio.admin.dto.CmsPostDetail;
import com.pool.readio.admin.service.CmsPostService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.CmsPost;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "CmsPostController", description = "帖子管理")
@RequestMapping("/post")
public class CmsPostController {

    @Autowired
    private CmsPostService cmsPostService;

    @Operation(summary = "获取所有帖子")
    @GetMapping("/listAll")
    public CommonResult<List<CmsPost>> listAll() {
        return CommonResult.success(cmsPostService.listAll());
    }

    @Operation(summary = "分页获取帖子列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<CmsPost>> list(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<CmsPost> list = cmsPostService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取帖子详情（含按 order 排序的内容块列表）")
    @GetMapping("/{id}")
    public CommonResult<CmsPostDetail> getById(@PathVariable Integer id) {
        CmsPostDetail item = cmsPostService.getDetailById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("帖子不存在");
    }

    @Operation(summary = "新增帖子")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody CmsPost record) {
        int n = cmsPostService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新帖子")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody CmsPost record) {
        int n = cmsPostService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除帖子")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = cmsPostService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }
}
