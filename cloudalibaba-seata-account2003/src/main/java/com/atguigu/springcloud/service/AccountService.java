package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: AccountService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月23日 0023 10:34
 * @Version: 1.0
 */
public interface AccountService {
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
