package com.atguigu.springcloud.service;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service
 * @ClassName: StorageService
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月23日 0023 10:41
 * @Version: 1.0
 */
public interface StorageService {
    void decrease(Long productId,Integer count);
}
