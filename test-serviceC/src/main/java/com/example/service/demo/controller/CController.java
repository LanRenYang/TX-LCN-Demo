package com.example.service.demo.controller;


import com.example.service.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/testC",method = RequestMethod.GET)
    public void testC(){
        testService.test();
    }
}
