package com.tdu.sample.bus.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.tdu.sample.bus.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@PostConstruct
	public void  a(){
		System.out.println("0");
	}
	
	@Override
	public String hello() {
		return null;
	}

}
