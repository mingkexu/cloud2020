package com.atguigu.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud
 * @ClassName: PaymentHystrixMain8001
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月27日 0027 21:08
 * @Version: 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@EnableCircuitBreaker//加上这个
public class PaymentHystrixMain8001 {
    public static void main(String[] args){
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }


    @Bean
    // 注入豪猪的servlet
    // 该servlet与服务容错本身无关
    // springboot默认路径不是/hustrix.stream，只要在自己的项目里自己配置servlet
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(streamServlet);
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.addUrlMappings("/hystrix.stream");
        servletRegistrationBean.setName("HystrixMetricsStreamServlet");
        return servletRegistrationBean;
    }

}
