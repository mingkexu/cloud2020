package com.atguigu.springcloud;

import com.atguigu.grpx.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: OrderMain80
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月25日 0025 12:07
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
//指定该负载均衡规则对哪个提供者服务使用 ， 加载自定义规则的配置类
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
public class OrderMain80 {
    public static void main(String[] args){
        SpringApplication.run(OrderMain80.class,args);
    }
}
