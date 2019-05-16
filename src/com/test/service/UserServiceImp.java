package com.test.service;

import com.test.dao.UserDao;

public class UserServiceImp implements UserService{
	private UserDao userDao;
	@Override
	public void add() {
		userDao.add();
		System.out.println("UserServiceImp add");
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
