package com.example.client.client;

import com.example.client.client.fallback.LoginFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(name = "test-serviceC",fallback = LoginFallBack.class)
public interface CClient {

    @RequestMapping(value = "/testC",method = RequestMethod.GET)
    public void testC();
}
