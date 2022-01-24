package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: ConfigClientController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月16日 0016 16:30
 * @Version: 1.0
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}") // 消费 //相当于配置了config后，就把config服务端里的变量引入进来了
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
