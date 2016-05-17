package com.tdu.sample.dao.autoconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = { "com.tdu.sample.dao.mapper" })
public class ComponentScanAutoConfiguration {
}
