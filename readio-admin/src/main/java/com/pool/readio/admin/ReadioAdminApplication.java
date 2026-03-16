package com.pool.readio.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableFeignClients
@EnableDiscoveryClient
@EnableCaching
@EnableMongoRepositories(basePackages = "com.pool.readio.mbg.mongo")
@SpringBootApplication
public class ReadioAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadioAdminApplication.class, args);
    }

}
