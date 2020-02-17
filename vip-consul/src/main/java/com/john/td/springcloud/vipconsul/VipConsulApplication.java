package com.john.td.springcloud.vipconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VipConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(VipConsulApplication.class, args);
    }
}
