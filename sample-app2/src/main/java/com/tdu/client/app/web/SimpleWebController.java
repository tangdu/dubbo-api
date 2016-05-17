package com.tdu.client.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tdu.client.app.service.RoleService;

@Controller
@RequestMapping("/test")
public class SimpleWebController {

	@Autowired
	private RoleService roleService;

	@RequestMapping("/call")
	@ResponseBody
	public void execute() {
		roleService.getUser();
	}
}
