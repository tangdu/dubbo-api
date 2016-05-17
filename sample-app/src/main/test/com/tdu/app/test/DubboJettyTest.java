package com.tdu.app.test;

import java.io.File;

//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class DubboJettyTest {

	@Test
	public void run(){
//		try {
//			ResourceLoader loader = new DefaultResourceLoader();
//			Resource dir = loader.getResource("file:./deployer");
//			
//			Server server = new Server(9999);
//			WebAppContext webapp = new WebAppContext();
//			webapp.setContextPath("/dubboAdmin");
//			webapp.setWar(dir.getFile().getPath()+"/dubbo-admin-2.5.4.war");
//			webapp.setTempDirectory(new File(dir.getFile().getPath()+"/app"));
//			webapp.setExtractWAR(true);
//			server.setHandler(webapp);
//			server.start();
//			server.join();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
}
