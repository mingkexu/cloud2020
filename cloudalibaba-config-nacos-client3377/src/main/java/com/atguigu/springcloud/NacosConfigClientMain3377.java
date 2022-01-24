package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: NacosConfigClientMain3377
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月18日 0018 22:21
 * @Version: 1.0
 */
@EnableDiscoveryClient // 消费
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NacosConfigClientMain3377{
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}

