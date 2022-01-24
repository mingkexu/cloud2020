package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: CommonResult
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月25日 0025 12:24
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String massage;
    private T      data;

    public CommonResult(Integer code, String massage){
        this(code,massage,null);
    }
}