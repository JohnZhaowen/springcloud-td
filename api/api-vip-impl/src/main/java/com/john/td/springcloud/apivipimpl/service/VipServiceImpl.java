package com.john.td.springcloud.apivipimpl.service;

import com.john.td.springcloud.apivip.api.VipService;
import com.john.td.springcloud.apivip.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class VipServiceImpl implements VipService {

    @Override
    public User getVip(String name) {
        log.info("会员查询服务");
        try {
            TimeUnit.MILLISECONDS.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User("John", 12);
    }
}
