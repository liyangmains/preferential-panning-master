package com.preferential.panning.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.preferential.panning.user.entity.User;
import com.preferential.panning.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public User getUserInfo(@PathVariable Integer id){
		User user = userService.selectUserInfoById(id);
		return user;
	}
}
