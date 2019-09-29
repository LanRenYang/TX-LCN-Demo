package com.test.service.testservice.controller;

import com.test.service.testservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public boolean login(@RequestParam(value = "number") String number, @RequestParam(value = "password") String password) {
        boolean b = false;
        if (number.equals("1021") && password.equals("1021")) {
            b = true;
        }
        return b;
    }

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/testA",method = RequestMethod.GET)
    public void testA(){
        testService.test();
    }
}
