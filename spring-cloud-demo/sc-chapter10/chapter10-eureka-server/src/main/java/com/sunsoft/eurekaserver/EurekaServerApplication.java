package com.sunsoft.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 重要的事情说三遍：
 * 文档地址： http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/single/spring-cloud.html
 */
/**
 * D:
 * cd D:\work\sts\spring-cloud-demo\sc-chapter10\chapter10-eureka-server\target
 * java -jar chapter10-eureka-server-0.0.1-SNAPSHOT.jar ---spring.profiles.active=peer1
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication.class, args );
    }
}
