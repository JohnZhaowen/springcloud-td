package com.john.td.springcloud.apiorderimpl.service;

import com.john.td.springcloud.apivip.api.VipService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="vip")
public interface VipFeign extends VipService {
}
