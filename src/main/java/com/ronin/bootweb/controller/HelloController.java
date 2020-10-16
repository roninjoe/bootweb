package com.ronin.bootweb.controller;

import javax.annotation.Resource;

import com.ronin.bootweb.service.HelloService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

        @Resource
        private HelloService helloService;
        
        @GetMapping("/hello")
        public String hello(@RequestParam(value = "name", defaultValue="there") String name) {
                return helloService.sayHello(name);
        }

}

