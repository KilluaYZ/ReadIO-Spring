package com.pool.readio.admin.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * 显式配置 DataSource 与 SqlSessionFactory，避免受 Nacos/自动配置加载顺序影响，
 * 确保 Mapper 初始化时 SqlSessionFactory 已存在。
 */
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(Environment env) {
        String url = env.getProperty("spring.datasource.url");
        String username = env.getProperty("spring.datasource.username");
        String password = env.getProperty("spring.datasource.password");
        String driverClassName = env.getProperty("spring.datasource.driver-class-name",
                "org.postgresql.Driver");

        Objects.requireNonNull(url, "spring.datasource.url 未配置");

        com.zaxxer.hikari.HikariConfig config = new com.zaxxer.hikari.HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driverClassName);
        return new com.zaxxer.hikari.HikariDataSource(config);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        org.springframework.core.io.Resource[] mbg = resolver.getResources("classpath*:com/pool/readio/mbg/mapper/*.xml");
        org.springframework.core.io.Resource[] admin = resolver.getResources("classpath*:com/pool/readio/admin/dao/*.xml");
        factory.setMapperLocations(Stream.concat(Arrays.stream(mbg), Arrays.stream(admin)).toArray(org.springframework.core.io.Resource[]::new));
        return factory.getObject();
    }
}
