package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: SentinelServiceMain8401
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月19日 0019 22:43
 * @Version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class SentinelServiceMain8401 {
    public static void main(String[] args){
        SpringApplication.run(SentinelServiceMain8401.class,args);
    }
}

