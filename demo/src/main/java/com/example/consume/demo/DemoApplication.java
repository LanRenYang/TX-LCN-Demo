package com.example.consume.demo;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


//如果使用hystrix，需要在consume启动类注解上扫描fallback的bean实例，这里启动类这里需要扫描client和fallback所在的包。
// @SpringBootApplication注解上如果使用了scanBasePackages属性，则只扫描属性指定的包，如果不使用SpringBootApplication属性，则是默认扫描启动类所在的包
//  总之一句话，只要在spring容器里的bean对象，才能被使用
@SpringBootApplication(scanBasePackages = {"com.example.client.client","com.example.consume.demo"})
@EnableDiscoveryClient
@EnableFeignClients("com.example.client.client") // 启用feign客户端，告诉spring框架扫描使用了@FeignClient的客户端注册器,启用feign进行远程调用，
//@EnableHystrix
//@EnableCircuitBreaker
@EnableDistributedTransaction
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
