package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: PaymentController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月23日 0023 23:12
 * @Version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping(value="/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果"+port+result);
        if(result>0){
            return new CommonResult(200,"插入成功"+port,result);
        }else{
            return  new CommonResult(444,"插入失败"+port,null);
        }
    }
    @GetMapping(value="/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果,"+port+payment+"查询成功");
        if(payment != null){
            return new CommonResult(200,"查询成功"+port,payment);
        }else{
            return  new CommonResult(444,"插入失败"+port,null);
        }
    }
    @GetMapping(value="/feign/{id}")
    public CommonResult getFeignById(@PathVariable("id")Long id){
        if(port != null){
            return new CommonResult(200,"查询成功"+port);
        }else{
            return  new CommonResult(444,"插入失败"+port,null);
        }
    }
    @Resource // 自动注入
    private DiscoveryClient discoveryClient;

    @GetMapping("/customer/discovery")
    public Object discovery(){
        //获得服务清单列表
        List<String> services = discoveryClient.getServices();
        for(String service: services){
            log.info("*****service: " + service);
        }
        // 根据具体服务进一步获得该微服务的信息
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-ORDER-SERVICE");
        for(ServiceInstance serviceInstance:instances){
            log.info(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost()
                    + "\t" + serviceInstance.getPort() + "\t" + serviceInstance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB() {
        return port;
    }

    @GetMapping("/feign/timeout")
    public String feignTimeOut(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi,I am paymentZipkin server";
    }
}
