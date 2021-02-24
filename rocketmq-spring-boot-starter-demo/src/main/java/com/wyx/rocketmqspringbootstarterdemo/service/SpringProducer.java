package com.wyx.rocketmqspringbootstarterdemo.service;

import lombok.extern.log4j.Log4j2;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : Just wyx
 * @Date : 2021/2/24
 */

@Log4j2
@Service
public class SpringProducer {

	@Resource
	private RocketMQTemplate rocketMQTemplate;

	public void sendMsg(String topic, String msg) {
		log.info("发送报文：" + msg);
		this.rocketMQTemplate.convertAndSend(topic, msg);
	}
}
