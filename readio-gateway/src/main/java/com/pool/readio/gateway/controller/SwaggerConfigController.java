package com.pool.readio.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 自定义 /v3/api-docs/swagger-config 端点，兼容 Spring Framework 7。
 * <p>
 * Knife4j 4.5.0 在 PathUtils.getDefaultContextPath 中调用 {@code HttpHeaders.get(Object)}，
 * 而 Spring Framework 7 的 HttpHeaders 不再实现 MultiValueMap，导致 NoSuchMethodError。
 * 本控制器优先处理该路径，返回相同结构的 JSON，仅使用 Spring 7 兼容的 API。
 */
@RestController
@Order(-1) // 优先于 Knife4j 的端点
public class SwaggerConfigController {

    private static final String CONFIG_URL = "/v3/api-docs/swagger-config";

    private final RouteDefinitionLocator routeDefinitionLocator;
    private final Set<String> excludedServices;

    public SwaggerConfigController(
            RouteDefinitionLocator routeDefinitionLocator,
            @Value("${knife4j.gateway.discover.excluded-services:}") String excludedServices) {
        this.routeDefinitionLocator = routeDefinitionLocator;
        this.excludedServices = excludedServices == null || excludedServices.isBlank()
                ? Set.of()
                : Arrays.stream(excludedServices.split(","))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.toSet());
    }

    @GetMapping(value = CONFIG_URL, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<SwaggerConfigResponse>> swaggerConfig() {
        return routeDefinitionLocator.getRouteDefinitions()
                .filter(this::isLbRoute)
                .map(this::serviceIdFromUri)
                .filter(serviceId -> !excludedServices.contains(serviceId))
                .distinct()
                .map(serviceId -> new SwaggerConfigResponse.UrlEntry(serviceId, "/" + serviceId + "/v3/api-docs"))
                .collectList()
                .map(urls -> new SwaggerConfigResponse(CONFIG_URL, urls))
                .map(ResponseEntity::ok);
    }

    private boolean isLbRoute(RouteDefinition def) {
        URI uri = def.getUri();
        return uri != null && "lb".equalsIgnoreCase(uri.getScheme());
    }

    private String serviceIdFromUri(RouteDefinition def) {
        URI uri = def.getUri();
        String host = uri.getHost();
        return host != null ? host : def.getId();
    }

    /**
     * 与 Knife4j / Swagger UI 期望的 swagger-config 响应结构一致。
     */
    public record SwaggerConfigResponse(String configUrl, List<UrlEntry> urls) {
        public record UrlEntry(String name, String url) {}
    }
}
