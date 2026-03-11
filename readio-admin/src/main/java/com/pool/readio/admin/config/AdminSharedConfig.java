package com.pool.readio.admin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Admin 共享配置：仅暴露 config、dao、service、component、validator，不包含 controller。
 * 供 readio-portal 等模块 {@link org.springframework.context.annotation.Import} 使用，
 * 以复用 admin 的 Service/DAO/Config 而不加载后台管理接口。
 */
@Configuration
@ComponentScan(
    basePackages = {
        "com.pool.readio.admin.config",
        "com.pool.readio.admin.dao",
        "com.pool.readio.admin.service",
        "com.pool.readio.admin.component",
        "com.pool.readio.admin.validator"
    },
    excludeFilters = {
        @ComponentScan.Filter(
            type = FilterType.ASSIGNABLE_TYPE,
            classes = AdminSharedConfig.class
        ),
        // 在 readio-portal 中通过 AdminSharedConfig 复用 admin 的 bean 时，排除 admin 自己的 SecurityConfig，
        // 避免与 portal.config.SecurityConfig 同名冲突。
        @ComponentScan.Filter(
            type = FilterType.ASSIGNABLE_TYPE,
            classes = SecurityConfig.class
        )
    }
)
public class AdminSharedConfig {
}
