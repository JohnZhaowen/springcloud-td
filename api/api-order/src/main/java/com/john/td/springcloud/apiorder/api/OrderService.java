package com.john.td.springcloud.apiorder.api;

import com.john.td.springcloud.apivip.entity.User;
import org.springframework.web.bind.annotation.GetMapping;

public interface OrderService {

    @GetMapping("/getVipForOrder")
    User getVipForOrder(String name);
}
