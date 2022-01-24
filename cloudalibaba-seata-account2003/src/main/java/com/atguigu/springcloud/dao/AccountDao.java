package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.CommonResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.dao
 * @ClassName: AccountDao
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月23日 0023 10:34
 * @Version: 1.0
 */
@Mapper
public interface AccountDao{

    void decrease(@Param(value = "userId") Long userId
            , @Param(value = "money") BigDecimal money);
}
