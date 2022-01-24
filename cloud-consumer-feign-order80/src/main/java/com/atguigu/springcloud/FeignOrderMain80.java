package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: FeignOrderMain80
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月26日 0026 17:15
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients   //关键注解
public class FeignOrderMain80 {
    public static void main(String[] args){
        SpringApplication.run(FeignOrderMain80.class,args);
    }
}
