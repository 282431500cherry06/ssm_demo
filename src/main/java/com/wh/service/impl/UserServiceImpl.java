package com.wh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wh.dao.UserMapper;
import com.wh.model.User;
import com.wh.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	@Override
	public User getUserById(int userId) {
		return userMapper.getUserById(userId);
	}

}
