# ReadIO 阅读平台 — 接口与数据模型覆盖分析

基于 `doc/sql/readio.sql` 中的数据模型，对现有 Admin 层 Controller 进行对照，判断接口是否充分。

---

## 一、已覆盖的数据表与接口（✅ 充分）

| 数据表 | Controller | 说明 |
|--------|------------|------|
| **BMS 书籍域** | | |
| bms_author | BmsAuthorController | 作者 CRUD + 列表/分页 |
| bms_book | BmsBookController | 书籍 CRUD、批量删除、喜好(喜欢/不喜欢/收藏) |
| bms_book_category | BmsBookCategoryController | 书籍分类 CRUD |
| bms_book_chapter | BmsBookChapterController | 章节 CRUD |
| bms_book_content_block | BmsBookContentBlockController | 内容块 CRUD |
| bms_book_footnote | BmsBookFootnoteController | 脚注 CRUD |
| bms_book_list | BmsBookListController | 书单 CRUD、书籍/成员关系、喜好 |
| bms_book_list_book_relation | （在 BmsBookListController 内） | add/remove books |
| bms_book_list_member_relation | （在 BmsBookListController 内） | add/remove members |
| bms_book_read_progress | BmsBookReadProgressController | 阅读进度 CRUD、按会员/书籍查询 |
| bms_book_select_content | BmsBookSelectContentController | 选中段落 CRUD、按会员/书籍查询、喜好由评论侧体现 |
| bms_book_select_content_item | （随 BmsBookSelectContent 业务） | 通常随主表维护 |
| bms_book_shelf | BmsBookShelfController | 书架 CRUD、按会员获取/创建、加书/移书 |
| bms_book_shelf_book_relation | （在 BmsBookShelfController 内） | add/remove books |
| bms_one_word | BmsOneWordController | 一言 CRUD、按书籍查询、喜好(点赞/收藏/不喜欢) |
| bms_publisher | BmsPublisherController | 出版社 CRUD |
| **CMS 内容/社区域** | | |
| cms_comment | CmsCommentController | 评论 CRUD、按帖子/书籍/选中查、回复、喜好 |
| cms_post | CmsPostController | 帖子 CRUD、内容块、标签、喜好 |
| cms_post_content_block | （在 CmsPostController 内） | content-block 增删 |
| cms_post_tag / cms_post_tag_relation | （在 CmsPostController 内） | tag 创建/删除/列表 |
| cms_member_prefer_* | （在各主体 Controller 内） | 书/书单/帖子/评论/一言的 like/favorite/dislike |
| **OMS 订单域** | | |
| oms_order | OmsOrderController | 订单 CRUD、按会员查询、分页 |
| **PMS 商品域** | | |
| pms_product | PmsProductController | 商品 CRUD、分页 |
| pms_product_category | PmsProductCategoryController | 商品分类 CRUD、树形 |
| **SMS 营销域** | | |
| sms_coupon | SmsCouponController | 优惠券 CRUD、绑定分类/商品 |
| sms_coupon_history | SmsCouponHistoryController | 仅列表（见下方「能力不足」） |
| sms_coupon_product_relation / _category_relation | （在 SmsCouponController 内） | binding/category, binding/product |
| sms_flash_promotion | SmsFlashPromotionController | 限时购活动 CRUD、活动下商品增删查 |
| sms_flash_promotion_log | SmsFlashPromotionLogController | 限时购通知记录 CRUD、分页 |
| sms_flash_promotion_product_relation | SmsFlashPromotionProductRelationController | 独立 CRUD |
| sms_flash_promotion_session | SmsFlashPromotionSessionController | 场次 CRUD、状态、selectList |
| **UMS 用户/权限域** | | |
| ums_admin | UmsAdminController | 注册/登录/登出、CRUD、角色分配、权限 |
| ums_admin_login_log | UmsAdminLoginLogController | 管理员登录日志 CRUD、分页 |
| ums_admin_role_relation / permission_relation | （在 UmsAdminController 内） | role/update, role 分配与移除 |
| ums_member | UmsMemberController | 会员 CRUD、状态更新 |
| ums_member_follow_relation | UmsMemberFollowRelationController | 关注关系（需确认是否有完整 CRUD/列表） |
| ums_member_level | UmsMemberLevelController | **仅 list(defaultStatus)**（见下方「能力不足」） |
| ums_menu | UmsMenuController | 菜单 CRUD、树、按父级列表、隐藏 |
| ums_permission | UmsPermissionController | 权限 CRUD |
| ums_resource | UmsResourceController | 资源 CRUD、path 映射 |
| ums_resource_category | UmsResourceCategoryController | 资源分类 CRUD |
| ums_role | UmsRoleController | 角色 CRUD、菜单/权限/资源分配 |
| ums_role_*_relation | （在 UmsRoleController 内） | allocMenu/allocPermission/allocResource |
| **存储/OSS** | | |
| （无对应表） | MinioController / OssController | 对象存储上传/策略/回调 |

---

## 二、无对应 Controller 的数据表（❌ 缺失）

以下表在库中存在且对阅读平台业务重要，但 **当前没有任何 Admin Controller 暴露接口**，仅存在 MBG 生成的 Mapper/Model。

| 数据表 | 说明 | 建议 |
|--------|------|------|
| **ums_member_own_book_relation** | 用户拥有的书本（购买/活动获得，永久或限时阅读权限） | **必须补**。订单支付成功后需写入；阅读权限校验需查询。建议：新增 `UmsMemberOwnBookRelationController` 或至少在订单/会员服务中封装「按会员查已购书籍」「写入/延长权限」等接口。 |
| **ums_member_vip_relation** | 用户 VIP 信息（会员时长） | **必须补**。购买会员商品后需写入或延长；判断是否 VIP 需查询。建议：新增 `UmsMemberVipRelationController` 或与订单/会员服务联动提供「按会员查 VIP」「开通/续期 VIP」等接口。 |
| **ums_member_rule_setting** | 会员积分/成长值规则（连续签到、消费送积分等） | **建议补**。后台需要配置规则。建议：`UmsMemberRuleSettingController`，至少 list + 按 type 查 + 更新。 |
| **ums_member_task** | 会员任务（如每日签到送积分/成长值） | **建议补**。后台需要配置任务。建议：`UmsMemberTaskController` 的 CRUD + 列表。 |
| **ums_member_tag** | 用户标签（运营打标签） | 若有运营需求则建议：`UmsMemberTagController` CRUD；并考虑「用户-标签」关系接口。 |
| **ums_member_statistics_info** | 会员统计信息（消费、订单数、收藏数等） | 多为系统自动维护，建议：至少提供「按会员查询」接口（可放在 `UmsMemberController` 或单独 Statistics 接口），便于后台看用户画像。 |
| **ums_member_login_log** | 会员登录记录 | 建议：`UmsMemberLoginLogController` 列表/分页（按 memberId、时间等），用于审计与安全。 |
| **ums_member_book_category_relation** | 会员喜欢的书籍分类（用于推荐） | 若做「偏好分类」推荐，建议：在会员或书单侧提供「设置/取消偏好分类」及「按会员查偏好分类」接口。 |
| **ums_member_member_tag_relation** | 用户与标签关系 | 若已有用户标签功能，需提供「给用户打标签/去标签」「按用户查标签」等接口。 |

---

## 三、已有 Controller 但能力不足（⚠️ 建议增强）

| Controller | 现状 | 建议 |
|------------|------|------|
| **UmsMemberLevelController** | 仅有 `list(defaultStatus)`，无 create/update/delete | 会员等级通常需后台配置，建议补充等级 CRUD（或至少 update），以及「设为默认等级」等。 |
| **UmsMemberController** | 无「会员的已购书籍」「VIP 状态」「积分/成长值」等扩展信息 | 可增加：按会员查已购书籍、VIP 到期时间、积分/成长值（或对接统计表）；若不做单独 Controller，可在会员详情/扩展接口中聚合。 |
| **SmsCouponHistoryController** | 仅有 list，无按会员、按优惠券、按使用状态等筛选 | 建议：list 支持 memberId、couponId、useStatus 等条件；若有核销/作废逻辑，可增加相应接口。 |

---

## 四、业务闭环与数据一致性

1. **订单支付 → 权益下发**  
   **已实现（Admin 层）**：在 `readio-admin` 中新增 `OrderEntitlementService`，当订单状态变为「已完成」(status=1) 时自动下发权益：  
   - **书籍/章节商品**（商品类型 0/1）：写入 `ums_member_own_book_relation`（member_id, book_id, duration=-1），若该会员已拥有该书则不再重复插入。  
   - **会员商品**（商品类型 2）：写入 `ums_member_vip_relation`（member_id, create_time, duration=商品 vip_duration 天数）。  
   触发时机：`OmsOrderService#update`、`OmsOrderService#updateNote`、`OmsOrderService#delivery` 中，当订单从非已完成变为已完成时调用 `OrderEntitlementService#grantEntitlementForCompletedOrder`。

2. **阅读权限校验**  
   **已实现（Admin 层）**：  
   - **按会员查已购书籍**：`GET /member/{id}/ownedBooks`，返回该会员在 `ums_member_own_book_relation` 的列表。  
   - **按会员查 VIP 状态**：`GET /member/{id}/vipStatus`，返回是否有效、到期时间、剩余天数（依赖 `ums_member_vip_relation`）。  
   - **统一阅读权限校验**：`GET /member/{memberId}/readPermission/{bookId}`，返回 `canRead`、`source`（OWNED/VIP/NONE）、`message`。逻辑：已购该书且在有效期内（duration=-1 或 create_time+duration 未过期）视为已购；否则若为有效 VIP 可读；否则无权限。前端/网关可直接调用该接口做权限展示与校验。

3. **积分与成长值**  
   **已实现（Admin 层）**：  
   - **规则配置**：`UmsMemberRuleSettingController`，表 `ums_member_rule_setting`。接口：`GET /memberRuleSetting/listAll`、`GET /memberRuleSetting/list?type=`（0 积分规则，1 成长值规则）、`GET /memberRuleSetting/{id}`、`POST /memberRuleSetting/create`、`POST /memberRuleSetting/update/{id}`、`POST /memberRuleSetting/delete/{id}`。  
   - **统计查询**：`GET /member/{id}/integrationGrowth` 返回当前积分、成长值、历史累计积分（`MemberIntegrationGrowthDto`）。  
   - **后台调整**：`POST /member/{id}/adjustIntegration?delta=`、`POST /member/{id}/adjustGrowth?delta=`，正数增加、负数扣减；积分增加时会同步累加 `history_integration`。  
   业务层按 rule_setting 在签到、消费等场景下更新 integration/growth 的逻辑可在 app/auth 模块中调用上述规则列表后自行计算并调用调整接口或直接写库。

---

## 五、命名与模型小问题（已修复）

- **BmsBookShelfController**：已由 `BmsBookSelfController` 重命名，与表名 `bms_book_shelf` 一致；关系表字段 `book_self_id` 仍为库表命名，未改表结构。  
- **bms_book.publish_time**：已通过迁移脚本 `doc/sql/migrations/001_rename_bms_book_pushlish_time_to_publish_time.sql` 将列 `pushlish_time` 重命名为 `publish_time`；Java 模型与 Mapper 已改为 `publishTime`/`publish_time`。**需在库中执行该迁移后**再编译运行。  
- **UmsPermissionController**：已由 `UmsPermissonController` 重命名。

---

## 六、总结与优先级

| 优先级 | 项 | 说明 |
|--------|----|------|
| **P0** | ums_member_own_book_relation、ums_member_vip_relation | 与「购买-权益-阅读权限」闭环直接相关，需有写入与查询接口，并确认订单完成后是否写入。 |
| **P1** | UmsMemberLevelController 增强、UmsMember 扩展（已购/VIP/积分等） | 运营与用户画像需要。 |
| **P1** | ums_member_rule_setting、ums_member_task | 若要做积分/任务/签到，后台需可配置。 |
| **P2** | ums_member_login_log、ums_member_statistics_info 查询 | 审计与统计。 |
| **P2** | SmsCouponHistoryController 条件查询、会员标签与偏好分类 | 按需补充。 |

整体上，**书籍、书单、帖子、评论、订单、商品、优惠券、限时购、管理员与角色权限** 等主链路已有较完整接口；**缺口主要集中在会员权益（已购书、VIP）、会员等级与规则配置、会员日志与统计**。建议优先补齐 P0，再按业务需要补 P1/P2 及命名与模型修正。
