package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import jdk.nashorn.internal.ir.Block;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.myhandler
 * @ClassName: CustomerBlockHandler
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月20日 0020 23:41
 * @Version: 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException--------1");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException--------2");
    }
}
