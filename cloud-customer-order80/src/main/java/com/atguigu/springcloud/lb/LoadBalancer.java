package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.lb
 * @ClassName: LoadBalancer
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月26日 0026 16:31
 * @Version: 1.0
 */

public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
