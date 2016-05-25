package com.app2.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.run.Application;
import com.tdu.sample.common.resp.Result;
import com.tdu.sample.common.util.JsonUtil;
import com.tdu.sample.facade.service.UserInfoFacade;
import com.tdu.sample.facade.vo.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class DubboRpcTest {

	@Autowired
	private ApplicationConfig applicationConfig;

	@Autowired
	private RegistryConfig registryConfig;
	

	@Test
	public void 泛化调用Dubbo() {
		String fac = "com.tdu.sample.facade.service.UserInfoFacade";
		List<RegistryConfig> list = applicationConfig.getRegistries();
		System.out.println(registryConfig.getAddress());
		System.out.println(list);
		
		ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
		reference.setApplication(applicationConfig);
		reference.setAsync(false);
		reference.setCheck(false);
		reference.setGeneric(true);
		reference.setTimeout(3000);
		reference.setVersion("1.0.0");
		reference.setInterface(fac);
		reference.setRegistry(registryConfig);
		long s=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			reference.get().$invoke("findAllUser", null, null);
		}
		long e=System.currentTimeMillis();
		System.out.println(e-s);
	}
	
	
	@Test
	public void 接口调用Dubbo() {
		String fac = "com.tdu.sample.facade.service.UserInfoFacade";
		List<RegistryConfig> list = applicationConfig.getRegistries();
		System.out.println(registryConfig.getAddress());
		System.out.println(list);
		
		ReferenceConfig<UserInfoFacade> reference = new ReferenceConfig<>();
		reference.setApplication(applicationConfig);
		reference.setAsync(false);
		reference.setCheck(false);
		reference.setGeneric(false);
		reference.setTimeout(3000);
		reference.setVersion("1.0.0");
		reference.setInterface(fac);
		reference.setRegistry(registryConfig);
		
		long s=System.currentTimeMillis();
		for(int i=0;i<100000;i++){
			Result<List<UserVo>> obj = reference.get().findAllUser();
		}
		long e=System.currentTimeMillis();
		System.out.println(e-s);
	}
	
}
