package com.atguigu.grpx;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.grpx
 * @ClassName: MyselfRule
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月26日 0026 10:53
 * @Version: 1.0
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        //负载均衡规则定义为随机
        return new RandomRule();
    }
}
