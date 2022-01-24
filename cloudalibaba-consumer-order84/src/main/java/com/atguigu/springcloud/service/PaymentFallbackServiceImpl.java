package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: PaymentServiceImpl
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 11:46
 * @Version: 1.0
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentService{
    @Override
    public CommonResult paymentSql(Long id) {
        return new CommonResult(414, "open-feign 整合 sentinel 实现的全局服务降级策略",null);
    }
}
