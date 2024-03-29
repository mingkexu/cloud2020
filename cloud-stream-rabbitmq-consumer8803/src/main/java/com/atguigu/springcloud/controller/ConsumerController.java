package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.controller
 * @ClassName: ConsumerController
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月16日 0016 23:13
 * @Version: 1.0
 */
@Component
@EnableBinding(Sink.class)
public class ConsumerController {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT) // 消费者
    public void input(Message<String> message){
        System.out.println("消费者1号，serverport: " + serverPort + "，接受到的消息：" + message.getPayload());
    }
}
