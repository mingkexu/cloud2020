package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: EurekaServerMain7002
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月25日 0025 17:43
 * @Version: 1.0
 */
// exclude ：启动时不启用 DataSource的自动配置检查
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer   // 表示它是服务注册中心
public class EurekaServerMain7002 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerMain7002.class, args);
    }
}
