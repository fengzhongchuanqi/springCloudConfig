package com.sunsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}
	
	/**
	 * http://localhost:8762/actuator/hystrix.stream
	 * 
	 * localhost:8762/hystrix
	 *    在界面依次输入http://localhost:8762/actuator/hystrix.stream 、2000 、miya
	 *    在另一个窗口输入： http://localhost:8762/hi?name=forezp 
	 *     重新刷新hystrix.stream网页，你会看到良好的图形化界面：
	 */
}
