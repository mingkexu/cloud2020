package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.domain
 * @ClassName: Order
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月22日 0022 20:58
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    //订单状态：0创建中；1已完结
    private Integer status;
}
