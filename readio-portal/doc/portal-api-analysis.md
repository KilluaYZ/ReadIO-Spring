# Portal 接口分析：业务闭环与安全风险

本文档基于当前 Swagger 中暴露的 Portal 接口，从**业务闭环**和**安全风险**两方面做分析。

---

## 一、业务闭环：API 是否给全了

### 1.1 已覆盖的 C 端主流程

| 业务场景 | 所需能力 | 当前接口 | 结论 |
|----------|----------|----------|------|
| **发现/浏览** | 分类、书单、书籍列表与详情、作者、出版社 | bookCategory、bookList（listVisible/list）、book、author、publisher | ✅ 已覆盖 |
| **我的书架** | 获取/创建书架、书架内书籍、加书/移书 | bookShelf：byMember、getOrCreateByMember、shelf/books/list、add/books、remove/books | ✅ 已覆盖 |
| **阅读** | 书籍详情 → 章节 → 内容块 → 脚注；进度保存与恢复 | book、bookChapter、bookContentBlock、bookFootnote、bookReadProgress（create、byMemberAndBook、byMember/list） | ✅ 已覆盖 |
| **划线/笔记** | 新增、修改、删除、按书/按用户查看 | bookSelectContent：create、update、delete、byMemberAndBook、byMember、byBook | ✅ 已覆盖 |
| **喜好** | 书籍/书单/一言的喜欢、收藏、不喜欢及取消；统计与“我的”列表 | book/bookList/oneWord 的 prefer/*、prefer/status、prefer/count、member/prefer/likes|favorites|dislikes | ✅ 已覆盖 |
| **一言/金句** | 列表、按书查、点赞/收藏 | oneWord：list、byBook、prefer/*、member/prefer/* | ✅ 已覆盖 |
| **规则展示** | 积分、成长值规则说明 | memberRuleSetting：list、listAll、getById | ✅ 已覆盖 |

结论：**在「阅读 + 书架 + 划线 + 喜好 + 一言 + 规则展示」范围内，业务已形成闭环，API 给全了。**

### 1.2 可能缺失的能力（视产品而定）

| 能力 | 说明 | 当前落地（已补齐） |
|------|------|------|
| **阅读权限** | 书籍正文（内容块/章节内容）是否需“已购/试读”校验 | 新增 `GET /portal/member/readPermission/{bookId}?memberId=...`，复用 `UmsMemberService#checkBookReadPermission`（已购/有效期或 VIP） |
| **搜索** | 按关键词搜书/作者 | 新增 `GET /portal/search/books?keyword=...`、`GET /portal/search/authors?keyword=...`（内部调用现有 list 查询） |
| **登录/注册/个人资料** | 用户身份与资料 | 新增 `POST /sso/login`（供 `readio-auth` 调用，返回 token）；新增 `POST /portal/member/register`、`GET /portal/member/me?memberId=...`（最小可用资料接口） |
| **下单/支付/我的订单** | 购书与订单 | 新增“我的订单查询”：`GET /portal/order/listAll?memberId=...`、`GET /portal/order/list?memberId=...`、`GET /portal/order/{id}?memberId=...`；下单/支付仍需结合产品（商品/支付网关）完善 |

---

## 二、安全风险：是否有不该暴露或需加固的 API

### 2.1 高风险：必须修复

#### （1）所有带 `memberId` 的接口——越权与伪造

当前**书架、阅读进度、划线、书籍/书单/一言的喜好**等接口，均把 `memberId` 放在路径或查询参数中，由前端传入。若生产环境仍信任该参数且不校验登录身份，则：

- 任意用户可**查看**他人书架、阅读进度、划线、喜好列表；
- 任意用户可**操作**他人数据：为他人书架加书/减书、改他人阅读进度、增删改他人划线、以他人身份点赞/收藏。

**建议（必做）：**

- **生产环境禁止用“前端传 memberId”作为身份依据。** 应在网关或 Portal 内从登录态（如 Sa-Token）解析出当前用户 ID，并：
  - 要么在网关层把 `memberId` 写入请求头/属性，Portal 只读“当前用户”；
  - 要么在 Portal 内用 Filter/Interceptor/`@ControllerAdvice` 从 token 取 `memberId` 写入 `RequestAttribute`，Controller 从 attribute 读取并**忽略**请求中的 `memberId`（或仅做一致性校验）。
- 所有“按用户”的写操作（书架加书/减书、进度更新、划线 create/update/delete、喜好）**仅允许操作当前登录用户自己的数据**，即：使用的 `memberId` 必须等于 token 中的用户 ID。

README 中已说明“memberId 建议从 token 取”，但代码层尚未强制，**上线前必须落地**。

#### （2）划线 update/delete 未校验归属

- `POST /portal/bookSelectContent/update/{id}`、`POST /portal/bookSelectContent/delete/{id}` 仅根据 `id` 操作，**未校验该划线是否属于当前用户**。
- 风险：知道他人划线 ID 即可修改或删除他人笔记。

**建议：**  
在 Service 或 Controller 中先按 id 查出记录，校验 `record.getMemberId().equals(currentMemberId)`，不通过则返回 403。

#### （3）书架 add/remove 未校验书架归属

- `POST /portal/bookShelf/add/books`、`POST /portal/bookShelf/remove/books` 仅传入 `bookShelfId` 与 `bookIds`，**未校验该书架是否属于当前用户**。
- 风险：知道他人书架 ID 即可对他人书架加书/减书。

**建议：**  
在 Service 或 Controller 中根据 `bookShelfId` 查书架，校验 `shelf.getMemberId().equals(currentMemberId)`，不通过则返回 403。

---

### 2.2 中风险：产品与策略需明确

#### （4）按书查“所有用户的划线”：`byBook/{bookId}/list`、`listAll`

- 当前接口会返回**某本书下所有用户的划线**，适合“公开笔记/共读”类能力。
- 若产品期望“划线仅本人可见”，则这两类接口等于**泄露用户笔记**，应下架或改为仅返回当前用户或“仅公开”的划线。

**建议：**  
与产品确认：若不做“公开笔记”，建议移除或限制为“仅当前用户”或“仅标记为公开的划线”。

#### （5）书籍内容块/章节的阅读权限

- `bookContentBlock`、`bookChapter` 当前为按条件查询，未体现“是否已购/是否在试读范围内”的校验。
- 若书籍为付费内容，未做权限校验会导致**未付费用户拉取到正文**。

**建议：**  
若存在付费/试读逻辑，在返回正文前调用阅读权限服务（如 admin 的 `member/readPermission` 或等价逻辑），无权限则仅返回元数据或 403。

---

### 2.3 低风险 / 可接受

| 接口类型 | 说明 |
|----------|------|
| 作者、出版社、分类、书单、书籍元信息、会员规则 | 只读、公开或规则展示，对 C 端合理，无额外敏感数据即可保留。 |
| 喜好统计（prefer/count） | 聚合数量，不涉及他人身份明细，可保留。 |
| list/listAll 等列表 | 若为公开目录/列表且不包含敏感字段，可保留；注意分页与数据量。 |

---

## 三、总结与行动项

### 业务闭环

- **阅读、书架、划线、喜好、一言、规则展示**：当前 API 已形成闭环，无需为“闭环”再补接口。
- 若产品有**付费阅读、搜索、订单**等，再按需在对应服务补充或接入。

### 安全（上线前建议完成）

1. **统一身份**：所有“当前用户”相关接口的 `memberId` 仅从登录态获取，禁止信任前端传入的 `memberId` 做权限判断。
2. **划线**：update/delete 时校验划线归属当前用户；按产品决定是否保留“按书查所有用户划线”。
3. **书架**：add/remove 时校验书架归属当前用户。
4. **阅读权限**：若存在付费/试读，在内容块或阅读流程中做权限校验后再返回正文。

以上完成后，当前 Portal 暴露的接口在“业务完整性”和“安全边界”上即可满足面向用户开放的要求；后续若新增接口，可按同一标准做一次闭环与安全复核。
