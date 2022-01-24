package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: OrderFeignHystrixMain80
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月27日 0027 22:21
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderFeignHystrixMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderFeignHystrixMain80.class,args);
    }
}
