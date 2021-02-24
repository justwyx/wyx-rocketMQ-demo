package com.wyx.rocketmqspringbootstarterdemo.service;

import lombok.extern.log4j.Log4j2;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author : Just wyx
 * @Date : 2021/2/24
 */
@Log4j2
@Service
@RocketMQMessageListener(topic = "${rocketmq.producer.topic}", consumerGroup = "${rocketmq.producer.group}")
public class SpringConsumer implements RocketMQListener<String> {
	@Override
	public void onMessage(String msg)
	{
		log.info("收到消息:" + msg);
	}

}
