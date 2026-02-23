package com.pool.readio.gateway.config;

import com.pool.readio.common.config.BaseRedisConfig;
import org.springframework.context.annotation.Configuration;

/**
 * 网关 Redis 配置，继承 Spring Boot 4 适配的 {@link BaseRedisConfig}。
 */
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
