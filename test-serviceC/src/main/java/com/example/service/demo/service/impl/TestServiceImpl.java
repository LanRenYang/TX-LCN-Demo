package com.example.service.demo.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.example.service.demo.dao.TestDaoC;

import com.example.service.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDaoC testDaoC;

    private ConcurrentHashMap<String, Long> ids = new ConcurrentHashMap<>();


    @TxcTransaction(propagation = DTXPropagation.SUPPORTS)
    //@LcnTransaction(propagation = DTXPropagation.SUPPORTS)
    //@TccTransaction(propagation = DTXPropagation.SUPPORTS)
    @Transactional
    public void test() {

        long age = (long) testDaoC.selectById();
        System.out.println(age + "查询---------《");
        ids.put(TracingContext.tracing().groupId(), age);

        testDaoC.test();

        int a = 10 / 0;

    }

    /**
     * 确认操作
     */
    public void confirmTest() {
        ids.remove(TracingContext.tracing().groupId());
    }

    /**
     * 取消操作
     */
    public void cancelTest() {
        int age = Math.toIntExact(ids.get(TracingContext.tracing().groupId()));
        System.out.println(age + "回滚---------《");
        testDaoC.updateAgeById(age);
    }


}
