package com.zrz.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zrz.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private String port;

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHi() {
        return "Hello Dubbo , i am from port:" + port;
    }

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
