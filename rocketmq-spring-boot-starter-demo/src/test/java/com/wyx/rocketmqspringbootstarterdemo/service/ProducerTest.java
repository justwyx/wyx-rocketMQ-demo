package com.wyx.rocketmqspringbootstarterdemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author : Just wyx
 * @Date : 2021/2/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {
	@Resource
	private SpringProducer springProducer;

	@Test
	public void testCreateOrder() {
		springProducer.sendMsg("newTopic", "一条测试消息");
	}
}
