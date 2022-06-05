package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: FeginRequestService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年04月30日 0030 20:19
 * @Version: 1.0
 */
@FeignClient(name="FeignRequestService",url = "${feign-request.payment-api}")
public interface FeignRequestService {

    @RequestMapping(value = "/feign/{id}",method = RequestMethod.GET)
    CommonResult<Payment> getFeignById(@PathVariable("id") Long id);
}
