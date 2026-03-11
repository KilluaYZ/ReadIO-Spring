package com.pool.readio.auth.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis 相关配置：扫描 readio-mbg 生成的 Mapper 接口。
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.pool.readio.mbg.mapper"})
public class MyBatisConfig {
}

