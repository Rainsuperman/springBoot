package com.hand.demo.controller;

import com.hand.demo.DemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public  String hello(){
        return "hello Springboot!";
    }
}
