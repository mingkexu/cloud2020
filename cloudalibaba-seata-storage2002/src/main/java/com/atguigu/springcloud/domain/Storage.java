package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.domain
 * @ClassName: Storage
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月23日 0023 10:40
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {
    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
