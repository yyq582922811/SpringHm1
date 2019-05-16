package com.test.controller;

import com.test.service.UserService;

public class UserControllerImp implements UserController {
	private UserService userService;
	@Override
	public void add() {
		userService.add();
		System.out.println("UserControllerImp add");
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
