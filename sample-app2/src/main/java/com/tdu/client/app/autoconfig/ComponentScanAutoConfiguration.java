package com.tdu.client.app.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
	basePackages={
		"com.tdu.client.app.service",
		"com.tdu.client.app.web"
	}
)
public class ComponentScanAutoConfiguration {
}
