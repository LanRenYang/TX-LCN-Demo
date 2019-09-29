package com.test.service.testservice.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper  //  mybatis-spring-boot-starter依赖
@Component
public interface TestDao {

    public void test();
}
