package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: FeignLog
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月26日 0026 18:12
 * @Version: 1.0
 */
@Configuration
public class FeignLog {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
