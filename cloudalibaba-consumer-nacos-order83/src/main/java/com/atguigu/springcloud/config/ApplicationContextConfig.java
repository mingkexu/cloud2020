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
 * @Date: 2022年01月18日 0018 21:52
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {// nacos底层也是ribbon，注入RestTemplate
    @Bean
    @LoadBalanced // 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
