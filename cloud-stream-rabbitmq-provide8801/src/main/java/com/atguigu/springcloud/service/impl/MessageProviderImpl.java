package com.atguigu.springcloud.service.impl;

import cn.hutool.core.lang.UUID;
import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @ProjectName: cloud2020
 * @Package: com.atguigu.springcloud.service.impl
 * @ClassName: MessageProviderImpl
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2022年01月16日 0016 22:30
 * @Version: 1.0
 */
@EnableBinding(Source.class)  // 定义消息的推送管道 output//不是和controller打交道的service,而是发送消息的推送服务类
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;//消息发送管道
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());// 绑定器
        System.out.println("******serial: " + serial);
        return null;
    }
}
