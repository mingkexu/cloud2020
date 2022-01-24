package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.StorageDao;
import com.atguigu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service.impl
 * @ClassName: StorageServiceImpl
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月23日 0023 10:41
 * @Version: 1.0
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId,Integer count) {
        log.info("================扣减库存==============");
        storageDao.decrease(productId,count);
        log.info("============扣减库存结束============");
    }
}
