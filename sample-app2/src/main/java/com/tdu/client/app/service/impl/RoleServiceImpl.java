package com.tdu.client.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdu.client.app.service.RoleService;
import com.tdu.sample.common.resp.BaseStateCode;
import com.tdu.sample.common.resp.Result;
import com.tdu.sample.common.util.JsonUtil;
import com.tdu.sample.facade.service.UserInfoFacade;
import com.tdu.sample.facade.vo.UserVo;

@Service
public class RoleServiceImpl implements RoleService {

	// 模拟添加用户
	@Override
	public void addRole() {

	}

	// 作为消费者
	@Autowired
	UserInfoFacade userInfoFacade;

	// 模拟得到用户
	@Override
	public void getUser() {
		long s=System.currentTimeMillis();
		Result<List<UserVo>> result = userInfoFacade.findAllUser();
		System.out.println(System.currentTimeMillis()-s);
		if (result.getStateCode() == BaseStateCode.SUCCESS.getCode()) {
			for (UserVo vo : result.getData()) {
				System.out.println(JsonUtil.toJson(vo));
			}
		} else {
			System.out.println("调用失败");
		}
	}

}
