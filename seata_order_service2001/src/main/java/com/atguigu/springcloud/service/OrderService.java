package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: OrderService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 21:22
 * @Version: 1.0
 */
public interface OrderService {
    void create(Order order);
}
