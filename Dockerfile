# 多模块构建：通过 build-arg MODULE 指定要打包的子项目（readio-auth | readio-admin | readio-portal | readio-gateway）
# 用法: podman build -f Dockerfile --build-arg MODULE=readio-auth -t readio-auth:latest .
ARG MODULE=readio-admin
FROM eclipse-temurin:21-jdk-alpine AS builder
WORKDIR /build

ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"

# 根构建配置与 Gradle wrapper（含 gradle/libs.versions.toml）
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# 子项目（按 settings.gradle 的 include 顺序，避免漏掉依赖）
COPY readio-common readio-common
COPY readio-mbg readio-mbg
COPY readio-auth readio-auth
COPY readio-admin readio-admin
COPY readio-portal readio-portal
COPY readio-gateway readio-gateway

ARG MODULE
RUN ./gradlew :${MODULE}:bootJar --no-daemon -x test

# 运行阶段
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

ARG MODULE
COPY --from=builder /build/${MODULE}/build/libs/${MODULE}-*.jar app.jar

# Gateway 需要此 JVM 参数；其他模块设置无害
ENV JAVA_TOOL_OPTIONS="${JAVA_TOOL_OPTIONS:-} --enable-native-access=ALL-UNNAMED"

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
