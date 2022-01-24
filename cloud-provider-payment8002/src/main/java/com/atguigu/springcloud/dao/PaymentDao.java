package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.dao
 * @ClassName: PaymentDao
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月23日 0023 22:43
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
