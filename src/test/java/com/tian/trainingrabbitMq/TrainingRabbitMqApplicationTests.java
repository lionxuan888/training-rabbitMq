package com.tian.trainingrabbitMq;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrainingRabbitMqApplicationTests {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@Test
	public void testSend() {
		amqpTemplate.convertAndSend("sync_exchange", "repay_route_key", "hello world");
		System.out.println("消息发送成功");
	}

}