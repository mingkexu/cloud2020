package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service.impl
 * @ClassName: OrderServiceImpl
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 21:24
 * @Version: 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;
    @Override
    @GlobalTransactional(name = "seata-roll-back",rollbackFor = Exception.class)
    public void create(Order order) {
        //创建订单
        log.info("============创建订单===========");
        orderDao.create(order);
        //减库存
        log.info("==========减库存=========");
        storageService.decrease(order.getProductId(),order.getCount());
        //减money
        log.info("==========减money==========");
        accountService.decrease(order.getUserId(),order.getMoney());
        //修改状态
        log.info("===========修改状态===========");
        orderDao.update(order.getUserId(),0);
        log.info("============结束==============");
    }
}
