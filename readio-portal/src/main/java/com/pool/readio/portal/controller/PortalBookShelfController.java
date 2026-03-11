package com.pool.readio.portal.controller;

import com.pool.readio.admin.dto.BmsBookShelfBookRelationParam;
import com.pool.readio.admin.service.BmsBookShelfService;
import com.pool.readio.common.api.CommonPage;
import com.pool.readio.common.api.CommonResult;
import com.pool.readio.mbg.model.BmsBook;
import com.pool.readio.mbg.model.BmsBookShelf;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Portal：当前用户书架（我的书架）。获取/创建我的书架、书架内书籍列表、加书/移书。
 * 不暴露：全量书架列表、按 ID 删除书架等管理接口。
 */
@RestController
@Tag(name = "Portal-书架", description = "业务层-我的书架")
@RequestMapping("/portal/bookShelf")
public class PortalBookShelfController {

    @Autowired
    private BmsBookShelfService bmsBookShelfService;

    @Operation(summary = "根据用户ID获取其书架")
    @GetMapping("/byMember/{memberId}")
    public CommonResult<BmsBookShelf> getByMemberId(@PathVariable Integer memberId) {
        BmsBookShelf item = bmsBookShelfService.getByMemberId(memberId);
        return item != null ? CommonResult.success(item) : CommonResult.failed("该用户暂无书架");
    }

    @Operation(summary = "根据用户ID获取或创建书架（无则创建）")
    @PostMapping("/getOrCreateByMember/{memberId}")
    public CommonResult<BmsBookShelf> getOrCreateByMemberId(@PathVariable Integer memberId) {
        BmsBookShelf shelf = bmsBookShelfService.getOrCreateByMemberId(memberId);
        return CommonResult.success(shelf);
    }

    @Operation(summary = "获取书架中的书籍列表（全部）")
    @GetMapping("/{shelfId}/books/listAll")
    public CommonResult<List<BmsBook>> listBooksByShelfId(@PathVariable Integer shelfId) {
        return CommonResult.success(bmsBookShelfService.listBooksByShelfId(shelfId));
    }

    @Operation(summary = "分页获取书架中的书籍列表")
    @GetMapping("/{shelfId}/books/list")
    public CommonResult<CommonPage<BmsBook>> listBooksByShelfIdPage(
            @PathVariable Integer shelfId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBook> list = bmsBookShelfService.listBooksByShelfIdPage(shelfId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "批量添加书籍到书架")
    @PostMapping("/add/books")
    public CommonResult<Integer> addBooksToShelf(@RequestBody BmsBookShelfBookRelationParam param) {
        if (param.getBookShelfId() == null || param.getBookIds() == null || param.getBookIds().isEmpty()) {
            return CommonResult.failed("书架ID和书籍ID列表不能为空");
        }
        int n = bmsBookShelfService.addBooksToShelf(param);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("添加失败");
    }

    @Operation(summary = "批量从书架移除书籍")
    @PostMapping("/remove/books")
    public CommonResult<Integer> removeBooksFromShelf(@RequestBody BmsBookShelfBookRelationParam param) {
        if (param.getBookShelfId() == null || param.getBookIds() == null || param.getBookIds().isEmpty()) {
            return CommonResult.failed("书架ID和书籍ID列表不能为空");
        }
        int n = bmsBookShelfService.removeBooksFromShelf(param);
        return n > 0 ? CommonResult.success(n) : CommonResult.failed("移除失败");
    }
}
