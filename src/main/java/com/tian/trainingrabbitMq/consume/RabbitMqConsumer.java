package com.tian.trainingrabbitMq.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by logan on 2019/12/27.
 */
@Component
public class RabbitMqConsumer {

    private Logger logger = LoggerFactory.getLogger(RabbitMqConsumer.class);

    @RabbitListener(queues = "repayQueue")
    @RabbitHandler
    public void repayDetail(String msgBody) {
        System.out.println("收到消息...." + msgBody);
        System.out.println("处理消息....");
        System.out.println("处理完毕...");
    }
}
