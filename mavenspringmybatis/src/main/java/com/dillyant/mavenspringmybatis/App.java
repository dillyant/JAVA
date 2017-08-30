package com.dillyant.mavenspringmybatis;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.dillyant.model.User;
import com.dillyant.service.impl.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	private static Logger logger = Logger.getLogger(App.class);
	private static ApplicationContext ac;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserServiceImpl iuser = (UserServiceImpl) ac.getBean("userService");
		User user = iuser.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}
}
