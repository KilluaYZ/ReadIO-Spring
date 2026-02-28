package com.pool.readio.admin.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.customizers.GlobalOpenApiCustomizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * SpringDoc相关配置
 * Created by macro on 2024/3/5.
 */
@Configuration
public class SpringDocConfig implements WebMvcConfigurer {

    private static final String SECURITY_SCHEME_NAME = "Authorization";

    /**
     * 文档中展示的 API 服务地址（如网关聚合文档中显示的 host）。
     * 不配置则使用当前请求 host；配置后 Knife4j 等会显示该地址。
     */
    @Value("${springdoc.servers.server-url:}")
    private String serverUrl;

    @Bean
    public OpenAPI mallAdminOpenAPI() {
        OpenAPI openAPI = new OpenAPI()
                .info(new Info().title("readio-admin后台系统")
                        .description("readio-admin后台相关接口文档")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0")
                                .url("https://github.com/KilluaYZ/ReadIO-Spring")))
                .addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME))
                .components(new Components()
                        .addSecuritySchemes(SECURITY_SCHEME_NAME,
                                new SecurityScheme()
                                        .name(SECURITY_SCHEME_NAME)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")));
        if (serverUrl != null && !serverUrl.isBlank()) {
            openAPI.addServersItem(new Server().url(serverUrl).description("API 服务地址"));
        }
        return openAPI;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //配置访问`/swagger-ui/`路径时可以直接跳转到`/swagger-ui/index.html`
        registry.addViewController("/swagger-ui/").setViewName("redirect:/swagger-ui/index.html");
    }

    @Bean
    public GlobalOpenApiCustomizer orderGlobalOpenApiCustomizer() {
        //解决Knife4j配置认证后无法自动添加认证头的问题
        return openApi -> {
            //全局添加鉴权参数
            if (openApi.getPaths() != null) {
                openApi.getPaths().forEach((s, pathItem) -> {
                    pathItem.readOperations().forEach(operation -> {
                        operation.addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME));
                    });
                });
            }
        };
    }

}

