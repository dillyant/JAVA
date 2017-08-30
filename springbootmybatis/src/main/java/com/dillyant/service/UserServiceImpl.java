package com.dillyant.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dillyant.dao.UserMapper;
import com.dillyant.model.User;
import com.dillyant.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		return this.userMapper.selectByPrimaryKey(userId);
	}

}
