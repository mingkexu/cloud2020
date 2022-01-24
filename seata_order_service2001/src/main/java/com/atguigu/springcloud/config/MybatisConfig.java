package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: MybatisConfig
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 21:54
 * @Version: 1.0
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.dao"})
public class MybatisConfig {
}
