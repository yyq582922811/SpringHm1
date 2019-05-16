package com.test.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.controller.UserController;

public class MyTest {
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean0.xml");
		UserController controller = (UserController)ac.getBean("userController");
		controller.add();
	}
}
