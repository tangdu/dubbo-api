package com.tdu.app.test;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.core.StandardServer;
import org.apache.catalina.startup.Tomcat;
import org.junit.Test;

public class DubboTomcatTest {

	@Test
	public void run() {
		Tomcat tomcat = new Tomcat();
		System.setProperty("catalina.base", "/Users/tangdu/git/spring-boot-api/sample-app/deployer");
		try {
			tomcat.setPort(9999);
			tomcat.setHostname("localhost");
			tomcat.addWebapp(null,"/dubbo", "/Users/tangdu/git/spring-boot-api/sample-app/deployer/dubbo-admin-2.5.4.war");
			tomcat.start();
		} catch (Exception e) {
			try {
				tomcat.destroy();
			} catch (LifecycleException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
