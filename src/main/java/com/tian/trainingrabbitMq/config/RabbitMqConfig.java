package com.tian.trainingrabbitMq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by logan on 2019/12/27.
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue repayQueue() {
        return new Queue("repayQueue");
    }

    @Bean
    DirectExchange syncDirectExchange() {
        return new DirectExchange("sync_exchange");
    }


    @Bean
    Binding bindingDataExchangeRepay(Queue repayQueue, DirectExchange syncDirectExchange) {
        return BindingBuilder.bind(repayQueue).to(syncDirectExchange).with("repay_route_key");
    }

}
