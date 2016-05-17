package com.tdu.sample.bus.autoconfig.dubbo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:application_comsumer.xml"})
public class DubboConsumerAutoConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(DubboConsumerAutoConfiguration.class);

	@PostConstruct
	public void init() {
		logger.info("dubbo consumer service running...");
	}
}
