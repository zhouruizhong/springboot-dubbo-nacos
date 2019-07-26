package com.zrz.dubbo.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zrz.dubbo.service.user.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;

    @RequestMapping(value = "hi")
    public String sayHi() {
        return userService.sayHi();
    }

    @RequestMapping(value = "hello")
    public String sayHello(String name) {
        return userService.sayHello(name);
    }
}
