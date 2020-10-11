package com.itheima.rabbitmq.listener;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class SpringQueueListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println(message.getBody());
    }
}
