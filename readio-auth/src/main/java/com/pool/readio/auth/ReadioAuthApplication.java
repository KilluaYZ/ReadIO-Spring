package com.pool.readio.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.health.DataSourceHealthContributorAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceHealthContributorAutoConfiguration.class
})
@EnableFeignClients
@EnableCaching
public class ReadioAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadioAuthApplication.class, args);
    }

}

