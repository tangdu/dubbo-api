package com.tdu.sample.common.util;

import org.springframework.context.ApplicationContext;

public class SpringUtil {

	private static ApplicationContext applicationContext;
	public static void setApplicationContext(ApplicationContext applicationContext) {
		SpringUtil.applicationContext = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}


	public static <T> T getBean(Class<T> clz){
		return applicationContext.getBean(clz);
	}
	
	public static Object getBean(String name){
		return applicationContext.getBean(name);
	}
	
}
