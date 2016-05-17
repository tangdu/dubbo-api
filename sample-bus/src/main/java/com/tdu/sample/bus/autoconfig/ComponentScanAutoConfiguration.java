package com.tdu.sample.bus.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
	basePackages={
		"com.tdu.sample.bus.facade.impl",
		"com.tdu.sample.bus.service",
		"com.tdu.sample.bus.web"
	}
)
public class ComponentScanAutoConfiguration {
}
