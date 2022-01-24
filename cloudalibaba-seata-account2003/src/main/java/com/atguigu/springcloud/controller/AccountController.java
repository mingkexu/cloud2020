package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: AccountController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月23日 0023 11:29
 * @Version: 1.0
 */
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;
    @RequestMapping("/account/decrease")
    public CommonResult decrease(Long userId,BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账号金额成功");
    }
}
