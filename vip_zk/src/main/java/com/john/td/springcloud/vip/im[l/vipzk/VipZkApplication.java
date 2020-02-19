package com.john.td.springcloud.vipzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VipZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(VipZkApplication.class, args);
    }
}
