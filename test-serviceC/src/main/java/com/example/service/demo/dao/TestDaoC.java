package com.example.service.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper  //  mybatis-spring-boot-starter依赖
@Component
public interface TestDaoC {

    public void test();

    public int selectById();

    public void updateAgeById(int age);
}
