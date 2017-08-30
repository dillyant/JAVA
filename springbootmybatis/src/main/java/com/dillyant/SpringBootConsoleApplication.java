package com.dillyant;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.fastjson.JSON;
import com.dillyant.model.User;
import com.dillyant.service.UserServiceImpl;

import static java.lang.System.exit;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan("com.dillyant.dao")
public class SpringBootConsoleApplication implements CommandLineRunner {
	private static Logger logger = Logger.getLogger(SpringBootConsoleApplication.class);
	@Resource
	private UserServiceImpl userService;

	@Override
	public void run(String... args) throws Exception {

		User user = userService.getUserById(1);
		logger.info(JSON.toJSONString(user));
		exit(0);
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

}
