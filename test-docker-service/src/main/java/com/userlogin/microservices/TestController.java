package com.userlogin.microservices;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@EnableDiscoveryClient
@RestController
public class TestController {

	@GetMapping("/hi")
	//@HystrixCommand(fallbackMethod="defaultSayHi")
	public String sayHi() {
/*		if(RandomUtils.nextBoolean())
		throw new RuntimeException("Failed");*/
		return "Hi";
	}
/*	
	public String defaultSayHi() {
		
		return "Default Hi";
	}
	*/
}
