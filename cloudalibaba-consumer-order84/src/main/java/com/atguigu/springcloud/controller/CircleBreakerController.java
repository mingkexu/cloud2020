package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: CircleBreakerController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 10:34
 * @Version: 1.0
 */
@RestController
@Slf4j
public class CircleBreakerController {
    private static final String PAYMENT_URL="http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;
    @SentinelResource(value = "fallback",
            fallback = "handleFallback",//fallback只处理业务异常
            blockHandler = "handleblockHandler"
//            ,exceptionsToIgnore = {IllegalArgumentException.class}
            )
    @GetMapping("/consutomer/payment/get/{id}")
//    @SentinelResource(value = "fallback", blockHandler = "handleblockHandler")
    public CommonResult getPayment(@PathVariable("id")Long id){
        if(id >= 4){
            throw new IllegalArgumentException("非法参数异常...");
        }else {
            return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        }
    }

    //====fallback
    public CommonResult handleFallback(@PathVariable("id")Long id, Throwable e){
        return new CommonResult(414, "handleFallback---非法参数异常--", e);
    }

    //====blockHandler                                       blockHandler的方法必须有这个参数
    public CommonResult handleblockHandler(@PathVariable("id")Long id, BlockException e){
        return new CommonResult(444, "handleblockHandler---非法参数异常--", e);
    }
    @Resource
    private PaymentService paymentService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult paymentSql(@PathVariable("id")Long id){
        return paymentService.paymentSql(id);
    };
}
