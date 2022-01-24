package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: OrderFeignController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月26日 0026 17:37
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/feign/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping("/feign/timeout")
    public String feignTimeOut(){
        //openfgign-ribbon默认1s超时
        return paymentFeignService.feignTimeOut();
    }
}
