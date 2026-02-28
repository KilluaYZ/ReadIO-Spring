package com.pool.readio.gateway.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 为 Knife4j 网关聚合提供 {@link org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator} Bean。
 * <p>
 * Spring Cloud Gateway 5.x (gateway-server-webflux) 在部分场景下不会自动注册该 Bean，
 * 导致 Knife4j discover 策略所需的 {@code discoverClientRouteServiceConvert} 无法注入。
 * 此处显式声明该 Bean；若框架已注册则跳过，避免重复。
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE + 10)
public class GatewayDiscoveryLocatorConfig {

    @Bean
    @ConditionalOnMissingBean(DiscoveryClientRouteDefinitionLocator.class)
    public DiscoveryClientRouteDefinitionLocator discoveryClientRouteDefinitionLocator(
            org.springframework.cloud.client.discovery.ReactiveDiscoveryClient reactiveDiscoveryClient,
            DiscoveryLocatorProperties discoveryLocatorProperties) {
        return new DiscoveryClientRouteDefinitionLocator(reactiveDiscoveryClient, discoveryLocatorProperties);
    }
}
