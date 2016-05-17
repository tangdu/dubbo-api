package com.tdu.sample.bus.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tdu.sample.dao.mapper.UserMapper;
import com.tdu.sample.model.User;

@Controller
@RequestMapping("/test")
public class SimpleController {

	@Autowired
	private UserMapper roleService;

	@RequestMapping("/call")
	@ResponseBody
	public List<User> execute() {
		return roleService.findAll();
	}
}
