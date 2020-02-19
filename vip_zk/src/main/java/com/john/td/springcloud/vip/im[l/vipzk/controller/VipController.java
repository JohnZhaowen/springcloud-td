package com.john.td.springcloud.vipzk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VipController {

	@RequestMapping("/getVip")
	public String getVip() {
		return "getVipFromZk";
	}
}
