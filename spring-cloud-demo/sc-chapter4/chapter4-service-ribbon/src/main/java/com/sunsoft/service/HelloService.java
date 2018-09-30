package com.sunsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	/**
	 * 在hiService方法上加上@HystrixCommand注解。 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
	 * 
	 * @param name
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
	}

	/**
	 * 熔断方法直接返回了一个字符串
	 * 
	 * @param name
	 * @return 字符串为”hi,”+name+”,sorry,error!”
	 */
	public String hiError(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
