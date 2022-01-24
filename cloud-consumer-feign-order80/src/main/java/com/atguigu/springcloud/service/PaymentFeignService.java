package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentFeignService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月26日 0026 17:30
 * @Version: 1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //服务名称，要和eureka上面的一致才行
public interface PaymentFeignService {
    //这个就是provider 的controller层的方法定义。
    @GetMapping(value = "/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

    @GetMapping("/feign/timeout")
    public String feignTimeOut();
}
