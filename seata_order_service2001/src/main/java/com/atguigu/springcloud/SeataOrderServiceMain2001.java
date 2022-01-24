package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: SeataOrderServiceMain2001
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 20:44
 * @Version: 1.0
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SeataOrderServiceMain2001 {
    public static void main(String[] args){
        SpringApplication.run(SeataOrderServiceMain2001.class,args);
    }
}
