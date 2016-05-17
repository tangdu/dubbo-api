package com.tdu.sample.bus.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdu.sample.common.resp.Result;
import com.tdu.sample.common.util.CopyUtil;
import com.tdu.sample.dao.mapper.UserMapper;
import com.tdu.sample.facade.service.UserInfoFacade;
import com.tdu.sample.facade.vo.UserVo;
import com.tdu.sample.model.User;

@Service("userInfoFacade")
public class UserInfoFacadeImpl implements UserInfoFacade {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Result<List<UserVo>> findAllUser() {
		List<User> users = userMapper.findAll();
		List<UserVo> list = CopyUtil.copyByList(users, UserVo.class);
		return new Result<List<UserVo>>(list);
	}

}
