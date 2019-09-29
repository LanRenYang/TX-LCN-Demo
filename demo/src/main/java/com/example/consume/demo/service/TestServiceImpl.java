package com.example.consume.demo.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.example.client.client.CClient;
import com.example.client.client.LoginClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.beans.Transient;

@Service
public class TestServiceImpl {

    @Resource
    private LoginClient loginClient;
    @Resource
    private CClient cClient;

    @LcnTransaction
   //@TxcTransaction
    public void test() {
        System.out.println("开始——————————————————————》");
        loginClient.testA();
        cClient.testC();
        System.out.println("结束——————————————————————》");
    }

}
