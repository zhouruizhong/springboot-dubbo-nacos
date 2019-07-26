package com.zrz.dubbo.service.user.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zrz.dubbo.service.user.api.UserService;
import com.zrz.dubbo.service.user.provider.api.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService = new UserServiceImpl();

    @RequestMapping(value = "hi")
    public String sayHi() {
        return "你大爷的";
    }
}
