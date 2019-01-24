package com.preferential.panning.user.service;

import com.preferential.panning.user.entity.User;

public interface UserService {

	User selectByPhonePassword(String userPhone,String password);
	User selectUserInfoById(Integer id);
}
