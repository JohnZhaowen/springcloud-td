package com.john.td.springcloud.orderfeign.controller;

import com.john.td.springcloud.orderfeign.feign.VipApiFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

	@Autowired
	private VipApiFeign vipApiFeign;

	@RequestMapping("/getOrder")
	public String getOrder() {

		log.info("订单服务调用会员服务");
		String vip = vipApiFeign.getVip();
		log.info("会员服务返回结果：[{}]", vip);
		return "会员服务返回结果：" + vip;
	}
}
