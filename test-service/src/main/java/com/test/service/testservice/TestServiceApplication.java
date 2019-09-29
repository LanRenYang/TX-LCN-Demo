package com.test.service.testservice;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/*
注册发现服务有三种实现方式：eureka、consul、zookeeper
    @EnableEurekaClient和@EnableDiscoveryClient作用都是在注册中心注册服务，但是注册中心不是只能时候用Eureka,还可以使用别的工具代替。如：eureka、consul、zookeeper
    @EnableEurekaClient是专用做在使用Eureka做注册中心是的使用注解，使用场景单一
    @EnableDiscoveryClient是使用其他的方式实现注册中心时使用。
 */
//@EnableEurekaClient
@EnableDiscoveryClient // 推荐使用
@MapperScan(value = "com.test.service.testservice.dao")  //  只针对使用了@Mapper注解的扫描
@EnableDistributedTransaction
public class TestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
    }

}
