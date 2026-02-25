package com.pool.readio.admin.controller;

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
 * 用户书架管理 Controller
 * 对应 bms_book_shelf、bms_book_shelf_book_relation
 */
@RestController
@Tag(name = "BmsBookSelfController", description = "用户书架管理")
@RequestMapping("/bookShelf")
public class BmsBookSelfController {

    @Autowired
    private BmsBookShelfService bmsBookShelfService;

    @Operation(summary = "获取所有书架")
    @GetMapping("/listAll")
    public CommonResult<List<BmsBookShelf>> listAll() {
        return CommonResult.success(bmsBookShelfService.listAll());
    }

    @Operation(summary = "分页查询书架列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<BmsBookShelf>> list(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBookShelf> list = bmsBookShelfService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Operation(summary = "根据ID获取书架")
    @GetMapping("/{id}")
    public CommonResult<BmsBookShelf> getById(@PathVariable Integer id) {
        BmsBookShelf item = bmsBookShelfService.getById(id);
        return item != null ? CommonResult.success(item) : CommonResult.failed("书架不存在");
    }

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

    @Operation(summary = "新增书架")
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody BmsBookShelf record) {
        if (record.getMemberId() == null) {
            return CommonResult.failed("用户ID不能为空");
        }
        int n = bmsBookShelfService.create(record);
        return n > 0 ? CommonResult.success(record.getId()) : CommonResult.failed("新增失败");
    }

    @Operation(summary = "更新书架")
    @PostMapping("/update/{id}")
    public CommonResult<Void> update(@PathVariable Integer id, @RequestBody BmsBookShelf record) {
        int n = bmsBookShelfService.updateById(id, record);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("更新失败");
    }

    @Operation(summary = "删除书架")
    @PostMapping("/delete/{id}")
    public CommonResult<Void> delete(@PathVariable Integer id) {
        int n = bmsBookShelfService.deleteById(id);
        return n > 0 ? CommonResult.success(null) : CommonResult.failed("删除失败");
    }

    @Operation(summary = "批量添加书籍到书架")
    @PostMapping("/add/books")
    public CommonResult<Integer> addBooksToShelf(@RequestBody BmsBookShelfBookRelationParam param) {
        if (param.getBookShelfId() == null || param.getBookIds() == null || param.getBookIds().isEmpty()) {
            return CommonResult.failed("书架ID和书籍ID列表不能为空");
        }
        int n = bmsBookShelfService.addBooksToShelf(param);
        return CommonResult.success(n);
    }

    @Operation(summary = "批量从书架移除书籍")
    @PostMapping("/remove/books")
    public CommonResult<Integer> removeBooksFromShelf(@RequestBody BmsBookShelfBookRelationParam param) {
        if (param.getBookShelfId() == null || param.getBookIds() == null || param.getBookIds().isEmpty()) {
            return CommonResult.failed("书架ID和书籍ID列表不能为空");
        }
        int n = bmsBookShelfService.removeBooksFromShelf(param);
        return CommonResult.success(n);
    }

    @Operation(summary = "获取书架中的书籍列表（全部）")
    @GetMapping("/{shelfId}/books/listAll")
    public CommonResult<List<BmsBook>> listBooksByShelfId(@PathVariable("shelfId") Integer shelfId) {
        return CommonResult.success(bmsBookShelfService.listBooksByShelfId(shelfId));
    }

    @Operation(summary = "分页获取书架中的书籍列表")
    @GetMapping("/{shelfId}/books/list")
    public CommonResult<CommonPage<BmsBook>> listBooksByShelfIdPage(
            @PathVariable("shelfId") Integer shelfId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        List<BmsBook> list = bmsBookShelfService.listBooksByShelfIdPage(shelfId, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
