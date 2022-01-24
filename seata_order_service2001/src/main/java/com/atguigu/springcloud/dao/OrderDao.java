package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.dao
 * @ClassName: OrderDao
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 20:56
 * @Version: 1.0
 */
@Mapper
public interface OrderDao {
    //创建订单
    void create(Order order);
    //修改订单状态；从零改为1
    void update(@Param(value = "userId") Long userId,@Param(value = "status") Integer status);
}
