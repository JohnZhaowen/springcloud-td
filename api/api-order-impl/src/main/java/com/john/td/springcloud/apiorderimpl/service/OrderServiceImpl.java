package com.john.td.springcloud.apiorderimpl.service;

import com.john.td.springcloud.apiorder.api.OrderService;
import com.john.td.springcloud.apivip.api.VipService;
import com.john.td.springcloud.apivip.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class OrderServiceImpl implements OrderService {

    @Autowired
    private VipService vipService;

    @Override
    @GetMapping("/getVipForOrder/{name}")
    @HystrixCommand(fallbackMethod = "getVipFallBack")
    public User getVipForOrder(@PathVariable("name") String name) {
        System.out.println("当前线程： " + Thread.currentThread().getName());
        User vip = vipService.getVip(name);
        return vip;
    }

    public User getVipFallBack(String name){
        return new User("error", -1);
    }

    @GetMapping("/hello1/{name}")
    @HystrixCommand(fallbackMethod = "getVipFallBack")
    public User hello1(@PathVariable("name") String name) {
        System.out.println("当前线程： " + Thread.currentThread().getName());
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


    @GetMapping("/hello2")
    public User hello2() {
        System.out.println("当前线程： " + Thread.currentThread().getName());
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }


}
