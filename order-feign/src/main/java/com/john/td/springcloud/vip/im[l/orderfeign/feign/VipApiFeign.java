package com.john.td.springcloud.orderfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="vip")
public interface VipApiFeign {

    @RequestMapping("/getVip")
    String getVip();
}
