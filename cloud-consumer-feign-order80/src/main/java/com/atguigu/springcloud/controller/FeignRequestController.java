package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.FeignRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: FeginRequestController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年04月30日 0030 20:18
 * @Version: 1.0
 */
@RestController
@Slf4j
public class FeignRequestController {
    @Autowired
    private FeignRequestService feignRequestService;

    @GetMapping("/feignRequest/{id}")
    public CommonResult getFeignClientById(@PathVariable("id") Long id){
        log.info("调用第三方接口ID={}",id);
        return feignRequestService.getFeignById(id);
    }
}
