package com.john.td.springcloud.registercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegiterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegiterCenterApplication.class, args);
    }
}
