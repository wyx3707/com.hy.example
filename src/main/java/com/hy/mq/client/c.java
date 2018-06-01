package com.hy.mq.client;

import com.rabbitmq.client.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class c {

    private static String QUEUE_NAME = "WYX";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("10.32.32.35");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("user_admin");
        connectionFactory.setPassword("user_admin");
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println("waiting for message ");

        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                //super.handleDelivery(consumerTag, envelope, properties, body);
                String message = new String(body, "UTF-8");
                System.out.println(message + "-------------------");
            }
        };
        channel.basicConsume(QUEUE_NAME, true, defaultConsumer);

    }
}
