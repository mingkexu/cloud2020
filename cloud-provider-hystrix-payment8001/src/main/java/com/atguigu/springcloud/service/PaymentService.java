package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月27日 0027 21:10
 * @Version: 1.0
 */
@Service
public class PaymentService {

    /* 可以正常访问的方法*/
    public String paymentinfo_Ok(Integer id){
        return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_OK，id:" + id;
    }

    /* 超时访问的方法 */
    //服务降级配置
//    @HystrixCommand(fallbackMethod = "paymentinfo_TimeoutHandler",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",//时间单位
//                    value="1500")
//    })
    public String paymentinfo_Timeout(Integer id){
        int interTime = 5;
        int a = 10/0;
//        try{
//            TimeUnit.SECONDS.sleep(interTime);//模拟超时
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return "线程池：" + Thread.currentThread().getName() + "--paymentInfo_Timeout，id:" + id +
                "耗时" + interTime + "秒钟--";
    }
    // 兜底方法
//    public String paymentinfo_TimeoutHandler(Integer id){// 回调函数向调用方返回一个符合预期的、可处理的备选响应
//        return "线程池:  "+Thread.currentThread().getName()+"  8001系统繁忙或者运行报错，请稍后再试,id:  "+id+"\t"+"o(╥﹏╥)o";
//    }
    //=====服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
            }) // 在10s内10次请求有60%失败 // 先看次数，再看百分比
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id < 0) {
            throw new RuntimeException("******id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();// 等价于UUID.randomUUID().toString(); //pom中有hutool-all

        return Thread.currentThread().getName()+"\t"+"调用成功，流水号: " + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){//服务降级
        return "id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " +id;
    }
}
