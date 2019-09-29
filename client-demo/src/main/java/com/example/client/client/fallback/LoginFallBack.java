package com.example.client.client.fallback;

import com.example.client.client.LoginClient;
import org.springframework.stereotype.Component;

/*
服务提供者的回退实例，如果服务方法出现异常情况则返回调用方fallback方法中的内容
 */
@Component
public class LoginFallBack implements LoginClient {

    @Override
    public boolean login(String number, String password){
        return false;
    }

    public void testA(){

    }

}
