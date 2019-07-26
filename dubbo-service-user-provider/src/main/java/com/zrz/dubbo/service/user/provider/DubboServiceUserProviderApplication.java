package com.zrz.dubbo.service.user.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zrz
 */

@SpringBootApplication
public class DubboServiceUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceUserProviderApplication.class, args);
        // 启动 Provider 容器，注意这里的 Main 是 com.alibaba.dubbo.container 包下的
        Main.main(args);
    }

}
