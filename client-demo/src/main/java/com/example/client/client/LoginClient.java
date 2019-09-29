package com.example.client.client;

import com.example.client.client.fallback.LoginFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "test-service",fallback = LoginFallBack.class)
@Component
public interface LoginClient {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public boolean login(@RequestParam(value = "number") String number, @RequestParam(value = "password") String password);

    @RequestMapping(value = "/testA",method = RequestMethod.GET)
    public void testA();
}
