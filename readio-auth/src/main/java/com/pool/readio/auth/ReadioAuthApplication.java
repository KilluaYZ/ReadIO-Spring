package com.pool.readio.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(excludeName = {
        "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration",
        "org.springframework.boot.jdbc.autoconfigure.health.DataSourceHealthContributorAutoConfiguration"
})
@EnableFeignClients
public class ReadioAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadioAuthApplication.class, args);
    }

}
