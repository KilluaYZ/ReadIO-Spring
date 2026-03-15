#!/usr/bin/env bash
# ReadIO 一键部署：可选构建镜像 + 应用 K8s 清单
# 用法:
#   ./deploy.sh              # 仅部署（需已构建并加载镜像）
#   ./deploy.sh --build      # 先 Podman 构建四个镜像，再部署
#   ./deploy.sh -b           # 同上
#   BUILD=1 ./deploy.sh      # 同上
#   MINIKUBE=1 ./deploy.sh   # 部署前将本地镜像导入 minikube（需先构建）
set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
K8S_FILE="${SCRIPT_DIR}/doc/k8s/all-in-one.yaml"

do_build() {
  echo "==> Building images with Podman..."
  cd "$SCRIPT_DIR"
  podman build -f Dockerfile --build-arg MODULE=readio-auth   -t readio-auth:latest .
  podman build -f Dockerfile --build-arg MODULE=readio-admin   -t readio-admin:latest .
  podman build -f Dockerfile --build-arg MODULE=readio-portal  -t readio-portal:latest .
  podman build -f Dockerfile --build-arg MODULE=readio-gateway -t readio-gateway:latest .
  echo "==> Build done."
}

do_minikube_load() {
  if command -v minikube &>/dev/null && minikube status &>/dev/null; then
    echo "==> Loading images into minikube..."
    minikube image load readio-auth:latest
    minikube image load readio-admin:latest
    minikube image load readio-portal:latest
    minikube image load readio-gateway:latest
    echo "==> Minikube load done."
  else
    echo "==> Minikube not running or not in PATH, skip image load."
  fi
}

do_deploy() {
  if [[ ! -f "$K8S_FILE" ]]; then
    echo "Error: $K8S_FILE not found." >&2
    exit 1
  fi
  echo "==> Applying $K8S_FILE ..."
  kubectl apply -f "$K8S_FILE"
  echo "==> Deploy done. Check: kubectl get pods -n readio"
}

# Parse flags
BUILD="${BUILD:-0}"
MINIKUBE="${MINIKUBE:-0}"
for arg in "$@"; do
  case "$arg" in
    --build|-b) BUILD=1 ;;
    --minikube|-m) MINIKUBE=1 ;;
  esac
done

[[ "$BUILD" == "1" ]] && do_build
[[ "$MINIKUBE" == "1" ]] && do_minikube_load
do_deploy
