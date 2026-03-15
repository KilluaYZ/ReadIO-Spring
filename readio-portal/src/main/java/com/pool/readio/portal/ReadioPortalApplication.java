package com.pool.readio.portal;

import com.pool.readio.admin.config.AdminSharedConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;

/**
 * Portal 业务层应用：仅暴露 C 端接口（/portal/**）。
 * 通过 {@link AdminSharedConfig} 复用 admin 的 Service/DAO/Config，不加载 admin 的 Controller。
 */
@SpringBootApplication
@EnableCaching
@Import(AdminSharedConfig.class)
public class ReadioPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadioPortalApplication.class, args);
    }
}
