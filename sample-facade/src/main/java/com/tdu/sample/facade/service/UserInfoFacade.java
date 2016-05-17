package com.tdu.sample.facade.service;

import java.util.List;

import com.tdu.sample.common.resp.Result;
import com.tdu.sample.facade.vo.UserVo;

public interface UserInfoFacade {

	public Result<List<UserVo>> findAllUser();
}
