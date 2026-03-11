# readio-portal 业务层接口说明

Portal 面向 C 端用户，复用 admin 的 Service/DAO，仅暴露业务所需接口；不暴露后台专属的增删改（如书籍/作者/分类的创建、更新、删除等）。

## 接口前缀与端口

- 基础路径：`/portal/**`
- 默认端口：`8404`（与 admin `8402` 区分；若 8403 被占用也可用 8404）

## 分类说明

### 1. Admin 专属（Portal 不实现）

以下仅在 admin 层提供，业务层不需要：

- 作者/分类/章节/内容块/脚注/书籍/书单的 **创建、更新、删除、批量删除**
- 书单的 **添加/移除书籍、添加/移除成员**
- 阅读进度的 **全量列表、按书查所有人、按 ID 删除**
- 划线的 **全量 listAll、全局分页 list**
- 会员规则的 **新增、更新、删除**

### 2. Portal 已实现的接口

| 模块 | 路径前缀 | 说明 |
|------|----------|------|
| 作者 | `/portal/author` | listAll、list（分页）、getById |
| 书籍分类 | `/portal/bookCategory` | listAll、list、getById |
| 书籍章节 | `/portal/bookChapter` | listAll、list、getById |
| 书籍内容块 | `/portal/bookContentBlock` | listAll、list、getById |
| 书籍脚注 | `/portal/bookFootnote` | listAll、list、getById |
| 书籍 | `/portal/book` | listAll、list、getById；喜好（喜欢/不喜欢/收藏）及统计、当前用户喜欢/收藏列表 |
| 书单 | `/portal/bookList` | listVisible、listAll、list、getById；书单下书籍（含分页）；书单喜好及当前用户喜欢/收藏书单列表 |
| **书架** | `/portal/bookShelf` | 按用户获取/创建书架、书架内书籍列表（含分页）、加书/移书 |
| 阅读进度 | `/portal/bookReadProgress` | 按用户+书查进度、当前用户进度列表（含分页）、创建进度、按用户+书更新进度 |
| 划线 | `/portal/bookSelectContent` | 创建/更新/删除、按 ID 查、按用户/按书/按用户+书查询（含分页）、按书查所有用户划线 |
| **一言** | `/portal/oneWord` | listAll、list、getById、按书查一言；喜好及统计、当前用户点赞/收藏一言列表 |
| **出版社** | `/portal/publisher` | listAll、list（分页）、getById（书籍详情页展示出版社） |
| 会员规则 | `/portal/memberRuleSetting` | listAll、listByType、getById（只读） |

### 2.1 业务闭环说明

以下 C 端主流程均可由当前 Portal 接口支撑，形成闭环：

| 业务场景 | 使用的 Portal 接口 |
|----------|--------------------|
| **发现/浏览** | 分类 listAll/list → 书籍 list/getById；书单 listVisible、书单下书籍；作者 list/getById；出版社 getById（书籍详情展示出版社名） |
| **我的书架** | bookShelf getOrCreateByMember、shelf 内书籍 list、add/remove books |
| **阅读** | 书籍 getById → 章节 list（按 bookId）→ 内容块 list（按 chapterId/bookId）→ 脚注 list；阅读进度 getByMemberAndBook、create、updateByMemberAndBook；当前用户进度列表 listByMemberId |
| **划线/笔记** | bookSelectContent create/update/delete、按用户/按书/按用户+书查询 |
| **喜好** | 书籍/书单/一言 的 like/dislike/favorite 及 cancel、prefer/count、prefer/status、当前用户喜欢/收藏列表 |
| **一言/金句** | oneWord list、byBook 列表、喜好（点赞/收藏）及当前用户收藏列表 |
| **规则展示** | memberRuleSetting listAll/listByType（积分、成长值规则说明） |

若产品还有 **下单购买（商品、订单、支付）** 或 **用户资料（注册、登录、个人资料）**，需在订单/用户等模块另行提供或由网关转发到对应服务。

更细的**业务闭环**与**安全风险**分析（含 memberId 越权、划线/书架归属校验、阅读权限等）见：[doc/portal-api-analysis.md](doc/portal-api-analysis.md)。

### 3. 当前用户与 memberId

需要“当前登录用户”的接口（喜好、阅读进度、划线等）目前通过 **请求参数 `memberId`** 传入，便于联调和网关注入。

**生产环境建议**：

- 在网关或 Portal 内通过 Sa-Token（或会员 StpUtil）从登录态解析出 `memberId`，再注入到请求中或 Controller 内使用，避免由前端传 `memberId` 造成越权。
- 若已存在会员登录逻辑，可在 Portal 内增加一个 `@ControllerAdvice` 或 Filter，从 token 中取 `memberId` 并写入 `RequestAttribute`，Controller 中改为从 attribute 读取，而不是 `@RequestParam`。

## 运行与依赖

- 依赖：`readio-admin`（仅使用其 Service/DAO/Config）、`readio-mbg`、`readio-common`。
- 启动时 **不扫描** `com.pool.readio.admin.controller`：通过 `@Import(AdminSharedConfig.class)` 只加载 admin 的 config、dao、service、component、validator，**不会注册任何 admin 的 Controller**，因此接口与 Swagger 文档中仅会出现 `/portal/**`。
- API 文档标题为「ReadIO Portal」，由 `PortalSpringDocConfig` 提供并覆盖 admin 的文档配置。
- 需配置与 admin 相同的数据库、Redis（见 `src/main/resources/application.yml`），可按需接 Nacos 等配置中心。

## 编译与启动

```bash
# 编译
./gradlew :readio-portal:build

# 启动（需先启动 DB、Redis）
./gradlew :readio-portal:bootRun
```

**端口占用**：若启动报错 `BindException: 地址已在使用`，说明默认端口 8404 被占用。可先停止占用该端口的进程（如之前的 Portal 实例），或在 `application.yml` 中修改 `server.port`（如改为 8405）。

## 确认端口与 API 文档

**1. 确认 Portal 实际监听端口**  
启动后请在控制台查看日志，应出现类似：`Tomcat started on port(s): 8404 (http)`。若这里是其它端口（如 8403），请用该端口访问。

**2. API 文档地址（请按实际端口替换 `8404`）**

| 地址 | 说明 |
|------|------|
| `http://localhost:8404/doc.html` | **Knife4j 文档页**（推荐，项目使用 Knife4j） |
| `http://localhost:8404/swagger-ui.html` | SpringDoc 配置的 UI 入口 |
| `http://localhost:8404/swagger-ui/index.html` | Swagger UI 静态页 |
| `http://localhost:8404/v3/api-docs` | OpenAPI JSON，用于确认服务与文档是否正常 |

若 `http://localhost:8404/v3/api-docs` 能打开并返回 JSON，说明服务在 8404 且文档已生成，请优先试 **`/doc.html`**。若以上都打不开，请确认 Portal 已成功启动且日志中的端口与访问端口一致。
