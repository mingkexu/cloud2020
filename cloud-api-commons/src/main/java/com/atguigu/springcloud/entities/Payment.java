package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.entities
 * @ClassName: Payment
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月25日 0025 13:39
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
