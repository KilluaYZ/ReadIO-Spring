package com.pool.readio.readioportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Portal 业务层应用：复用 admin 的 Service/DAO/Config，仅暴露 C 端所需接口。
 * 排除 admin.controller 包，避免加载后台管理接口。
 */
@SpringBootApplication
@ComponentScan(
    basePackages = {"com.pool.readio.readioportal", "com.pool.readio.admin"},
    excludeFilters = @ComponentScan.Filter(
        type = FilterType.REGEX,
        pattern = "com\\.pool\\.readio\\.admin\\.controller\\..*"
    )
)
public class ReadioPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadioPortalApplication.class, args);
    }
}
