# Nacos 配置中心使用说明

readio-admin、readio-auth、readio-gateway 已接入 Nacos 配置中心，启动时会从 Nacos 拉取远程配置并与本地 `application.yml` 合并，**Nacos 中的同名配置会覆盖本地**。

## 1. 前置条件

- 已引入依赖：`spring-cloud-starter-alibaba-nacos-config`（各服务已配置）
- 已引入 `spring-cloud-starter-bootstrap`（通过 readio-common 传递）
- 各服务 `bootstrap-dev.yml` / `bootstrap-prod.yml` 中已配置 Nacos Config 的 `server-addr` 与 `file-extension: yaml`

## 2. Nacos 中的 Data ID 规则

| 服务            | 默认拉取的配置 Data ID |
|----------------|------------------------|
| readio-admin   | `readio-admin.yaml`、`readio-admin-{profile}.yaml`（如 dev） |
| readio-auth    | `readio-auth.yaml`、`readio-auth-{profile}.yaml` |
| readio-gateway | `readio-gateway.yaml`、`readio-gateway-{profile}.yaml` |

- **Group**：不配置时使用 `DEFAULT_GROUP`。
- **配置格式**：YAML（与 `file-extension: yaml` 一致）。

## 3. 在 Nacos 控制台添加配置

1. 启动 Nacos（如本地 `http://localhost:8848/nacos`，或 docker-compose 中的 nacos 服务）。
2. 登录 Nacos 控制台 → **配置管理** → **配置列表**。
3. 点击 **+** 新建配置：
   - **Data ID**：例如 `readio-admin.yaml`（必须与上表一致）。
   - **Group**：`DEFAULT_GROUP`（或你在 bootstrap 里配置的 group）。
   - **配置格式**：YAML。
   - **配置内容**：可从本目录下的示例文件复制后按环境修改：
     - `readio-admin.yaml.example` → Nacos 中 `readio-admin.yaml`
     - `readio-auth.yaml.example` → Nacos 中 `readio-auth.yaml`
     - `readio-gateway.yaml.example` → Nacos 中 `readio-gateway.yaml`

## 4. 启动服务并激活 profile

- **本地开发**：使用 `dev` profile，Nacos 地址由 `bootstrap-dev.yml` 指定（如 `http://localhost:8848`）。
  ```bash
  # 例如
  --spring.profiles.active=dev
  ```
- **生产/容器**：使用 `prod` profile，Nacos 地址由 `bootstrap-prod.yml` 指定（如 `http://nacos-registry:8848`）。

未在 Nacos 中创建对应 Data ID 时，服务仍可启动，仅使用本地 `application.yml`。

## 5. 动态刷新（可选）

bootstrap 中已开启 `refresh-enabled: true`。对需要**运行时生效**的配置，在对应 Bean 上使用 `@RefreshScope`，Nacos 中修改并发布后，会刷新该 Bean 的配置，无需重启服务。

## 6. 多环境

- 公共配置：放在 `readio-xxx.yaml`。
- 环境专属：新建 `readio-xxx-dev.yaml`、`readio-xxx-prod.yaml`，启动时通过 `spring.profiles.active=dev/prod` 自动拉取对应 profile 的配置。

## 7. Gateway 路由 404 排查

修改 Nacos 中 `readio-gateway.yaml` 后若访问 `/readio-admin/**` 仍返回 404，可按以下步骤排查：

1. **确认路由已加载**  
   请求：`GET http://<gateway-host>:8201/actuator/gateway/routes`  
   响应中应包含 `id: readio-admin`、`uri: lb://readio-admin`、`predicates: Path=/readio-admin/**`。若没有，说明网关未加载到 Nacos 中的 `spring.cloud.gateway.routes`。

2. **修改 Nacos 后触发刷新**  
   - 方式一：`POST http://<gateway-host>:8201/actuator/refresh`（需网关已开启 `refresh-enabled: true`）。  
   - 方式二：重启 readio-gateway 进程，确保重新拉取 Nacos 配置。

3. **确认 readio-admin 已注册到同一 Nacos**  
   在 Nacos 控制台 → 服务管理 → 服务列表，查看是否有 `readio-admin` 且为健康状态。网关通过 `lb://readio-admin` 从 Nacos 发现实例，若没有实例或未注册，会无法转发。

4. **确认网关能访问 readio-admin**  
   若网关与 readio-admin 不在同一台机，需保证网关所在机器能访问 Nacos 中 readio-admin 实例的地址（IP:端口）。

## 8. readio-gateway 在 Java 25 下启动报错

使用 **Java 25** 运行 readio-gateway 时，可能看到 `UnsupportedOperationException: sun.misc.Unsafe unavailable`、`Native access (restricted methods) is not enabled` 以及 “Restricted methods will be blocked” 等日志。这是 Java 24+ 对受限 API 的约束导致的，Netty/Nacos 需要显式开启 native access。

**处理方式**：在启动 readio-gateway 的 JVM 参数中加入：

```text
--enable-native-access=ALL-UNNAMED
```

- **命令行 / Gradle**：`readio-gateway/build.gradle` 中已为 `bootRun` 配置该参数，直接执行 `./gradlew :readio-gateway:bootRun` 即可。
- **IDE（IDEA / Cursor）**：在 Run Configuration 里找到 readio-gateway，在 **VM options** 中加上上述参数后重新运行。
