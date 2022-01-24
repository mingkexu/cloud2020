package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: ApplicationContextConfig
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月25日 0025 12:30
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {
    /*
        RestTemplate提供了多种便捷访问远程http服务的方法，
        是一种简单便捷的访问restful服务模板类，是spring提供的用于rest服务的客户端模板工具集
     */
    @Bean
    @LoadBalanced //负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
