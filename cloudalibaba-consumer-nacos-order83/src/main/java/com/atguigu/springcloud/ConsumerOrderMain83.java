package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: ConsumerOrderMain83
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月18日 0018 21:53
 * @Version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient // 注册
public class ConsumerOrderMain83 {
    public static void main(String[] args){
        SpringApplication.run(ConsumerOrderMain83.class,args);
    }
}
