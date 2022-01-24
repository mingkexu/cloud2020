package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.dao
 * @ClassName: StorageDao
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月23日 0023 10:40
 * @Version: 1.0
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId,@Param("count")Integer count);
}
