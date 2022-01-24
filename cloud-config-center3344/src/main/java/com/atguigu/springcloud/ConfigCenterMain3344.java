package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: ConfigCenterMain3344
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月16日 0016 14:08
 * @Version: 1.0
 */
@SpringBootApplication
@EnableConfigServer   //关键注解
public class ConfigCenterMain3344 {// 注意先去把Eureka启动起来
    public static void main(String[] args){
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}
