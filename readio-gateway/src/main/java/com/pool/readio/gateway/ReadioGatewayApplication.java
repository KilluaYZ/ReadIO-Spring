package com.pool.readio.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReadioGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadioGatewayApplication.class, args);
    }

}
