package com.example.consume.demo.controller;

import com.example.consume.demo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RestController
public class LoginController {

   @Autowired
   private TestServiceImpl testService;

   @RequestMapping(value = "test",method = RequestMethod.GET)
   public void test() {
       testService.test();
   }






}
