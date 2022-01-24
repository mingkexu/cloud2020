package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: PaymentMain9002
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月18日 0018 21:34
 * @Version: 1.0
 */
@EnableDiscoveryClient // 注册
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PaymentMain9002 {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain9002.class,args);
    }
}
