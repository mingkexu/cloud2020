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
 * @Date: 2022年01月18日 0018 22:26
 * @Version: 1.0
 */
@RestController
@RefreshScope  //支持Nacos的动态刷新
public class ConfigClientController {
    @Value("${config.info}") // 从nacos中取
    private String configInfo;

    @GetMapping("configclient/getconfiginfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
