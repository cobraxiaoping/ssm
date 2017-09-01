package com.cobra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cobra.pojo.SysUser;
import com.cobra.service.SysUserService;


@Controller
@RequestMapping("/cobra")
public class SysUserController {
	@Autowired
	private SysUserService userService;
	@RequestMapping("/user")
	@ResponseBody
	public SysUser testUser() {
		SysUser user = userService.getUser(6l);
		System.out.println(user.toString());
		return user;
	}
}
