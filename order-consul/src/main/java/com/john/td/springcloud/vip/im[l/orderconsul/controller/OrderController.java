package com.john.td.springcloud.orderconsul.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Slf4j
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/getOrder")
	public String getOrder() {

		log.info("订单服务调用会员服务");
		String forObject = restTemplate.getForObject("http://vip-consul/getVip", String.class);
		log.info("会员服务返回结果：[{}]", forObject);
		return "会员服务返回结果：" + forObject;
	}
}
