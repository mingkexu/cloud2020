package com.atguigu.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.lang.annotation.Annotation;
import java.util.Date;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.config
 * @ClassName: MyLogGateWayFilter
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2021年12月28日 0028 23:42
 * @Version: 1.0
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange,
                             GatewayFilterChain chain) {

        log.info("********** come in MyLogGateWayFilter:  "+new Date());

        String uname = exchange.getRequest().getQueryParams().getFirst("uname");

        //合法性检验
        if(uname == null) {
            log.info("*******用户名为null，非法用户，o(╥﹏╥)o，请求不被接受");
            //设置 response 状态码   因为在请求之前过滤的，so就算是返回NOT_FOUND 也不会返回错误页面
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            //完成请求调用
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);//过滤链放行
    }

    // 返回值是加载顺序，一般全局的都是第一位加载
    @Override
    public int getOrder() {
        return 0;
    }
}
