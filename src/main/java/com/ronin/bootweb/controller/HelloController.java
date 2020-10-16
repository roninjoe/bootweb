package com.ronin.bootweb.controller;

import javax.annotation.Resource;

import com.ronin.bootweb.service.HelloService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RestController
@Api("/api")
public class HelloController {

        @Resource
        private HelloService helloService;
        
        @ApiOperation(
                value = "Say Hello",
                notes="This is a simple demo endpoint to say hello to whatever name is passed in"
        )
        @GetMapping("/hello")
        public String hello(@RequestParam(value = "name", defaultValue="there") String name) {
                return helloService.sayHello(name);
        }

}

