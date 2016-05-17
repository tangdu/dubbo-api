package com.tdu.app.listeners;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.tdu.sample.common.util.SpringUtil;

/**
 * 启动后监听器
 * 
 * @author tangdu
 *
 */
public class FrameworkStartedListener implements ApplicationListener<ContextRefreshedEvent> {

	private static final Logger logger = LoggerFactory.getLogger(FrameworkStartedListener.class);

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		SpringUtil.setApplicationContext(event.getApplicationContext());
		// startDubboServer();
	}

	// @TODO 由于内嵌的Tomcat不能正常启动。需要单独部署在Tomcat容器中.
	public void startDubboServer() {
		Tomcat tomcat = new Tomcat();
		System.setProperty("catalina.base", "/Users/tangdu/git/spring-boot-api/sample-app/deployer");
		try {
			logger.error("dubbo server start");
			tomcat.setPort(9999);
			tomcat.setHostname("localhost");
			tomcat.addWebapp(null, "/dubbo",
					"/Users/tangdu/git/spring-boot-api/sample-app/deployer/dubbo-admin-2.5.4.war");
			tomcat.start();
		} catch (Exception e) {
			try {
				tomcat.destroy();
			} catch (LifecycleException e1) {
				e1.printStackTrace();
			}
			logger.error("dubbo server error", e);
		}
	}

}
