package com.preferential.panning.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preferential.panning.user.dao.UserMapper;
import com.preferential.panning.user.entity.User;
import com.preferential.panning.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectByPhonePassword(String userPhone,String password) {
		return userMapper.selectByPhonePassword(userPhone,password);
	}

	
	public User selectUserInfoById(Integer id){
		return userMapper.selectUserInfoById(id);
	}
}
