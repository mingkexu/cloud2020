package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.domain
 * @ClassName: CommonResult
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 21:01
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