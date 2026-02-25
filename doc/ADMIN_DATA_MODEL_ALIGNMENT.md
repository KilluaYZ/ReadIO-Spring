# readio-admin 与数据模型对齐说明

本文档说明当前 readio-admin 中 Service/Controller 与 `doc/sql/readio.sql` 数据模型的对应关系，以及需要您确认的业务逻辑。

---

## 一致性检查结果（Controller / Service 与数据表对照）

下表为**当前**每个 Controller 及其对应 Service 与数据模型的一致性结论。

| Controller | Service | 数据表中是否存在 | 代码引用来源 | 是否一致 |
|------------|---------|------------------|--------------|----------|
| **BmsBookListController** | BmsBookListService | ✅ bms_book_list | readio-mbg + readio-common | ✅ **一致** |
| UmsAdminController | UmsAdminService | ✅ ums_admin | com.macro.mall | ❌ 应改为 readio-mbg |
| UmsRoleController | UmsRoleService | ✅ ums_role 等 | com.macro.mall | ❌ 应改为 readio-mbg |
| UmsMenuController | UmsMenuService | ✅ ums_menu | com.macro.mall | ❌ 应改为 readio-mbg |
| UmsResourceController | UmsResourceService | ✅ ums_resource | com.macro.mall | ❌ 应改为 readio-mbg |
| UmsResourceCategoryController | UmsResourceCategoryService | ✅ ums_resource_category | com.macro.mall | ❌ 应改为 readio-mbg |
| UmsMemberLevelController | UmsMemberLevelService | ✅ ums_member_level | com.macro.mall | ❌ 应改为 readio-mbg |
| PmsProductController | PmsProductService | ✅ pms_product | com.macro.mall（且含 SKU/品牌/优选区等） | ❌ 应改为 readio-mbg 并简化 |
| PmsProductCategoryController | PmsProductCategoryService | ✅ pms_product_category | com.macro.mall | ❌ 应改为 readio-mbg |
| OmsOrderController | OmsOrderService | ✅ oms_order | com.macro.mall（含操作历史等） | ❌ 应改为 readio-mbg 并简化 |
| SmsCouponController | SmsCouponService | ✅ sms_coupon | com.macro.mall | ❌ 应改为 readio-mbg |
| SmsCouponHistoryController | SmsCouponHistoryService | ✅ sms_coupon_history | com.macro.mall | ❌ 应改为 readio-mbg |
| SmsFlashPromotionController | SmsFlashPromotionService | ✅ sms_flash_promotion | com.macro.mall | ❌ 应改为 readio-mbg |
| SmsFlashPromotionSessionController | SmsFlashPromotionSessionService | ✅ sms_flash_promotion_session | com.macro.mall | ❌ 应改为 readio-mbg |
| SmsFlashPromotionProductRelationController | SmsFlashPromotionProductRelationService | ✅ sms_flash_promotion_product_relation | com.macro.mall | ❌ 应改为 readio-mbg |
| OssController | OssService | （无表，文件上传） | com.macro.mall（DTO） | ⚠️ 保留功能，DTO 可迁到 admin 或 common |
| MinioController | — | （无表） | com.macro.mall（DTO） | ⚠️ 同上 |
| **CmsSubjectController** | CmsSubjectService | ❌ **无 cms_subject 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除或改为书单** |
| **OmsCompanyAddressController** | OmsCompanyAddressService | ❌ **无 oms_company_address 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **OmsOrderReturnApplyController** | OmsOrderReturnApplyService | ❌ **无 oms_order_return_apply 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **OmsOrderReturnReasonController** | OmsOrderReturnReasonService | ❌ **无 oms_order_return_reason 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **OmsOrderSettingController** | OmsOrderSettingService | ❌ **无 oms_order_setting 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **PmsBrandController** | PmsBrandService | ❌ **无 pms_brand 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **PmsProductAttributeController** | PmsProductAttributeService | ❌ **无 pms_product_attribute 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **PmsProductAttributeCategoryController** | PmsProductAttributeCategoryService | ❌ **无 pms_product_attribute_category 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **PmsSkuStockController** | PmsSkuStockService | ❌ **无 pms_sku_stock 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **SmsHomeAdvertiseController** | SmsHomeAdvertiseService | ❌ **无 sms_home_advertise 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **SmsHomeBrandController** | SmsHomeBrandService | ❌ **无 sms_home_brand 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **SmsHomeNewProductController** | SmsHomeNewProductService | ❌ **无 sms_home_new_product 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **SmsHomeRecommendProductController** | SmsHomeRecommendProductService | ❌ **无 sms_home_recommend_product 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |
| **SmsHomeRecommendSubjectController** | SmsHomeRecommendSubjectService | ❌ **无 sms_home_recommend_subject 表** | com.macro.mall | ❌ **与数据模型不一致，建议删除** |

**小结：**

- **与数据模型一致**：仅 **BmsBookList**（书单）—— 使用 readio-mbg 且对应表存在。
- **表存在但代码未对齐**：UmsAdmin、UmsRole、UmsMenu、UmsResource、UmsResourceCategory、UmsMemberLevel、PmsProduct、PmsProductCategory、OmsOrder、SmsCoupon、SmsCouponHistory、SmsFlashPromotion、SmsFlashPromotionSession、SmsFlashPromotionProductRelation —— 共 14 组，均仍引用 `com.macro.mall`，需改为 `com.pool.readio.mbg` 并按当前表结构简化业务。
- **与数据模型不一致（表中不存在）**：CmsSubject、OmsCompanyAddress、OmsOrderReturnApply、OmsOrderReturnReason、OmsOrderSetting、PmsBrand、PmsProductAttribute、PmsProductAttributeCategory、PmsSkuStock、SmsHome* 五类 —— 共 15 组，建议删除或替换为现有表能力。
- **无表但可保留**：Oss、Minio（文件上传），仅需将 DTO 等迁出 macro.mall。

---

## 已完成的修改

1. **商品优选 → 书单**
   - 删除：`CmsPrefrenceAreaController`、`CmsPrefrenceAreaService`、`CmsPrefrenceAreaServiceImpl`（原 mall 的「商品优选区」，数据库无对应表）。
   - 新增：`BmsBookListController`、`BmsBookListService`、`BmsBookListServiceImpl`，对应表 **bms_book_list**（书单）。
   - 接口路径：`/bookList`（listAll、listVisible、getById、create、update、delete）。

2. **统一返回包**
   - 所有 Controller 中 `CommonResult` / `CommonPage` 的 import 已从 `com.macro.mall.common.api` 改为 `com.pool.readio.common.api`。

---

## 数据模型中有、且 readio-mbg 已有 Model/Mapper 的模块

| 数据表 | 说明 | 当前 admin 状态 | 建议 |
|--------|------|-----------------|------|
| **ums_admin** | 管理用户 | 使用 macro.mall 的 UmsAdmin | 改为使用 `com.pool.readio.mbg.model.UmsAdmin` 及 mbg 的 Mapper |
| **ums_role / ums_menu / ums_resource / ums_resource_category** | 角色/菜单/资源 | 同上 | 同上，逐步改为 readio-mbg |
| **ums_member_level** | 会员等级 | 同上 | 同上 |
| **pms_product / pms_product_category** | 商品/商品分类 | 使用 macro.mall，且带 SKU/属性/阶梯价等 | 按 ReadIO 简化：商品仅书籍/章节/会员，无 SKU、无 PmsBrand，需去掉优选区关联等 |
| **oms_order** | 订单 | 使用 macro.mall，含退货、操作历史等 | 表中无 oms_order_return_apply、oms_order_operate_history 等，需按表结构简化 |
| **sms_coupon / sms_coupon_history** | 优惠券 | 使用 macro.mall | 可改为 readio-mbg 的 SmsCoupon / SmsCouponHistory |
| **sms_flash_promotion / sms_flash_promotion_session** | 限时购 | 使用 macro.mall | 可改为 readio-mbg |

---

## 数据模型中「没有」的模块（原 mall 才有）

以下在 readio.sql 中**无对应表**，需您决定：删除、或改为用现有表实现类似能力。

| 原模块 | 说明 | 建议 |
|--------|------|------|
| **CmsSubject** | 专题 | 无 cms_subject 表。删除，或用「书单 bms_book_list」代替？ |
| **OmsCompanyAddress** | 公司收货地址 | 无表。删除？ |
| **OmsOrderReturnApply / OmsOrderReturnReason** | 订单退货申请、退货原因 | 无表。删除？ |
| **OmsOrderSetting** | 订单设置 | 无表。删除？ |
| **PmsBrand** | 品牌 | 无表。删除？ |
| **PmsProductAttribute / PmsProductAttributeCategory / PmsSkuStock** | 商品属性、SKU 库存 | 无表，pms_product 为简化结构。删除或仅保留商品基础 CRUD？ |
| **SmsHomeAdvertise / SmsHomeBrand / SmsHomeNewProduct / SmsHomeRecommendProduct / SmsHomeRecommendSubject** | 首页广告、品牌、新品、推荐等 | 无表。删除，或后续用书单/一言等做首页推荐？ |

---

## ReadIO 独有、建议在 admin 中新增的模块

以下表在 readio.sql 中存在，且 readio-mbg 已有对应 Model/Mapper，但 admin 目前**没有**对应 Controller/Service，建议按需新增：

| 数据表 | 说明 | 建议 |
|--------|------|------|
| **bms_author** | 作者 | 新增 BmsAuthorController / BmsAuthorService |
| **bms_book** | 书籍 | 新增 BmsBookController / BmsBookService |
| **bms_book_category** | 书籍分类 | 新增 BmsBookCategoryController / Service |
| **bms_book_chapter** | 书籍章节 | 可与书籍一起或单独管理 |
| **bms_one_word** | 一言 | 新增 BmsOneWordController / Service |
| **bms_publisher** | 出版社 | 新增 BmsPublisherController / Service |
| **bms_book_list_book_relation** | 书单-书籍关系 | 在书单详情/编辑中维护书单下的书籍列表 |
| **cms_post / cms_comment** | 帖子、评论 | 若后台需要管理社区内容，可新增 |
| **ums_member** | 会员（C 端用户） | 若后台需要管理用户，可新增 UmsMemberController / Service |

---

## 需要您确认的业务逻辑

1. **商品（pms_product）**
   - 当前代码中有「优选区商品关系」「品牌」「SKU」「阶梯价」等，数据库只有简单的 pms_product（含 book_id、chapter_id、vip_duration、price 等）。是否同意：**只保留商品基础 CRUD + 与 pms_product_category 关联**，去掉品牌、SKU、属性、阶梯价、优选区关联？

2. **订单（oms_order）**
   - 是否需要**退货/售后**？若不需要，是否删除 OmsOrderReturnApply、OmsOrderReturnReason、OmsOrderSetting 相关接口与实现？

3. **首页推荐**
   - 是否暂时**删除** SmsHomeAdvertise、SmsHomeBrand、SmsHomeNewProduct、SmsHomeRecommendProduct、SmsHomeRecommendSubject 整套接口？之后若要做「首页推荐」，是否用**书单 + 一言**等现有表来配置？

4. **CmsSubject（专题）**
   - 直接**删除**，还是希望用**书单 bms_book_list** 在后台做一个「专题」入口（实际存书单）？

5. **优先新增的 ReadIO 模块**
   - 您希望**优先**在后台支持哪些：作者、书籍、书籍分类、一言、出版社、书单-书籍关系、会员管理、帖子/评论？可以排个优先级，我按顺序实现。

确认上述问题后，可以继续做：
- 将 UmsAdmin / UmsRole / UmsMenu 等改为使用 readio-mbg；
- 简化 PmsProduct / OmsOrder 至与当前表结构一致；
- 删除或替换无表支撑的模块；
- 按优先级新增 Bms* / Cms* / UmsMember 等接口与业务逻辑。
