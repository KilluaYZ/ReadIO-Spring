# 使用 Podman 构建镜像并用 Kubernetes 部署

本文说明如何用 **Podman** 为 readio-auth、readio-admin、readio-portal、readio-gateway 构建容器镜像，并用 **Kubernetes** 部署。

## 一、前置条件

- 已安装 [Podman](https://podman.io/)
- 已安装 [kubectl](https://kubernetes.io/docs/tasks/tools/) 并配置好集群（如 minikube、OpenShift、Kind 等）
- 若集群在本地（如 minikube），需让 K8s 使用本地镜像（见下文）

## 二、用 Podman 构建镜像

在**项目根目录**（与 `Dockerfile`、`settings.gradle` 同级）执行：

```bash
# 构建四个服务镜像（按需替换 tag）
podman build -f Dockerfile --build-arg MODULE=readio-auth   -t readio-auth:latest .
podman build -f Dockerfile --build-arg MODULE=readio-admin   -t readio-admin:latest .
podman build -f Dockerfile --build-arg MODULE=readio-portal  -t readio-portal:latest .
podman build -f Dockerfile --build-arg MODULE=readio-gateway -t readio-gateway:latest .
```

若使用 **Minikube** 且希望直接用本地镜像（不推送到仓库），可先切到 minikube 的 Podman/Docker 环境再构建，这样镜像会进 minikube：

```bash
eval $(minikube podman-env)   # 或 minikube -p <profile> podman-env
# 然后再执行上面的 podman build 命令
```

或先在本机用 Podman 构建，再导入 minikube：

```bash
minikube image load readio-auth:latest
minikube image load readio-admin:latest
minikube image load readio-portal:latest
minikube image load readio-gateway:latest
```

其他集群（Kind、OpenShift 等）若使用本地镜像，请按各自文档“加载本地镜像”的方式操作。

## 三、部署到 Kubernetes

### 3.1 一键部署（推荐）

**方式一：使用脚本（构建 + 部署）**

在项目根目录执行：

```bash
# 仅部署（需已构建并加载好镜像）
./deploy.sh

# 先构建四个镜像再部署
./deploy.sh --build

# 构建后导入 minikube 再部署（适用于 minikube 集群）
./deploy.sh --build && MINIKUBE=1 ./deploy.sh
# 或分步：./deploy.sh --build；然后 minikube image load ...；最后 ./deploy.sh
```

**方式二：单文件清单**

所有资源已合并到 **`doc/k8s/all-in-one.yaml`**，一条命令即可完成部署：

```bash
kubectl apply -f doc/k8s/all-in-one.yaml
```

部署前请确保四个服务镜像（readio-auth、readio-admin、readio-portal、readio-gateway）已构建并可供集群使用（本地集群需先 `minikube image load` 或 `eval $(minikube podman-env)` 后构建）。

### 3.2 分文件清单（可选）

若希望按资源类型分文件维护，可使用 `doc/k8s/` 下按数字命名的独立文件，并按顺序 apply：

| 文件 | 说明 |
|------|------|
| `00-namespace.yaml` | 创建 `readio` 命名空间 |
| `01-configmap.yaml` | 公共配置（DB/Redis/Nacos 地址、端口等） |
| `02-secret.yaml` | 数据库与 Redis 密码（请按需修改） |
| `05-postgres.yaml` | 可选，集群内 PostgreSQL |
| `06-redis.yaml` | 可选，集群内 Redis |
| `10-nacos.yaml` | Nacos，供服务发现 |
| `20-readio-auth.yaml` | readio-auth Deployment + Service |
| `21-readio-admin.yaml` | readio-admin Deployment + Service |
| `22-readio-portal.yaml` | readio-portal Deployment + Service |
| `23-readio-gateway.yaml` | readio-gateway Deployment + Service |
| `all-in-one.yaml` | 上述全部资源合并为单文件，便于一键 apply |

若使用**集群外**的数据库或 Redis，请：

- 不要应用 `05-postgres.yaml`、`06-redis.yaml`
- 在 `01-configmap.yaml` 中把 `SPRING_DATASOURCE_URL`、`SPRING_DATA_REDIS_HOST` 等改为实际地址

**注意**：若使用 `05-postgres.yaml` 首次部署，需在 Postgres 就绪后执行建表脚本（如 `doc/sql/` 下）或通过 init Job 初始化库表。

### 3.3 分步应用（可选）

若使用分文件清单，可按顺序执行：

```bash
kubectl apply -f doc/k8s/00-namespace.yaml
kubectl apply -f doc/k8s/01-configmap.yaml
kubectl apply -f doc/k8s/02-secret.yaml
kubectl apply -f doc/k8s/05-postgres.yaml
kubectl apply -f doc/k8s/06-redis.yaml
kubectl apply -f doc/k8s/10-nacos.yaml
kubectl apply -f doc/k8s/20-readio-auth.yaml
kubectl apply -f doc/k8s/21-readio-admin.yaml
kubectl apply -f doc/k8s/22-readio-portal.yaml
kubectl apply -f doc/k8s/23-readio-gateway.yaml
```

或一次性应用整个目录：`kubectl apply -f doc/k8s/`（会包含 all-in-one.yaml 以外的分文件，可能重复应用同一资源，建议二选一：要么只用 all-in-one.yaml，要么只用分文件）。

### 3.4 暴露网关到集群外（可选）

若要从集群外访问网关，可为 readio-gateway 创建 NodePort 或 Ingress，例如：

```bash
# NodePort 示例
kubectl patch svc readio-gateway -n readio -p '{"spec": {"type": "NodePort"}}'
kubectl get svc readio-gateway -n readio
# 使用输出的 NodePort 通过 <节点IP>:<NodePort> 访问
```

## 四、配置说明

- **端口**：容器内统一使用 **8080**（由 ConfigMap 的 `SERVER_PORT` 覆盖各服务 `application.yml` 中的端口）。
- **服务发现**：各服务通过 ConfigMap 中的 `SPRING_CLOUD_NACOS_DISCOVERY_SERVER_ADDR` 注册到 Nacos，网关通过 Nacos 发现 readio-auth、readio-admin、readio-portal 等。
- **OAuth2**：ConfigMap 中已配置集群内 issuer 与 redirect-uri（`http://readio-auth:8080`、`http://readio-gateway:8080/...`）。若通过 Ingress 对外提供登录，需将 `SPRING_SECURITY_OAUTH2_AUTHORIZATIONSERVER_CLIENT_READIO_GATEWAY_REGISTRATION_REDIRECT_URIS` 和网关侧的 issuer/redirect 改为实际对外域名（如 `https://your-domain/login/oauth2/code/readio-gateway-oidc`）。
- **Secret**：`k8s/02-secret.yaml` 中数据库与 Redis 密码请按环境修改；若使用集群内 Postgres/Redis，需与 `05-postgres.yaml`、`06-redis.yaml` 中的配置一致。

## 五、常用命令

```bash
# 查看 Pod 状态
kubectl get pods -n readio

# 查看某服务日志
kubectl logs -f deployment/readio-gateway -n readio

# 重启某服务
kubectl rollout restart deployment/readio-gateway -n readio
```

按上述步骤即可完成 Podman 构建与 K8s 部署；若使用外部 Nacos/DB/Redis，只需调整 ConfigMap 与 Secret，并省略对应清单即可。
