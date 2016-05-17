package com.tdu.client.app.autoconfig;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:application_provider.xml"})
public class DubboProviderAutoConfiguration {

	private static final Logger logger=LoggerFactory.getLogger(DubboProviderAutoConfiguration.class);
	@PostConstruct
	public void init(){
		logger.info("dubbo provider service running...");
	}
}
