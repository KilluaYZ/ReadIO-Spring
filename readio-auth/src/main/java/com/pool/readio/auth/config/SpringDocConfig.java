package com.pool.readio.auth.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * SpringDoc相关配置
 */
@Configuration
public class SpringDocConfig implements WebMvcConfigurer {
    private static final String SECURITY_SCHEME_NAME = "Authorization";

    @Bean
    public OpenAPI mallAuthOpenAPI() {
        License license = new License().name("Apache 2.0")
                .url("https://github.com/KilluaYZ/ReadIO-Spring");
        Info info = new Info().title("ReadIO认证中心")
                .description("ReadIO认证中心相关接口文档")
                .version("v1.0.0")
                .license(license);
        ExternalDocumentation externalDocumentation = new ExternalDocumentation()
                .description("ReadIO阅读平台全套文档")
                .url("https://github.com/KilluaYZ/ReadIO-Spring");
        SecurityRequirement securityRequirement = new SecurityRequirement().addList(SECURITY_SCHEME_NAME);
        Components components = new Components().addSecuritySchemes(SECURITY_SCHEME_NAME,
                new SecurityScheme()
                        .name(SECURITY_SCHEME_NAME)
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT")
                );
        return new OpenAPI()
                .info(info)
                .externalDocs(externalDocumentation)
                .addSecurityItem(securityRequirement)
                .components(components);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //配置访问`/swagger-ui/`路径时可以直接跳转到`/swagger-ui/index.html`
        registry.addViewController("/swagger-ui/").setViewName("redirect:/swagger-ui/index.html");
    }
}
