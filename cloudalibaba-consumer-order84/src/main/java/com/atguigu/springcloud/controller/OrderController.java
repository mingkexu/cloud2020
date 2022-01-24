package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: OrderController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月21日 0021 22:53
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderController {
    private static final String PAYMENT_URL="http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

//    @GetMapping("/consutomer/payment/get/{id}")
////    public CommonResult getPayment(@PathVariable("id")Long id){
////        if(id >= 4){
////            throw new IllegalArgumentException("非法参数异常...");
////        }else {
////            return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
////        }
////    }
}
