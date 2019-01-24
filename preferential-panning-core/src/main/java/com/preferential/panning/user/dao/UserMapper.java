package com.preferential.panning.user.dao;

import org.apache.ibatis.annotations.Param;

import com.preferential.panning.user.entity.User;

/**
 * Dao interface
 */
public interface UserMapper{

	User selectByPhonePassword(@Param("userPhone")String userPhone,@Param("password")String password);
	User selectUserInfoById(Integer id);
}