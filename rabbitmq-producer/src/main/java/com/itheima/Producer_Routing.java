package com.itheima;

import com.rabbitmq.client.ConnectionFactory;

public class Producer_Routing {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
//        connectionFactory.setHost("");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/itcast");
        connectionFactory.setUsername("heima");
        connectionFactory.setPassword("heima");
    }

}
